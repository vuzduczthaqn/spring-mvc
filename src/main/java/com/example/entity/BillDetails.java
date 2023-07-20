package com.example.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.JoinColumn;

@Entity
//@IdClass(BillDetailsPK.class)
public class BillDetails implements Serializable {
    @EmbeddedId
    private BillDetailsPK id;


    @ManyToOne
    @JoinColumn(name = "productId")
    @MapsId("productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "billId")
    @MapsId("billId")
    private Bill bill;
    private int quantity;

    public BillDetailsPK getId() {
        return id;
    }

    public void setId(BillDetailsPK id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    private float unitPrice;

    public BillDetails(BillDetailsPK id, Product product, Bill bill, int quantity, float unitPrice) {
        this.id = id;
        this.product = product;
        this.bill = bill;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public BillDetails() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BillDetails)) return false;
        BillDetails that = (BillDetails) o;
        return getQuantity() == that.getQuantity() && Float.compare(that.getUnitPrice(), getUnitPrice()) == 0 && Objects.equals(getId(), that.getId()) && Objects.equals(getProduct(), that.getProduct()) && Objects.equals(getBill(), that.getBill());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProduct(), getBill(), getQuantity(), getUnitPrice());
    }

}

