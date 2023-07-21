package com.example.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Cart {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id",foreignKey = @ForeignKey(name = "PK_product_id_Cart"))
    private Product product;
    @Id
    @ManyToOne
    @JoinColumn(name ="customer_id",foreignKey = @ForeignKey(name = "PK_customer_id_Cart"))
    private Customer customer;
    private int Quantity;

    public Cart() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        Cart cart = (Cart) o;
        return getQuantity() == cart.getQuantity() && Objects.equals(getProduct(), cart.getProduct()) && Objects.equals(getCustomer(), cart.getCustomer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct(), getCustomer(), getQuantity());
    }
}
