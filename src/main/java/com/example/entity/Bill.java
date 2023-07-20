package com.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Bill {
    @Id
    @Column(name = "bill_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence_generation",sequenceName = "Bill_billId_SQE",initialValue =1,allocationSize =1)
    private int billId;
    private LocalDateTime invoiceCreationDate;
    private float total_payment;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToMany(mappedBy = "bill")
    private Set<BillDetails> billDetails;
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public LocalDateTime getInvoiceCreationDate() {
        return invoiceCreationDate;
    }

    public void setInvoiceCreationDate(LocalDateTime invoiceCreationDate) {
        this.invoiceCreationDate = invoiceCreationDate;
    }

    public float getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(float total_payment) {
        this.total_payment = total_payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<BillDetails> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(Set<BillDetails> billDetails) {
        this.billDetails = billDetails;
    }
}
