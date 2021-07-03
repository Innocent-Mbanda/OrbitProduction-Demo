package com.example.orbitproductdistributionapi.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOwner extends MongoRepository<ProductOwner,String> {
}
