package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "ReportingGroup",namespace = "crs")
public class ReportingGroup {

    private List<AccountReport> accountReportList;


    public ReportingGroup(List<AccountReport> accountReportList) {
        this.accountReportList = accountReportList;
    }

    public ReportingGroup() {
    }

    @XmlElement(name = "AccountReport")
    public List<AccountReport> getAccountReportList() {
        return accountReportList;
    }

    public void setAccountReportList(List<AccountReport> accountReportList) {
        this.accountReportList = accountReportList;
    }
}
