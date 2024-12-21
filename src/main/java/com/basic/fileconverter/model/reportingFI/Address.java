package com.basic.fileconverter.model.reportingFI;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Address")
public class Address {

    private String countryCode;
    private String addressFree;

    private String legalAddressType;

    public Address(String countryCode, String addressFree, String legalAddressType) {
        this.countryCode = countryCode;
        this.addressFree = addressFree;
        this.legalAddressType = legalAddressType;
    }

    public Address() {
    }

    @XmlElement(name="CountryCode", namespace = "urn:oecd:ties:commontypesfatcacrs:v2")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @XmlElement(name="AddressFree", namespace = "urn:oecd:ties:commontypesfatcacrs:v2")
    public String getAddressFree() {
        return addressFree;
    }

    public void setAddressFree(String addressFree) {
        this.addressFree = addressFree;
    }

    @XmlAttribute(name = "legalAddressType")
    public String getLegalAddressType() {
        return legalAddressType;
    }

    public void setLegalAddressType(String legalAddressType) {
        this.legalAddressType = legalAddressType;
    }
}
