package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "account")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountid")
    private Integer accountId;

    @Column(name = "accountusername")
    private String accountUserName;
    @Column(name = "accountpassword")
    private String accountPassword;
    @Column(name = "accountstatusid")
    private Integer accountStatusId;
    @Column(name = "accountname")
    private String accountName;
    @Column(name = "accountborn")
    private Date accountBorn;
    @Column(name = "accountcreatedate")
    private Date accountCreateDate;
    @Column(name = "roleid")
    private Integer roleId;
    @Column(name = "createdate")
    private Date createDate;
    @Column(name = "updatedate")
    private Date updateDate;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "accountstatusid",insertable = false,updatable = false)
    private AccountStatus accountStatus;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "roleid",insertable = false, updatable = false)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "accounts")
    @JsonManagedReference
    private Set<AccountBag> accountBags;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "accounts")
    @JsonManagedReference
    private Set<AccountShipContact> accountShipContacts;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "accounts")
    @JsonManagedReference
    private Set<VoteStar> voteStars;

    public Set<AccountShipContact> getAccountShipContacts() {
        return accountShipContacts;
    }

    public void setAccountShipContacts(Set<AccountShipContact> accountShipContacts) {
        this.accountShipContacts = accountShipContacts;
    }

    public Set<VoteStar> getVoteStars() {
        return voteStars;
    }

    public void setVoteStars(Set<VoteStar> voteStars) {
        this.voteStars = voteStars;
    }

    public Set<AccountBag> getAccountBags() {
        return accountBags;
    }

    public void setAccountBags(Set<AccountBag> accountBags) {
        this.accountBags = accountBags;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public Integer getAccountStatusId() {
        return accountStatusId;
    }

    public void setAccountStatusId(Integer accountStatusId) {
        this.accountStatusId = accountStatusId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getAccountBorn() {
        return accountBorn;
    }

    public void setAccountBorn(Date accountBorn) {
        this.accountBorn = accountBorn;
    }

    public Date getAccountCreateDate() {
        return accountCreateDate;
    }

    public void setAccountCreateDate(Date accountCreateDate) {
        this.accountCreateDate = accountCreateDate;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }
}
