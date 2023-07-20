package com.example.entity;

import jakarta.persistence.*;

import java.util.Set;
import java.util.TreeSet;

@Entity
public class Customer {
    @Id
    @Column(name = "customer_id",columnDefinition = "char(10)")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence_generator",sequenceName = "Customer_customerId_SQE",initialValue = 1,allocationSize = 1)
    private int customerId;

    @Column(name = "customer_name",columnDefinition = "nvarchar(50)")
    private String fullname;

    private String email;

    private String password;
    @OneToMany(mappedBy = "customer")
    private Set<Bill> bills;
    @OneToMany(mappedBy ="customer")
    private Set<DeliveryAddress> deliveryAddressSet;

    @OneToMany(mappedBy = "customer")
    private Set<Cart> cart=new TreeSet<>();
    @ManyToOne
    @JoinColumn(name = "position_id",foreignKey = @ForeignKey(name = "PK_position_id_Customer"))
    private Position position;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }

    public Set<DeliveryAddress> getDeliveryAddressSet() {
        return deliveryAddressSet;
    }

    public void setDeliveryAddressSet(Set<DeliveryAddress> deliveryAddressSet) {
        this.deliveryAddressSet = deliveryAddressSet;
    }
}
