package com.basic.fileconverter.services.impl;

import com.basic.fileconverter.model.*;
import com.basic.fileconverter.model.accountHolder.Individual;
import com.basic.fileconverter.model.reportingFI.Address;
import com.basic.fileconverter.model.reportingFI.DocSpec;
import com.basic.fileconverter.model.reportingFI.ReportingFI;
import com.basic.fileconverter.model.reportingFI.TIN;
import com.basic.fileconverter.services.ConverterService;
import com.basic.fileconverter.utils.CommonUtils;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.apache.poi.ss.usermodel.*;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConverterServiceImpl implements ConverterService {

    @Override
    public void convertExcelToXml(String excelFilePath, String xmlFilePath, String corpDetail) throws IOException, ParserConfigurationException, TransformerException {

        FileInputStream fis = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0); // account report
        Sheet sheetTin = workbook.getSheetAt(1); //acc Rep TIN- Individual
        Sheet sheetRepOrg = workbook.getSheetAt(2); //acc Rep IN-Organisation
        Sheet sheetRepIndvNm = workbook.getSheetAt(3); //acc rep name Individual
        Sheet sheetRepNmOrg = workbook.getSheetAt(4);// acc Rep Name-Organization
        Sheet sheetRepAddr = workbook.getSheetAt(5); // acc Rep Address
        Sheet sheetRepPayment = workbook.getSheetAt(6);// acc Rep Payment



        //FOR COORPORATE
        FileInputStream corpInp = new FileInputStream(new File(corpDetail));
        Workbook fiReportWorkbook = WorkbookFactory.create(corpInp);
        Sheet fiReportSheet1 = fiReportWorkbook.getSheetAt(0); // Reporting FI
        Sheet fiReportSheet2 = fiReportWorkbook.getSheetAt(1); //Rep FI IN
        Sheet fiReportSheet3 = fiReportWorkbook.getSheetAt(2); //Reporting FI Name
        Sheet fiReportSheet4 = fiReportWorkbook.getSheetAt(3); //Reporting FI Addr


        //if all data is from row 1
        String sendingCompanyIn = getCellValue(fiReportSheet2.getRow(1),1);
        String transmittingCountry =  getCellValue(fiReportSheet2.getRow(1),2);


        //CREATE TO HEADER [ HARD CODE -- NO INFO IN EXCELL ]
        MessageSpec messageSpec = new MessageSpec(
                "0000000000000001",
                "ID",
                "KR",
                "QER",
                "Nerd Jhon Bakabakakayow",
                "ID_0000010010101_KR-20202",
                "QWE001",
                "2022-12-31",
                "2023-07-27T08:49:37.320"
        );



        //GET Address FOR Organization. [ SHEET ?? ]
        //SET TO ADDR OUR BANK
        String corpContryCd = getCellValue(fiReportSheet4.getRow(1),2);
        String corpAddressFree = getCellValue(fiReportSheet4.getRow(1),3);
        String corLedgalAddrType = getCellValue(fiReportSheet4.getRow(1),1);

        Address address = new Address(
                corpContryCd,
                corpAddressFree,
                corLedgalAddrType);

        String docReffIdReportingFi = getCellValue(fiReportSheet3.getRow(1),0);
        String corName = getCellValue(fiReportSheet3.getRow(1),1);
        String corpType = getCellValue(fiReportSheet3.getRow(1),2);

        DocSpec orgDocSpec = new DocSpec(corpType,docReffIdReportingFi);
        TIN orgIn = new TIN(sendingCompanyIn,corpContryCd);
        // Create ReportingFI --> from other sheet
        ReportingFI reportingFI = new ReportingFI(corpContryCd,orgIn,corName,address,orgDocSpec);


        //LISTING ALL VALUE ACCOUNT REPORT
        List<AccountReport> accountReportList = new ArrayList<>();


        //Get Row Data
        int lastDataRow = CommonUtils.findLastDataRow(sheet);

        System.out.println(lastDataRow);
        //assume data start from index 1 -> line 2 excel
        for (int i = 1; i < lastDataRow; i++) {

            //DOCSPEC USING IN LOOP
            Row row1 = sheet.getRow(i); //SHEET ONE

            String docRefId = getCellValue(row1,0);
            String docTypeIndic = "OECD1";

            String nationalityIndividual = getCellValue(row1,8);
            String userResCountryCd =  getCellValue(row1,7);
            DocSpec docSpec = new DocSpec(docTypeIndic,docRefId);


            String birthDateIndv = getCellValue(row1,11);
            BirthInfo birthInfo = new BirthInfo(birthDateIndv);


            //Account INfo
            boolean undocumentedAccount = !getCellValue(row1, 2) .equals("N");
            boolean closedAccount = !getCellValue(row1, 3) .equals("N");
            boolean dormantAccount = !getCellValue(row1, 4) .equals("N");
            String accountNumber = getCellValue(row1,1);
            AccountNumber accountNumUserInfo = new AccountNumber(undocumentedAccount,closedAccount,dormantAccount,accountNumber);


            //AccountBalance
            String curCodeActBal = getCellValue(row1,9);
            String accountBalance = getCellValue(row1,10);
            AccountBalance userAccountBalance = new AccountBalance(curCodeActBal,accountBalance);


            //SHEET  2 ??
            Row rowTin = sheetTin.getRow(i); //SHEET ONE
            String tinIssuiedBy = getCellValue(rowTin,2);
            String tinValue = getCellValue(rowTin,1);
            TIN in = new TIN(tinIssuiedBy, tinValue);


            //Username
            Row userIndvRow = sheetRepIndvNm.getRow(i);
            String firstName = getCellValue(userIndvRow,1);
            String middleName = getCellValue(userIndvRow,2);
            String lastName = getCellValue(userIndvRow,3);
            String nameType =getCellValue(userIndvRow,4);
            UserFullName userFullName = new UserFullName(firstName,middleName,lastName,nameType);


            //Address User [Sheet 6]
            Row userAddrRow = sheetRepAddr.getRow(i);
            String usrLegAddr = getCellValue(userAddrRow,1).trim();
            String usrCountryCd = getCellValue(userAddrRow,2);
            String usrAddrFree = getCellValue(userAddrRow,3);
            Address userAddr = new Address(usrLegAddr, usrCountryCd, usrAddrFree);


            //Payment Shee 7
            Row userPaymentRow = sheetRepPayment.getRow(i);
            String paymentCurCode = getCellValue(userPaymentRow,2);
            String paymentAmount =getCellValue(userPaymentRow,3);
            String paymentType =  getCellValue(userPaymentRow,1);
            PaymentAmount paymentUserInfo = new PaymentAmount(paymentAmount,paymentCurCode);
            Payment payment = new Payment(paymentType,paymentUserInfo);

            //for Holder
            Individual individual = new Individual(
                    userResCountryCd,
                    in,
                    userFullName,
                    userAddr,
                    nationalityIndividual,
                    birthInfo
            );

            AccountHolder accountHolder = new AccountHolder(individual);
            AccountReport accountReport = new AccountReport(
                    docSpec,
                    accountNumUserInfo,
                    accountHolder,
                    userAccountBalance,
                    payment
            );


            accountReportList.add(accountReport);
        }

        ReportingGroup reportingGroup = new ReportingGroup(accountReportList);

        CrsBody crsBody = new CrsBody(reportingFI,reportingGroup);
        CRSOECD crsoecd = new CRSOECD(messageSpec,crsBody);

        try{
            JAXBContext context = JAXBContext.newInstance(CRSOECD.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(crsoecd,System.out);
            marshaller.marshal(crsoecd,new File(xmlFilePath));
        }catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String convertObjectToXml(Object object) throws JAXBException {
        // Create a JAXBContext for the class of the object
        JAXBContext context = JAXBContext.newInstance(object.getClass());

        // Create a marshaller
        Marshaller marshaller = context.createMarshaller();

        // Set formatting for better readability
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Convert the object to a string
        StringWriter writer = new StringWriter();
        marshaller.marshal(object, writer);

        return writer.toString();
    }

    private static String getCellValue(Row row, int cellIndex) {
        if (row == null || row.getCell(cellIndex) == null) return "";
        Cell cell = row.getCell(cellIndex);
        return switch (cell.getCellType()) {
            case STRING -> cell.getStringCellValue();
            case NUMERIC -> String.valueOf((int) cell.getNumericCellValue());
            default -> "";
        };
    }

    // Utility to create XML element
    private static void createElement(Document doc,  Element parent, String prefix, String tagName, String value) {
        Element element = doc.createElement(prefix+":"+tagName);
        element.appendChild(doc.createTextNode(value));
        parent.appendChild(element);
    }
}
