package com.microservice.productservice.repositories;

import com.microservice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, String> {

}
