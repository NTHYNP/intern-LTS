package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salesid")
    private Integer salesId;
    @Column(name = "salescode")
    private String salesCode;
    @Column(name = "salesname")
    private String salesName;
    @Column(name = "salespersen")
    private Integer salesPersen;
    @Column(name = "salesint")
    private Integer salesInt;
    @Column(name = "opendate")
    private Date openDate;
    @Column(name = "enddate")
    private Date endDate;
    @Column(name = "salesstatusid")
    private Integer salesStatusId;
    @Column(name = "salestypeid")
    private Integer salesTypeId;


    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "salestypeid",insertable = false,updatable = false)
    private SalesType salesType;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "sales")
    @JsonManagedReference
    private Set<BillSales> billSales;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "salesstatusid",insertable = false,updatable = false)
    private SalesStatus salesStatus;

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public String getSalesCode() {
        return salesCode;
    }

    public void setSalesCode(String salesCode) {
        this.salesCode = salesCode;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public Integer getSalesPersen() {
        return salesPersen;
    }

    public void setSalesPersen(Integer salesPersen) {
        this.salesPersen = salesPersen;
    }

    public Integer getSalesInt() {
        return salesInt;
    }

    public void setSalesInt(Integer salesInt) {
        this.salesInt = salesInt;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getSalesStatusId() {
        return salesStatusId;
    }

    public void setSalesStatusId(Integer salesStatusId) {
        this.salesStatusId = salesStatusId;
    }

    public Integer getSalesTypeId() {
        return salesTypeId;
    }

    public void setSalesTypeId(Integer salesTypeId) {
        this.salesTypeId = salesTypeId;
    }

    public SalesType getSalesType() {
        return salesType;
    }

    public void setSalesType(SalesType salesType) {
        this.salesType = salesType;
    }

    public Set<BillSales> getBillSales() {
        return billSales;
    }

    public void setBillSales(Set<BillSales> billSales) {
        this.billSales = billSales;
    }

    public SalesStatus getSalesStatus() {
        return salesStatus;
    }

    public void setSalesStatus(SalesStatus salesStatus) {
        this.salesStatus = salesStatus;
    }
}
