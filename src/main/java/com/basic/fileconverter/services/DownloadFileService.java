package com.basic.fileconverter.services;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface DownloadFileService {
    void makeXmlFile (String excelFilePath, String xmlFilePath) throws IOException, ParserConfigurationException, TransformerException;

}
