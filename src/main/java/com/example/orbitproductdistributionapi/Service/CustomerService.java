package com.example.orbitproductdistributionapi.Service;

import com.example.orbitproductdistributionapi.Models.Customer;

import com.example.orbitproductdistributionapi.Repositories.CustomerRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    CustomerRep customerRep;

    public String addCustomer(Customer customer){
        customerRep.save(customer);
        return "customer was added successfully";
    }

    public List<Customer>getAllCustomers(){
      return customerRep.findAll();
    }



//    public List<Customer>getCustomerByName(String name) {
//
//        //filter returns true or false.
//    List<Customer> customerList = customerRep.findAll()
//            .stream()
//            .filter(customer -> customer.getName().equalsIgnoreCase(name)
//                    && customer.getProductList()!=null)
//            .sorted(Comparator.comparing(customer -> customer.getProductList().size()))
////            .findFirst()
//            // for each does not return.
//
////             .forEach(c->{
////                 Product product = new Product();
////                 product.setProductName("laptop");
////
////                 c.getProductList().add(product);
////
////             });
//
//             //map transforms. map can do operations because it is function.
//             // you need map when you want to do operation.
//             // you can also use for-each( It has a method of consumer which
//             // has functional interface called "Consumer"
//            // Operation can be like transformation ( To change something that we arleady have.
//
//
////             .map(c->{
////                 c.setName(c.getName());
////                 return c;
////
////             })
//
//             .collect(Collectors.toList());
//    return Collections.singletonList(customerList.get(customerList.size()-1));
//
//    }





}
