package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categorytypeid")
public class CategoryTypeId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorytypeid")
    private Integer categoryTypeId;
    @Column(name = "categorytypecode")
    private String categoryTypeCode;
    @Column(name = "categorytypedetail")
    private String categoryTypeDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "categoryTypeIds")
    @JsonManagedReference
    private Set<Product> products;

    public Integer getCategoryTypeId() {
        return categoryTypeId;
    }

    public void setCategoryTypeId(Integer categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

    public String getCategoryTypeCode() {
        return categoryTypeCode;
    }

    public void setCategoryTypeCode(String categoryTypeCode) {
        this.categoryTypeCode = categoryTypeCode;
    }

    public String getCategoryTypeDetail() {
        return categoryTypeDetail;
    }

    public void setCategoryTypeDetail(String categoryTypeDetail) {
        this.categoryTypeDetail = categoryTypeDetail;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
