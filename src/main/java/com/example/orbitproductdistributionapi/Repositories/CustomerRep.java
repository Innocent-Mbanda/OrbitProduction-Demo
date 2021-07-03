package com.example.orbitproductdistributionapi.Repositories;

import com.example.orbitproductdistributionapi.Models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends MongoRepository
        <Customer,String> {
}
