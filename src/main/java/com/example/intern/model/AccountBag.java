package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "accountbag")
public class AccountBag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "accountbagid")
    private Integer accountBagId;
    @Column(name = "accountid")
    private Integer accountId;
    @Column(name = "productid")
    private Integer productId;
    @Column(name = "quantity")
    private String quantity;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "accountid",insertable = false,updatable = false)
    private Accounts  accounts;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "productid",insertable = false,updatable = false)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAccountBagId() {
        return accountBagId;
    }

    public void setAccountBagId(Integer accountBagId) {
        this.accountBagId = accountBagId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }
}
