package com.example.entity;

import jakarta.persistence.*;

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

}
