package com.example.orbitproductdistributionapi.Controllers;

import com.example.orbitproductdistributionapi.Models.Customer;
import com.example.orbitproductdistributionapi.Models.Product;
import com.example.orbitproductdistributionapi.Service.CustomerService;
import com.example.orbitproductdistributionapi.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerService customerService;


    @PostMapping("/product")

   public String addProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>>getAllProducts( ){
        return  new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/products/{name}")

    public ResponseEntity<List<Customer>>getProductName(@PathVariable java.lang.String name){
        return new ResponseEntity(productService.getProductByName(name),HttpStatus.OK);
    }







}
