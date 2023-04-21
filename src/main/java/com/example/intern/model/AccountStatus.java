package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "accountstatus")
public class AccountStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountstatusid")
    private Integer accountStatusId;
    @Column(name = "accountsatuscode")
    private String accountStatusCode;
    @Column(name = "accountstatusdetail")
    private String accountStatusDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "accountStatus")
    @JsonManagedReference
    private Set<Accounts> accounts;

    public Integer getAccountStatusId() {
        return accountStatusId;
    }

    public void setAccountStatusId(Integer accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    public String getAccountStatusCode() {
        return accountStatusCode;
    }

    public void setAccountStatusCode(String accountStatusCode) {
        this.accountStatusCode = accountStatusCode;
    }

    public String getAccountStatusDetail() {
        return accountStatusDetail;
    }

    public void setAccountStatusDetail(String accountStatusDetail) {
        this.accountStatusDetail = accountStatusDetail;
    }

    public Set<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Accounts> accounts) {
        this.accounts = accounts;
    }
}
