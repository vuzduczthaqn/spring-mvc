package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
@Entity
public class Position {
    @Id
    private String positionId;
    @Column(name = "posion_name",columnDefinition = "nvarchar(50)")
    private String positionName;
    @Column(name ="status")
    private int status;
    @OneToMany(mappedBy = "position")
    private Set<Customer> customerSet=new TreeSet<>();


    public Position(String positionId, String positionName, int status) {
        this.positionId = positionId;
        this.positionName = positionName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Position{" +
                "positionId='" + positionId + '\'' +
                ", positionName='" + positionName + '\'' +
                ", status=" + status +
                ", customerSet=" + customerSet +
                '}';
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public Position() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return getStatus() == position.getStatus() && Objects.equals(getPositionId(), position.getPositionId()) && Objects.equals(getPositionName(), position.getPositionName()) && Objects.equals(getCustomerSet(), position.getCustomerSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPositionId(), getPositionName(), getStatus(), getCustomerSet());
    }
}
