package com.basic.fileconverter.model.reportingFI;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "DocSpec" )
@XmlType(name = "DocSpec",propOrder = {
        "docTypeIndic",
        "docRefId"
})
public class DocSpec {


    private String docTypeIndic;

    private String docRefId;


    public DocSpec(String docTypeIndic, String docRefId) {
        this.docTypeIndic = docTypeIndic;
        this.docRefId = docRefId;
    }

    public DocSpec() {
    }

    @XmlElement(name = "DocTypeIndic", namespace = "urn:oecd:ties:crsstf:v5")
    public String getDocTypeIndic() {
        return docTypeIndic;
    }

    public void setDocTypeIndic(String docTypeIndic) {
        this.docTypeIndic = docTypeIndic;
    }

    @XmlElement(name = "DocRefId", namespace = "urn:oecd:ties:crsstf:v5")
    public String getDocRefId() {
        return docRefId;
    }

    public void setDocRefId(String docRefId) {
        this.docRefId = docRefId;
    }
}
