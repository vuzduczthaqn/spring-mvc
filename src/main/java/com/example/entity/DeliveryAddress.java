package com.example.entity;

import jakarta.persistence.*;

@Entity
public class DeliveryAddress {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(
            name = "sequence_generater",
            sequenceName = "DeliveryAddress_addressId_SQE",
            allocationSize = 1,
            initialValue = 1
    )
    private int addressId;
    private String nameReceiver;
    private String messge;
    private String address;
    private String numberPhone;
    @ManyToOne
    @JoinColumn(name = "customer_id",foreignKey = @ForeignKey(name = "PK_customer_id_DeliveryAddress"))
    private Customer customer;

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getNameReceiver() {
        return nameReceiver;
    }

    public void setNameReceiver(String nameReceiver) {
        this.nameReceiver = nameReceiver;
    }

    public String getMessge() {
        return messge;
    }

    public void setMessge(String messge) {
        this.messge = messge;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
