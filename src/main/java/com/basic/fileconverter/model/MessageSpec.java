package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "MessageSpec",namespace = "crs")
@XmlType(name = "MessageSpec", propOrder = {
        "sendingCompanyIn",
        "transmittingCountry",
        "receivingCountry",
        "messageType",
        "contact",
        "messageRefId",
        "messageTypeIndic",
        "reportingPeriod",
        "timeStamp",
})
public class MessageSpec {


    private String sendingCompanyIn;

    private String transmittingCountry;

    private String receivingCountry;

    private String messageType;

    private String contact;

    private String messageRefId;

    private String messageTypeIndic;

    private String reportingPeriod;

    private String timeStamp;

    public MessageSpec() {
    }

    public MessageSpec(String sendingCompanyIn, String transmittingCountry, String receivingCountry, String messageType, String contact, String messageRefId, String messageTypeIndic, String reportingPeriod, String timeStamp) {
        this.sendingCompanyIn = sendingCompanyIn;
        this.transmittingCountry = transmittingCountry;
        this.receivingCountry = receivingCountry;
        this.messageType = messageType;
        this.contact = contact;
        this.messageRefId = messageRefId;
        this.messageTypeIndic = messageTypeIndic;
        this.reportingPeriod = reportingPeriod;
        this.timeStamp = timeStamp;
    }

    @XmlElement(name = "SendingCompanyIN")
    public String getSendingCompanyIn() {
        return sendingCompanyIn;
    }

    public void setSendingCompanyIn(String sendingCompanyIn) {
        this.sendingCompanyIn = sendingCompanyIn;
    }

    @XmlElement(name = "TransmittingCountry")
    public String getTransmittingCountry() {
        return transmittingCountry;
    }

    public void setTransmittingCountry(String transmittingCountry) {
        this.transmittingCountry = transmittingCountry;
    }

    @XmlElement(name = "ReceivingCountry")
    public String getReceivingCountry() {
        return receivingCountry;
    }

    public void setReceivingCountry(String receivingCountry) {
        this.receivingCountry = receivingCountry;
    }

    @XmlElement(name = "MessageType")
    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @XmlElement(name = "Contact")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @XmlElement(name = "MessageRefId")
    public String getMessageRefId() {
        return messageRefId;
    }

    public void setMessageRefId(String messageRefId) {
        this.messageRefId = messageRefId;
    }

    @XmlElement(name = "MessageTypeIndic")
    public String getMessageTypeIndic() {
        return messageTypeIndic;
    }

    public void setMessageTypeIndic(String messageTypeIndic) {
        this.messageTypeIndic = messageTypeIndic;
    }

    @XmlElement(name = "ReportingPeriod")
    public String getReportingPeriod() {
        return reportingPeriod;
    }

    public void setReportingPeriod(String reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    @XmlElement(name = "Timestamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
