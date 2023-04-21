package com.example.intern.model;

import ch.qos.logback.core.encoder.EncoderBase;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "producer")
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producerid")
    private Integer producerId;
    @Column(name = "producercode")
    private String producerCode;
    @Column(name = "producerdetail")
    private String producerDetail;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "producer")
    @JsonManagedReference
    private Set<Product> products;

    public Integer getProducerId() {
        return producerId;
    }

    public void setProducerId(Integer producerId) {
        this.producerId = producerId;
    }

    public String getProducerCode() {
        return producerCode;
    }

    public void setProducerCode(String producerCode) {
        this.producerCode = producerCode;
    }

    public String getProducerDetail() {
        return producerDetail;
    }

    public void setProducerDetail(String producerDetail) {
        this.producerDetail = producerDetail;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
