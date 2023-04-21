package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.awt.*;

@Entity
@Table(name = "productimg")
public class ProductImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productimgid")
    private Integer productImgId;
    @Column(name = "productid")
    private Integer productId;
    @Column(name = "countimg")
    private Integer countImg;
    @Column(name = "productimg")
    private byte[] productImg;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "productid",insertable = false,updatable = false)
    private Product product;

    public Integer getProductImgId() {
        return productImgId;
    }

    public void setProductImgId(Integer productImgId) {
        this.productImgId = productImgId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCountImg() {
        return countImg;
    }

    public void setCountImg(Integer countImg) {
        this.countImg = countImg;
    }

    public byte[] getProductImg() {
        return productImg;
    }

    public void setProductImg(byte[] productImg) {
        this.productImg = productImg;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
