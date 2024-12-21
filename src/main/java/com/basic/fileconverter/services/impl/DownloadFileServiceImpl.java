package com.basic.fileconverter.services.impl;

import com.basic.fileconverter.services.DownloadFileService;
import org.springframework.stereotype.Service;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import java.io.IOException;

@Service
public class DownloadFileServiceImpl implements DownloadFileService {
    @Override
    public void makeXmlFile(String excelFilePath, String xmlFilePath) throws IOException, ParserConfigurationException, TransformerException {

    }
}
