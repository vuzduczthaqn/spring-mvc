package com.example.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "sequence_generation", sequenceName = "Product_product_id_SQE", initialValue = 1, allocationSize = 1)
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_name", columnDefinition = "nvarchar(50)")
    private String productName;
    @Column(name = "path_image", columnDefinition = "varchar(100)")
    private String pathImg;
    private float price;
    @Column(columnDefinition = "nvarchar(MAX)")
    private String describe;
    private int quantity;
    @OneToMany(mappedBy = "product")
    private Set<BillDetails> detailsSet;

    @OneToMany(mappedBy = "product")
    private Set<Cart> cartSet=new TreeSet<>();
    @ManyToOne
    @JoinColumn(
            name = "producer_id",foreignKey = @ForeignKey(name = "PK_producer_id")
    )
    private Producer producer;

    @ManyToOne
    @JoinColumn(name = "type_id",foreignKey = @ForeignKey(name = "PK_producttype_id"))
    private ProductType productType;

    public Set<Cart> getCartSet() {
        return cartSet;
    }

    public void setCartSet(Set<Cart> cartSet) {
        this.cartSet = cartSet;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }



    public Product() {
    }

    public Product(int productId, String productName, String pathImg, float price, String describe, int quantity, Set<BillDetails> detailsSet) {
        this.productId = productId;
        this.productName = productName;
        this.pathImg = pathImg;
        this.price = price;
        this.describe = describe;
        this.quantity = quantity;
        this.detailsSet = detailsSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProductId() == product.getProductId() && Float.compare(product.getPrice(), getPrice()) == 0 && getQuantity() == product.getQuantity() && Objects.equals(getProductName(), product.getProductName()) && Objects.equals(getPathImg(), product.getPathImg()) && Objects.equals(getDescribe(), product.getDescribe()) && Objects.equals(getDetailsSet(), product.getDetailsSet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getProductName(), getPathImg(), getPrice(), getDescribe(), getQuantity(), getDetailsSet());
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPathImg() {
        return pathImg;
    }

    public void setPathImg(String pathImg) {
        this.pathImg = pathImg;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<BillDetails> getDetailsSet() {
        return detailsSet;
    }

    public void setDetailsSet(Set<BillDetails> detailsSet) {
        this.detailsSet = detailsSet;
    }
}
