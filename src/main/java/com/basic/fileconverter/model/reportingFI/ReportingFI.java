package com.basic.fileconverter.model.reportingFI;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchema;

@XmlRootElement(name = "ReportingFI", namespace = "crs")
public class ReportingFI {

    private String resCountryCode;
    private TIN TIN;
    private String orgName;
    private Address address;
    private DocSpec docSpec;

    public ReportingFI() {
    }

    public ReportingFI(String resCountryCode, com.basic.fileconverter.model.reportingFI.TIN TIN, String orgName, Address address, DocSpec docSpec) {
        this.resCountryCode = resCountryCode;
        this.TIN = TIN;
        this.orgName = orgName;
        this.address = address;
        this.docSpec = docSpec;
    }

    @XmlElement(name = "ResCountryCode")
    public String getResCountryCode() {
        return resCountryCode;
    }

    public void setResCountryCode(String resCountryCode) {
        this.resCountryCode = resCountryCode;
    }
    @XmlElement(name = "TIN")
    public TIN getIn() {
        return TIN;
    }

    public void setIn(TIN TIN) {
        this.TIN = TIN;
    }

    @XmlElement(name = "Name")
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @XmlElement(name = "Address")
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @XmlElement(name = "DocSpec")
    public DocSpec getDocSpec() {
        return docSpec;
    }

    public void setDocSpec(DocSpec docSpec) {
        this.docSpec = docSpec;
    }
}
