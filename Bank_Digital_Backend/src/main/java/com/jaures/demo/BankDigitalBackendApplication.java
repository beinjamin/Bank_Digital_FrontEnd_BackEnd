package com.jaures.demo;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jaures.demo.entities.CurrentAccount;
import com.jaures.demo.entities.Customer;
import com.jaures.demo.enums.AccountStatus;
import com.jaures.demo.repositories.AccountOperationRepository;
import com.jaures.demo.repositories.BankAccountRepository;
import com.jaures.demo.repositories.CustomerRepository;

@SpringBootApplication
public class BankDigitalBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankDigitalBackendApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository,
			                BankAccountRepository bankAccountRepositor,
			                AccountOperationRepository accountOperationRepository) {
		return args -> {
			Stream.of("Jaures","Beinjamin","pascal").forEach(name->{
				Customer customer=new Customer();
				customer.setName(name);
				customer.setEmail(name+"@gmail.com");
				customerRepository.save(customer);
			});
			
			customerRepository.findAll().forEach(cust->{
				CurrentAccount currentAccount=new CurrentAccount();
				currentAccount.setBalance(Math.random()*90000);
				currentAccount.setStatus(AccountStatus.CREATED);
				currentAccount.setCreateAt(new Date());
				currentAccount.setCustomer(cust);
				currentAccount.setOverDraft(9000);
				bankAccountRepository.save(currentAccount);
				
			});
			
		};
		
	}

}
