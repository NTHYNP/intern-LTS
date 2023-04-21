package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billid")
    private Integer billId;
    @Column(name = "accountshipcontactid")
    private Integer accountShipContactId;
    @Column(name = "buymethod")
    private Integer buyMethod;
    @Column(name = "createdate")
    private Date createDate;
    @Column(name = "shiptobuyerdate")
    private Date shipToBuyerDate;
    @Column(name = "receiveddate")
    private Date receivedDate;
    @Column(name = "closedate")
    private Date closeDate;
    @Column(name = "billstatusid")
    private Integer billStatusId;
    @Column(name = "productreturndate")
    private Date productReturnDate;

    @Column(name = "buyernotification")
    private String buyerNotification;
    @Column(name = "shipmethodid")
    private Integer shipMethodId;
    @Column(name = "shipprice")
    private Integer shipPrice;
    @Column(name = "billcode")
    private Integer billCode;
    @Column(name = "idnv")
    private Integer idNV;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "buymethod",insertable = false,updatable = false)
    private BuyMethod buyMethods;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "shipmethodid", insertable = false,updatable = false)
    private ShipMethod shipMethods;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "billstatusid",insertable = false,updatable = false)
    private BillStatus billStatus;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "accountshipcontactid",insertable = false,updatable = false)
    private AccountShipContact accountShipContact;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "bill")
    @JsonManagedReference
    private Set<BillSales> billSales;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "bill")
    @JsonManagedReference
    private Set<BillDetail> billDetails;

    public AccountShipContact getAccountShipContact() {
        return accountShipContact;
    }

    public void setAccountShipContact(AccountShipContact accountShipContact) {
        this.accountShipContact = accountShipContact;
    }

    public Set<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(Set<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }

    public Set<BillSales> getBillSales() {
        return billSales;
    }

    public void setBillSales(Set<BillSales> billSales) {
        this.billSales = billSales;
    }

    public ShipMethod getShipMethods() {
        return shipMethods;
    }

    public void setShipMethods(ShipMethod shipMethods) {
        this.shipMethods = shipMethods;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getAccountShipContactId() {
        return accountShipContactId;
    }

    public void setAccountShipContactId(Integer accountShipContactId) {
        this.accountShipContactId = accountShipContactId;
    }

    public Integer getBuyMethod() {
        return buyMethod;
    }

    public void setBuyMethod(Integer buyMethod) {
        this.buyMethod = buyMethod;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getShipToBuyerDate() {
        return shipToBuyerDate;
    }

    public void setShipToBuyerDate(Date shipToBuyerDate) {
        this.shipToBuyerDate = shipToBuyerDate;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Integer getBillStatusId() {
        return billStatusId;
    }

    public void setBillStatusId(Integer billStatusId) {
        this.billStatusId = billStatusId;
    }

    public Date getProductReturnDate() {
        return productReturnDate;
    }

    public void setProductReturnDate(Date productReturnDate) {
        this.productReturnDate = productReturnDate;
    }

    public String getBuyerNotification() {
        return buyerNotification;
    }

    public void setBuyerNotification(String buyerNotification) {
        this.buyerNotification = buyerNotification;
    }

    public Integer getShipMethodId() {
        return shipMethodId;
    }

    public void setShipMethodId(Integer shipMethodId) {
        this.shipMethodId = shipMethodId;
    }

    public Integer getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(Integer shipPrice) {
        this.shipPrice = shipPrice;
    }

    public Integer getBillCode() {
        return billCode;
    }

    public void setBillCode(Integer billCode) {
        this.billCode = billCode;
    }

    public Integer getIdNV() {
        return idNV;
    }

    public void setIdNV(Integer idNV) {
        this.idNV = idNV;
    }

    public BuyMethod getBuyMethods() {
        return buyMethods;
    }

    public void setBuyMethods(BuyMethod buyMethods) {
        this.buyMethods = buyMethods;
    }
}
