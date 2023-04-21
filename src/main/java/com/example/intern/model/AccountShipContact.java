package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accountshipcontact")
public class AccountShipContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountshipcontactid")
    private Integer accountShipContactId;
    @Column(name = "accountid")
    private Integer accountID;
    @Column(name = "receivername")
    private String receiverName;
    @Column(name = "accountdetailaddress")
    private String accountDetailAddress;
    @Column(name = "accountphonenumber")
    private String accountPhoneNumber;
    @Column(name = "accountshipcontactstatusid")
    private Integer accountShipContactStatusid;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "accountShipContact")
    @JsonManagedReference
    private Set<Bill> bills;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "accountid",insertable = false,updatable = false)
    private Accounts accounts;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "accountshipcontactstatusid",insertable = false,updatable = false)
    private AccountShipContactid accountShipContactid;


    public Integer getAccountShipContactId() {
        return accountShipContactId;
    }

    public void setAccountShipContactId(Integer accountShipContactId) {
        this.accountShipContactId = accountShipContactId;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getAccountDetailAddress() {
        return accountDetailAddress;
    }

    public void setAccountDetailAddress(String accountDetailAddress) {
        this.accountDetailAddress = accountDetailAddress;
    }

    public String getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public void setAccountPhoneNumber(String accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
    }

    public Integer getAccountShipContactStatusid() {
        return accountShipContactStatusid;
    }

    public void setAccountShipContactStatusid(Integer accountShipContactStatusid) {
        this.accountShipContactStatusid = accountShipContactStatusid;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public AccountShipContactid getAccountShipContactid() {
        return accountShipContactid;
    }

    public void setAccountShipContactid(AccountShipContactid accountShipContactid) {
        this.accountShipContactid = accountShipContactid;
    }
}
