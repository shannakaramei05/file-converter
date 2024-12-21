package com.basic.fileconverter.services;

import jakarta.xml.bind.JAXBException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface ConverterService {

    void convertExcelToXml (String excelFilePath, String xmlFilePath, String corpDetail) throws IOException, ParserConfigurationException, TransformerException;

    String convertObjectToXml(Object object) throws JAXBException;
}
