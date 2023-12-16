package com.example.store.Store.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.store.Store.models.Product;
import com.example.store.Store.repository.productRepository;

@Service
public class productService 
{
	@Autowired
	private productRepository productRepository;
	
	
	public Product createProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	public void deleteProduct(Long productId)
	{
		productRepository.deleteById(productId);
	}
	
	public Optional<Product> getOneProduct(Long productId)
	{
		return productRepository.findById(productId);
	}
	
	public List<Product> findAllProduct()
	{
		return productRepository.findAll();
	}

}
