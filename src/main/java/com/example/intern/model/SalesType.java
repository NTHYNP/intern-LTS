package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "salestype")
public class SalesType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "saletypeid")
    private Integer saleTypeId;
    @Column(name = "saletypecode")
    private String saleTypeCode;
    @Column(name = "saletypedetail")
    private String saleTypeDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "salesType")
    @JsonManagedReference
    private Set<Sales> sales;

    public Integer getSaleTypeId() {
        return saleTypeId;
    }

    public void setSaleTypeId(Integer saleTypeId) {
        this.saleTypeId = saleTypeId;
    }

    public String getSaleTypeCode() {
        return saleTypeCode;
    }

    public void setSaleTypeCode(String saleTypeCode) {
        this.saleTypeCode = saleTypeCode;
    }

    public String getSaleTypeDetail() {
        return saleTypeDetail;
    }

    public void setSaleTypeDetail(String saleTypeDetail) {
        this.saleTypeDetail = saleTypeDetail;
    }

    public Set<Sales> getSales() {
        return sales;
    }

    public void setSales(Set<Sales> sales) {
        this.sales = sales;
    }
}
