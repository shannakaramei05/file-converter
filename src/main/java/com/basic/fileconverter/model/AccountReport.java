package com.basic.fileconverter.model;

import com.basic.fileconverter.model.reportingFI.DocSpec;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AccountReport",namespace = "crs")
public class AccountReport {

    private DocSpec docSpec;
    private AccountNumber accountNumber;
    private AccountHolder accountHolder;
    private AccountBalance accountBalance;
    private Payment payment;

    public AccountReport(DocSpec docSpec, AccountNumber accountNumber, AccountHolder accountHolder, AccountBalance accountBalance, Payment payment) {
        this.docSpec = docSpec;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.payment = payment;
    }

    public AccountReport() {
    }

    @XmlElement(name = "DocSpec")
    public DocSpec getDocSpec() {
        return docSpec;
    }

    public void setDocSpec(DocSpec docSpec) {
        this.docSpec = docSpec;
    }
    @XmlElement(name = "AccountNumber")
    public AccountNumber getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(AccountNumber accountNumber) {
        this.accountNumber = accountNumber;
    }

    @XmlElement(name = "AccountHolder")
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    @XmlElement(name = "AccountBalance")
    public AccountBalance getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(AccountBalance accountBalance) {
        this.accountBalance = accountBalance;
    }

    @XmlElement(name = "Payment")
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
