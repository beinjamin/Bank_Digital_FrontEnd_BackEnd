package com.jaures.demo.entities;

import java.util.List;


@Data @NoArgsConstructor @AllArgsConstructor
public class Customer {
	private Long id;
	private String name;
	private String email;
	
	private List <BankAccount> bankAccounts;

}
