package com.basic.fileconverter.model;

import com.basic.fileconverter.model.accountHolder.Individual;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AccountHolder",namespace = "crs")
public class AccountHolder {

    private Individual individual;

    public AccountHolder(Individual individual) {
        this.individual = individual;
    }

    public AccountHolder() {
    }

    @XmlElement(name = "Individual")
    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual individual) {
        this.individual = individual;
    }
}
