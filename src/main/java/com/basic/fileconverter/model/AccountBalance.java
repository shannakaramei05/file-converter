package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "AccountBalance", namespace = "crs")
public class AccountBalance {

    private String currCode;
    private String value;

    public AccountBalance(String currCode, String value) {
        this.currCode = currCode;
        this.value = value;
    }

    public AccountBalance() {
    }

    @XmlAttribute(name = "currCode")
    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
