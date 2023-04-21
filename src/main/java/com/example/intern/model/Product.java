package com.example.intern.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private Integer productId;
    @Column(name = "productname")
    private String productName;
    @Column(name = "productdetail")
    private String productDetail;
    @Column(name = "categorytypeid")
    private Integer categoryTypeId;
    @Column(name = "sizeid")
    private Integer sizeId;
    @Column(name = "colorid")
    private Integer colorId;
    @Column(name = "brandid")
    private Integer brandId;
    @Column(name = "producerid")
    private Integer producerId;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "price")
    private Integer price;
    @Column(name = "shellprice")
    private Integer shellPrice;
    @Column(name = "createdate")
    private LocalDateTime createDate;
    @Column(name = "updatedate")
    private LocalDateTime updateDate;
    @Column(name = "productstatusid")
    private Integer productStatusId;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "producerid",insertable = false,updatable = false)
    private Producer producer;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "categorytypeid",insertable = false,updatable = false)
    private CategoryTypeId categoryTypeIds;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    @JsonManagedReference
    private Set<VoteStar> voteStars;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    @JsonManagedReference
    private Set<BillDetail> billDetails;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    @JsonManagedReference
    private Set<ProductImg> productImgs;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "product")
    @JsonManagedReference
    private Set<AccountBag> accountBags;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "sizeid",insertable = false,updatable = false)
    private Size size;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "colorid",insertable = false,updatable = false)
    private Color color;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "brandid",insertable = false,updatable = false)
    private Brand brand;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "productstatusid",insertable = false,updatable = false)
    private ProductStatus productStatus;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public Integer getCategoryTypeId() {
        return categoryTypeId;
    }

    public void setCategoryTypeId(Integer categoryTypeId) {
        this.categoryTypeId = categoryTypeId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getProducerId() {
        return producerId;
    }

    public void setProducerId(Integer producerId) {
        this.producerId = producerId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getShellPrice() {
        return shellPrice;
    }

    public void setShellPrice(Integer shellPrice) {
        this.shellPrice = shellPrice;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getProductStatusId() {
        return productStatusId;
    }

    public void setProductStatusId(Integer productStatusId) {
        this.productStatusId = productStatusId;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public CategoryTypeId getCategoryTypeIds() {
        return categoryTypeIds;
    }

    public void setCategoryTypeIds(CategoryTypeId categoryTypeIds) {
        this.categoryTypeIds = categoryTypeIds;
    }

    public Set<VoteStar> getVoteStars() {
        return voteStars;
    }

    public void setVoteStars(Set<VoteStar> voteStars) {
        this.voteStars = voteStars;
    }

    public Set<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(Set<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }

    public Set<ProductImg> getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(Set<ProductImg> productImgs) {
        this.productImgs = productImgs;
    }

    public Set<AccountBag> getAccountBags() {
        return accountBags;
    }

    public void setAccountBags(Set<AccountBag> accountBags) {
        this.accountBags = accountBags;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }
}
