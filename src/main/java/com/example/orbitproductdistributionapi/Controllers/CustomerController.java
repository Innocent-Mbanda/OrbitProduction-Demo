package com.example.orbitproductdistributionapi.Controllers;

import com.example.orbitproductdistributionapi.Models.Customer;
import com.example.orbitproductdistributionapi.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")

    public String PostCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

 @GetMapping("/customers")

    public ResponseEntity<List<Customer>>getAllCustomers(){
        return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
 }

    @GetMapping("/customer/{name}")

    public ResponseEntity<List<Customer>>getCustomerByName(@PathVariable String name){
        return  new ResponseEntity(customerService.getCustomerByName(name),HttpStatus.OK);

    }

}
