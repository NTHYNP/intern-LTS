package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "billstatus")
public class BillStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billstatusid")
    private Integer billStatusId;
    @Column(name = "billstatuscode")
    private String billStatusCode;
    @Column(name = "billstatusdetail")
    private String billStatusDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "billStatus")
    @JsonManagedReference
    private Set<Bill> bills;

    public Integer getBillStatusId() {
        return billStatusId;
    }

    public void setBillStatusId(Integer billStatusId) {
        this.billStatusId = billStatusId;
    }

    public String getBillStatusCode() {
        return billStatusCode;
    }

    public void setBillStatusCode(String billStatusCode) {
        this.billStatusCode = billStatusCode;
    }

    public String getBillStatusDetail() {
        return billStatusDetail;
    }

    public void setBillStatusDetail(String billStatusDetail) {
        this.billStatusDetail = billStatusDetail;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }
}
