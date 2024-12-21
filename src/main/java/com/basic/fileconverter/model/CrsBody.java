package com.basic.fileconverter.model;

import com.basic.fileconverter.model.reportingFI.ReportingFI;
import jakarta.xml.bind.annotation.*;

//@XmlRootElement(name = "CrsBody")
@XmlRootElement(name = "CrsBody",namespace = "crs")
public class CrsBody {

    private ReportingFI reportingFI;

    private ReportingGroup reportingGroup;

    public CrsBody(ReportingFI reportingFI, ReportingGroup reportingGroup) {
        this.reportingFI = reportingFI;
        this.reportingGroup = reportingGroup;
    }

    public CrsBody() {
    }

    @XmlElement(name = "ReportingFI")
    public ReportingFI getReportingFI() {
        return reportingFI;
    }

    public void setReportingFI(ReportingFI reportingFI) {
        this.reportingFI = reportingFI;
    }

    @XmlElement(name = "ReportingGroup")
    public ReportingGroup getReportingGroup() {
        return reportingGroup;
    }

    public void setReportingGroup(ReportingGroup reportingGroup) {
        this.reportingGroup = reportingGroup;
    }
}
