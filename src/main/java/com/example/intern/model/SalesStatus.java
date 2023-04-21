package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "salestatus")
public class SalesStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "salestatusid")
    private Integer salesStatusId;
    @Column(name = "statuscode")
    private String statusCode;
    @Column(name = "statusdetail")
    private String statusDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "salesStatus")
    @JsonManagedReference
    private Set<Sales> sales;


    public Integer getSalesStatusId() {
        return salesStatusId;
    }

    public void setSalesStatusId(Integer salesStatusId) {
        this.salesStatusId = salesStatusId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public Set<Sales> getSales() {
        return sales;
    }

    public void setSales(Set<Sales> sales) {
        this.sales = sales;
    }
}
