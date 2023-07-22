package sprojects.productservice.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import sprojects.productservice.dto.ProductRequest;
import sprojects.productservice.model.Product;
import sprojects.productservice.repository.ProductRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public void createProduct(ProductRequest productRequest) {
		
		Product product = Product.builder()
								 .name(productRequest.getName())
								 .description(productRequest.getDescription())
								 .price(productRequest.getPrice())
								 .build();
		productRepository.save(product);
		log.info("Product {} is saved.", product.getId());
		
	}

}
