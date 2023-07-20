package com.example.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BillDetailsPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "billId")
    private Bill bill;

    public BillDetailsPK() {
    }

    public BillDetailsPK(Product product, Bill bill) {
        this.product = product;
        this.bill = bill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BillDetailsPK)) return false;
        BillDetailsPK that = (BillDetailsPK) o;
        return Objects.equals(getProduct(), that.getProduct()) && Objects.equals(getBill(), that.getBill());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct(), getBill());
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
}
