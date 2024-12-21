package com.basic.fileconverter.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "AccountNumber",namespace = "crs")
public class AccountNumber {

    private boolean undocumentedAccount; // Attribute
    private boolean closedAccount;       // Attribute
    private boolean dormantAccount;      // Attribute
    private String value;                // Value of the element

    public AccountNumber() {}

    public AccountNumber(boolean undocumentedAccount, boolean closedAccount, boolean dormantAccount, String value) {
        this.undocumentedAccount = undocumentedAccount;
        this.closedAccount = closedAccount;
        this.dormantAccount = dormantAccount;
        this.value = value;
    }

    @XmlAttribute(name = "UndocumentedAccount")
    public boolean isUndocumentedAccount() {
        return undocumentedAccount;
    }

    public void setUndocumentedAccount(boolean undocumentedAccount) {
        this.undocumentedAccount = undocumentedAccount;
    }

    @XmlAttribute(name = "ClosedAccount")
    public boolean isClosedAccount() {
        return closedAccount;
    }

    public void setClosedAccount(boolean closedAccount) {
        this.closedAccount = closedAccount;
    }

    @XmlAttribute(name = "DormantAccount")
    public boolean isDormantAccount() {
        return dormantAccount;
    }

    public void setDormantAccount(boolean dormantAccount) {
        this.dormantAccount = dormantAccount;
    }

    @XmlValue // Inner value of the element
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
