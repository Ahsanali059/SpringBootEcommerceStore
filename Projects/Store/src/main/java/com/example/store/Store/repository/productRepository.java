package com.example.store.Store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.store.Store.models.Product;

public interface productRepository extends JpaRepository<Product, Long>
{
     //Custom method if needed
}
