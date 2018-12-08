package com.microservices.poc.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservices.poc.domain.entities.Product;
import com.microservices.poc.domain.repository.IProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class ProductService {
	
    private final IProductRepository productRepository;
 
    @Autowired
    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }
 
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
 
    public Optional<Product> findProductByCode(String code) {
        return productRepository.findByCode(code);
    }
}