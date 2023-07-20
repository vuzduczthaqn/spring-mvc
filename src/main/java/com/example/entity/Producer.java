package com.example.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Producer")
public class Producer {
    @Id
    @Column(name = "producer_id",columnDefinition = "char(10)",nullable = false)
    private String producerId;
    @Column(name = "producer_name",columnDefinition = "nvarchar(100)")
    private String producerName;
    @Column(columnDefinition = "nvarchar(255)")
    private String address;
    @Column(columnDefinition = "char(10)")
    private String numberPhone;
    @OneToMany(mappedBy = "producer")
    private Set<Product> productSet=new TreeSet<>();
    public Producer() {
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

}

