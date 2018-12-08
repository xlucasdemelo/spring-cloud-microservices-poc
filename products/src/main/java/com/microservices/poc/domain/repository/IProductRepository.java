package com.microservices.poc.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.poc.domain.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{
	
	public Optional<Product> findByCode( String code );
	
}
