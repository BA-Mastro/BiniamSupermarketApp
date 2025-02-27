package com.Supermarket.service;

import com.Supermarket.model.Product;
import com.Supermarket.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById (Long id){
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

public Product addProduct(Product product){
        return productRepository.save(product);
}
public void deleteProduct(Long id){
        productRepository.deleteById(id);
}

}