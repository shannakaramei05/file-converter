package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "CRS_OECD", namespace = "urn:oecd:ties:crs:v2")
@XmlType(name = "CRS_OECD", propOrder = {
        "messageSpec",
        "crsBody"
})
public class CRSOECD {
    private MessageSpec messageSpec;
    private CrsBody crsBody;

    public CRSOECD(MessageSpec messageSpec, CrsBody crsBody) {
        this.messageSpec = messageSpec;
        this.crsBody = crsBody;
    }

    public CRSOECD() {
    }

    @XmlElement(name="MessageSpec")
    public MessageSpec getMessageSpec() {
        return messageSpec;
    }

    public void setMessageSpec(MessageSpec messageSpec) {
        this.messageSpec = messageSpec;
    }

    @XmlElement(name="CrsBody")
    public CrsBody getCrsBody() {
        return crsBody;
    }

    public void setCrsBody(CrsBody crsBody) {
        this.crsBody = crsBody;
    }
}
