package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "billsales")
public class BillSales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billsalesid")
    private Integer billSaleId;
    @Column(name = "salesid")
    private Integer salesId;
    @Column(name = "billid")
    private Integer billId;

    @ManyToOne
    @JoinColumn(name = "billid",insertable = false,updatable = false)
    @JsonBackReference
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "salesid",insertable = false,updatable = false)
    @JsonBackReference
    private Sales sales;

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Integer getBillSaleId() {
        return billSaleId;
    }

    public void setBillSaleId(Integer billSaleId) {
        this.billSaleId = billSaleId;
    }

    public Integer getSalesId() {
        return salesId;
    }

    public void setSalesId(Integer salesId) {
        this.salesId = salesId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
