package sprojects.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import sprojects.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
