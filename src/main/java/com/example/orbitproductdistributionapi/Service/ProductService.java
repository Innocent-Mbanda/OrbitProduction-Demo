package com.example.orbitproductdistributionapi.Service;

import com.example.orbitproductdistributionapi.Models.DTO.ProductDTO;
import com.example.orbitproductdistributionapi.Models.Product;
import com.example.orbitproductdistributionapi.Repositories.CustomerRep;
import com.example.orbitproductdistributionapi.Repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    CustomerRep customerRep;

  public String createProduct(Product product){
      productRepo.save(product);
      return "Product was added successfully";
  }

  public List<Product>getAllProducts(){
      return productRepo.findAll();
  }

public List<Product> getProductByName(String name){

      return productRepo.findAll().stream().filter(product ->
              product.getProductName().equalsIgnoreCase(name))
              .collect(Collectors.toList());
}

}
