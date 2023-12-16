package com.example.store.Store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example")
public class StoreApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(StoreApplication.class, args);
	    System.out.println("started");
	}

}
