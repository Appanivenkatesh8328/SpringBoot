package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootEmployeeSep13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeSep13Application.class, args);
	}

}
