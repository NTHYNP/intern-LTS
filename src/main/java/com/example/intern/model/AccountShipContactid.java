package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accountshipcontactid")
public class AccountShipContactid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountshipcontactstatusid")
    private Integer accountShipContactStatusId;
    @Column(name = "accountshipcontactid")
    private Integer accountShipContactId;
    @Column(name = "accountshipcontactcode")
    private String accountShipContactCode;
    @Column(name = "accountshipcontactdetail")
    private String accountShipContactDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "accountShipContactid")
    @JsonManagedReference
    private Set<AccountShipContact> accountShipContacts;

    public Integer getAccountShipContactStatusId() {
        return accountShipContactStatusId;
    }

    public void setAccountShipContactStatusId(Integer accountShipContactStatusId) {
        this.accountShipContactStatusId = accountShipContactStatusId;
    }

    public Integer getAccountShipContactId() {
        return accountShipContactId;
    }

    public void setAccountShipContactId(Integer accountShipContactId) {
        this.accountShipContactId = accountShipContactId;
    }

    public String getAccountShipContactCode() {
        return accountShipContactCode;
    }

    public void setAccountShipContactCode(String accountShipContactCode) {
        this.accountShipContactCode = accountShipContactCode;
    }

    public String getAccountShipContactDetail() {
        return accountShipContactDetail;
    }

    public void setAccountShipContactDetail(String accountShipContactDetail) {
        this.accountShipContactDetail = accountShipContactDetail;
    }

    public Set<AccountShipContact> getAccountShipContacts() {
        return accountShipContacts;
    }

    public void setAccountShipContacts(Set<AccountShipContact> accountShipContacts) {
        this.accountShipContacts = accountShipContacts;
    }
}
