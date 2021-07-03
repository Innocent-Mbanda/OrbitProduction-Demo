package com.example.orbitproductdistributionapi.Models.DTO;

import com.example.orbitproductdistributionapi.Models.Product;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class CustomerDTO {

    @Id
    private String id;
    private String name;
    private String phoneNumber;
    private int age;
    private String gender;
    @DBRef
    private List<Product>productList;

    public CustomerDTO(String id, String name, String phoneNumber, int age, String gender, List<Product> productList) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.productList = productList;
    }

    public CustomerDTO(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
