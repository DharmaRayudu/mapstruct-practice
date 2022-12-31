package com.example.demostruct;

import com.example.demostruct.model.Item;
import com.example.demostruct.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoStructApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoStructApplication.class, args);

	}

	public void init(){

		Product p=new Product();
		System.out.println("I am from run method");
	}
}
