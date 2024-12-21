package com.basic.fileconverter.model.reportingFI;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "IN", namespace = "crs")
public class TIN {

    private String value;
    private String issuedBy;


    public TIN(String value, String issuedBy) {
        this.value = value;
        this.issuedBy = issuedBy;
    }

    public TIN() {
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute(name = "issuedBy")
    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }
}
