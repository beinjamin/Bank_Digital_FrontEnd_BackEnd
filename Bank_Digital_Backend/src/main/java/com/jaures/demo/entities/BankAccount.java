package com.jaures.demo.entities;

import java.util.Date;
import java.util.List;

import com.jaures.demo.enums.AccountStatus;

public class BankAccount {
	private String id;
	private double balance;
	private Date createAt;
	private AccountStatus status;
	
	private Customer customer;
	private List<AccountOperation> accountOperations;

}
