package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Name",namespace = "crs")
public class UserFullName {


    private String firstName;


    private String middleName;


    private String lastName;

    private String nameType;

    public UserFullName(String firstName, String middleName, String lastName, String nameType) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nameType = nameType;
    }

    public UserFullName() {
    }

    @XmlElement(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @XmlElement(name = "LastName")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @XmlElement(name = "LastName")

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @XmlAttribute(name = "nameType")
    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }
}
