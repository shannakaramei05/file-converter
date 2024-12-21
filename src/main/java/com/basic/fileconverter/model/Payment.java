package com.basic.fileconverter.model;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Payment", namespace = "crs")
public class Payment {

    private String paymentType;

    private PaymentAmount paymentAmount;

    public Payment(String paymentType, PaymentAmount paymentAmount) {
        this.paymentType = paymentType;
        this.paymentAmount = paymentAmount;
    }

    public Payment() {
    }

    @XmlElement(name = "Type")
    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @XmlElement(name = "PaymentAmnt")
    public PaymentAmount getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(PaymentAmount paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
