package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "productstatus")
public class ProductStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productstatusid")
    private Integer productStatusId;
    @Column(name = "productstatuscode")
    private String productStatusCode;
    @Column(name = "productstatusdetail")
    private String productStatusDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "productStatus")
    @JsonManagedReference
    private Set<Product> products;


    public Integer getProductStatusId() {
        return productStatusId;
    }

    public void setProductStatusId(Integer productStatusId) {
        this.productStatusId = productStatusId;
    }

    public String getProductStatusCode() {
        return productStatusCode;
    }

    public void setProductStatusCode(String productStatusCode) {
        this.productStatusCode = productStatusCode;
    }

    public String getProductStatusDetail() {
        return productStatusDetail;
    }

    public void setProductStatusDetail(String productStatusDetail) {
        this.productStatusDetail = productStatusDetail;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
