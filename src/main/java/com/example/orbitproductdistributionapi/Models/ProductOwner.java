package com.example.orbitproductdistributionapi.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class ProductOwner {
@Id
    private java.lang.String id;
    private java.lang.String productOwnerName;
    private java.lang.String age;
    private java.lang.String gender;
    private java.lang.String productOwnerLocation;

    public ProductOwner(java.lang.String id, java.lang.String productOwnerName, java.lang.String age, java.lang.String gender, java.lang.String productOwnerLocation, List<String> productList) {
        this.id = id;
        this.productOwnerName = productOwnerName;
        this.age = age;
        this.gender = gender;
        this.productOwnerLocation = productOwnerLocation;
        this.productList = productList;
    }

    public ProductOwner () {

    }
    public java.lang.String getId() {
        return id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public java.lang.String getProductOwnerName() {
        return productOwnerName;
    }

    public void setProductOwnerName(java.lang.String productOwnerName) {
        this.productOwnerName = productOwnerName;
    }

    public java.lang.String getAge() {
        return age;
    }

    public void setAge(java.lang.String age) {
        this.age = age;
    }

    public java.lang.String getGender() {
        return gender;
    }

    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }

    public java.lang.String getProductOwnerLocation() {
        return productOwnerLocation;
    }

    public void setProductOwnerLocation(java.lang.String productOwnerLocation) {
        this.productOwnerLocation = productOwnerLocation;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    private List<String>productList;


}
