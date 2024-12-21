package com.basic.fileconverter;

import com.basic.fileconverter.services.ConverterService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileConverterApplication {

    private static  ConverterService converterService;
    public FileConverterApplication(ConverterService converterService) {
        this.converterService = converterService;
    }

    public static void main(String[] args) {
        SpringApplication.run(FileConverterApplication.class, args);

        String excelFilePath = "C:/Users/rahmatcs/Documents/EXCELL/Account Report_2022.xlsx"; // Path to your Excel file
        String xmlFilePath = "C:/Users/rahmatcs/Documents/EXCELL/output.xml";   // Output XML file path
        String corpExcelPath = "C:/Users/rahmatcs/Documents/EXCELL/reporting file.xlsx";

        try {
            converterService.convertExcelToXml(excelFilePath, xmlFilePath, corpExcelPath);
            System.out.println("File converted successfully: " + xmlFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        test();


    }


//    public static  void test() {
//        try {
//            MessageSpec messageSpec = new MessageSpec(
//                    "013040837038000",
//                    "ID",
//                    "MY",
//                    "CRS",
//                    "Tuan RISMA SATYAJI_08568902080",
//                    "ID2022MY_013040837038000_001",
//                    "CRS701",
//                    "2022-12-31",
//                    "2023-07-27T08:49:37.320"
//            );
//
//
//
//            // Create Address
//            Address address = new Address("OECD303", "ID", "Merdeka PT");
//            DocSpec docSpec = new DocSpec("OECD1","ID2022MY_013040837038000_001_DI_FI_02000");
//            // Create IN
//            TIN in = new TIN("ID", "013040837038000");
//
//            // Create ReportingFI
//            ReportingFI reportingFI = new ReportingFI("ID",in,"MERDEKA",address,docSpec);
//
//
//            //Username
//            UserFullName userFullName = new UserFullName("NGOI","CHEE","HIEN","OECD202");
//
//            //for Holder
//            Individual individual = new Individual();
//
//            AccountNumber accountNumber = new AccountNumber(false,false,false,"114222100018212");
//            AccountBalance accountBalance = new AccountBalance("IDR","95383862.28");
//
//            PaymentAmount paymentAmount = new PaymentAmount("IDR","837856.00");
//            Payment payment = new Payment("CRS502",paymentAmount);
//
//            AccountHolder accountHolder = new AccountHolder();
//
//            List<AccountReport> accountReportList = new ArrayList<>();
//
//            AccountReport accountReport1 = new AccountReport(docSpec,accountNumber,accountHolder,accountBalance,payment);
//            AccountReport accountReport2 = new AccountReport(docSpec,accountNumber,accountHolder,accountBalance,payment);
//
//
//            accountReportList.add(accountReport1);
//            accountReportList.add(accountReport2);
//
//            ReportingGroup reportingGroup = new ReportingGroup();
//            reportingGroup.setAccountReportList(accountReportList);
//
//
//
//            CrsBody crsBody = new CrsBody(reportingFI,reportingGroup);
//            CRSOECD crsoecd = new CRSOECD(messageSpec,crsBody);
//
//            // Serialize to XML
//            JAXBContext context = JAXBContext.newInstance(CRSOECD.class);
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//
//            marshaller.marshal(crsoecd, System.out);
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//    }

}
