package springrest.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import springrest.product.model.Product;

public interface ProductRepository extends MongoRepository < Product, Long > {

}
