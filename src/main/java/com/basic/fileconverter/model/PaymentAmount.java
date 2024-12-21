package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PaymentAmnt",namespace = "crs")
public class PaymentAmount {

    private String value;
    private String currCode;

    public PaymentAmount(String value, String currCode) {
        this.value = value;
        this.currCode = currCode;
    }

    public PaymentAmount() {
    }

    @XmlElement
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute(name = "currCode")
    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }
}
