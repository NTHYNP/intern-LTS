package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "shipmethod")
public class ShipMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipmethodid")
    private Integer shipMethodId;
    @Column(name = "shipmethodcode")
    private String shipMethodCode;
    @Column(name = "shipmethodname")
    private String shipMethodName;
    @Column(name = "shipprice")
    private Integer shipPrice;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "shipMethods")
    @JsonManagedReference
    private Set<Bill> bills;

    public Integer getShipMethodId() {
        return shipMethodId;
    }

    public void setShipMethodId(Integer shipMethodId) {
        this.shipMethodId = shipMethodId;
    }

    public String getShipMethodCode() {
        return shipMethodCode;
    }

    public void setShipMethodCode(String shipMethodCode) {
        this.shipMethodCode = shipMethodCode;
    }

    public String getShipMethodName() {
        return shipMethodName;
    }

    public void setShipMethodName(String shipMethodName) {
        this.shipMethodName = shipMethodName;
    }

    public Integer getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(Integer shipPrice) {
        this.shipPrice = shipPrice;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }
}
