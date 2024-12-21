package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BirthInfo",namespace = "crs")
public class BirthInfo {

    private String birthDate;

    public BirthInfo(String birthDate) {
        this.birthDate = birthDate;
    }

    public BirthInfo() {
    }
    @XmlElement(name = "BirthDate")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
