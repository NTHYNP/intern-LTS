package com.example.intern.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "buymethod")
public class BuyMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buymethodid")
    private Integer buyMethodId;

    @Column(name = "buymethodcode")
    private String buyMethodCode;
    @Column(name = "buymethodname")
    private String buyMethodName;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "buyMethods")
    @JsonManagedReference
    private Set<Bill> bills;

    public Integer getBuyMethodId() {
        return buyMethodId;
    }

    public void setBuyMethodId(Integer buyMethodId) {
        this.buyMethodId = buyMethodId;
    }

    public String getBuyMethodCode() {
        return buyMethodCode;
    }

    public void setBuyMethodCode(String buyMethodCode) {
        this.buyMethodCode = buyMethodCode;
    }

    public String getBuyMethodName() {
        return buyMethodName;
    }

    public void setBuyMethodName(String buyMethodName) {
        this.buyMethodName = buyMethodName;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }
}
