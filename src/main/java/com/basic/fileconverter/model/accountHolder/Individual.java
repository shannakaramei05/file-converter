package com.basic.fileconverter.model.accountHolder;

import com.basic.fileconverter.model.BirthInfo;
import com.basic.fileconverter.model.UserFullName;
import com.basic.fileconverter.model.reportingFI.Address;
import com.basic.fileconverter.model.reportingFI.TIN;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Individual", namespace = "crs")
@XmlType(name = "Individual", propOrder = {
        "resCountryCode",
        "tin",
        "name",
        "address",
        "nationality",
        "birthInfo",
})
public class Individual {

    private String resCountryCode;
    private TIN tin;
    private UserFullName name;
    private Address address;
    private String nationality;
    private BirthInfo birthInfo;

    public Individual(String resCountryCode, TIN tin, UserFullName name, Address address, String nationality, BirthInfo birthInfo) {
        this.resCountryCode = resCountryCode;
        this.tin = tin;
        this.name = name;
        this.address = address;
        this.nationality = nationality;
        this.birthInfo = birthInfo;
    }

    public Individual() {
    }

    @XmlElement(name = "ResCountryCode")
    public String getResCountryCode() {
        return resCountryCode;
    }

    public void setResCountryCode(String resCountryCode) {
        this.resCountryCode = resCountryCode;
    }

    @XmlElement(name = "IN")
    public TIN getTin() {
        return tin;
    }

    public void setTin(TIN tin) {
        this.tin = tin;
    }

    @XmlElement(name = "Name")
    public UserFullName getName() {
        return name;
    }

    public void setName(UserFullName name) {
        this.name = name;
    }

    @XmlElement(name = "Address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @XmlElement(name = "Nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @XmlElement(name = "BirthInfo")
    public BirthInfo getBirthInfo() {
        return birthInfo;
    }

    public void setBirthInfo(BirthInfo birthInfo) {
        this.birthInfo = birthInfo;
    }
}
