package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Product_type")
public class ProductType {
    @Id
    private String typeId;
    private String typeName;
    @OneToMany(mappedBy = "productType")
    private Set<Product> productSet=new TreeSet<>();

    public ProductType() {
    }

    public ProductType(String typeId, String typeName, Set<Product> productSet) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.productSet = productSet;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductType)) return false;
        ProductType that = (ProductType) o;
        return Objects.equals(typeId, that.typeId) && Objects.equals(typeName, that.typeName) && Objects.equals(productSet, that.productSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, typeName, productSet);
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                ", productSet=" + productSet +
                '}';
    }
}
