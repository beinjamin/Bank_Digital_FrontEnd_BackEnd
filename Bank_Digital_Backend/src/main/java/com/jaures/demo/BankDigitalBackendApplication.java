package com.jaures.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jaures.demo.repositories.AccountOperationRepository;
import com.jaures.demo.repositories.BankAccountRepository;
import com.jaures.demo.repositories.CustomerRepository;

@SpringBootApplication
public class BankDigitalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankDigitalBackendApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner start(CustomerRepository customerRepositor,
			                BankAccountRepository bankAccountRepositor,
			                AccountOperationRepository accountOperationRepository) {
		return args -> {
			
		};
		
	}

}
