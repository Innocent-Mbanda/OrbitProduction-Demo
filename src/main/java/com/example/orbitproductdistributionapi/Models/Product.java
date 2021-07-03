package com.example.orbitproductdistributionapi.Models;

import org.springframework.data.annotation.Id;

public class Product {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private String sellerName;
    private String productLocationName;
    private float productPrice;

     public Product(){

     }

    public Product(String id, String productName, String productDescription, String sellerName, String productLocationName, float productPrice) {
        this.id = id;
        this.productName = productName;
        this.productDescription = productDescription;
        this.sellerName = sellerName;
        this.productLocationName = productLocationName;
        this.productPrice = productPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getProductLocationName() {
        return productLocationName;
    }

    public void setProductLocationName(String productLocationName) {
        this.productLocationName = productLocationName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
}
