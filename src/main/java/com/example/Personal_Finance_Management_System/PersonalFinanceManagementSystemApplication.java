package com.example.Personal_Finance_Management_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PersonalFinanceManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceManagementSystemApplication.class, args);
	}

}
