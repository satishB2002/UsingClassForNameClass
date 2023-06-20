package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.ConnectioinJdbc;

@SpringBootApplication
public class UsingClassFornameConnectionApplication implements CommandLineRunner{
@Autowired
private ConnectioinJdbc connectionJdbc;
	public static void main(String[] args) {
		SpringApplication.run(UsingClassFornameConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.connectionJdbc.connect());
		
	}

}
