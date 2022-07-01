package com.jaures.demo.entities;

import java.util.Date;
import java.util.List;

import com.jaures.demo.enums.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
	private String id;
	private double balance;
	private Date createAt;
	private AccountStatus status;
	
	private Customer customer;
	private List<AccountOperation> accountOperations;

}
