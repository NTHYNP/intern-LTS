package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "votestar")
public class VoteStar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "votestarid")
    private Integer voteStarId;
    @Column(name = "productid")
    private Integer productId;
    @Column(name = "accountid")
    private Integer accountId;
    @Column(name = "starvoted")
    private Integer starVoted;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "accountid",insertable = false,updatable = false)
    private Accounts accounts;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "productid",insertable = false,updatable = false)
    private Product product;

    public Integer getVoteStarId() {
        return voteStarId;
    }

    public void setVoteStarId(Integer voteStarId) {
        this.voteStarId = voteStarId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getStarVoted() {
        return starVoted;
    }

    public void setStarVoted(Integer starVoted) {
        this.starVoted = starVoted;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
