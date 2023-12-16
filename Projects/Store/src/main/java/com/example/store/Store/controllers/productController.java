package com.example.store.Store.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.Store.Services.productService;
import com.example.store.Store.models.Product;

@RestController
@RequestMapping("/api/products")
public class productController 
{
	@Autowired
	private productService productService;

	@PostMapping("/createProduct")
	public ResponseEntity<?> createProduct(@RequestBody Product product)
	{
		try 
		{
			Product newProduct = productService.createProduct(product);
			return new ResponseEntity<>(newProduct,HttpStatus.CREATED);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("error while creating products");
		}
		return null;
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProduct()
	{
		return productService.findAllProduct();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Optional<Product> optionalProduct = productService.getOneProduct(id);
        return optionalProduct.map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                              .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
	  @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	
	
}
