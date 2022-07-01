package com.jaures.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.jaures.demo.enums.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
	@Id 
	private String id;
	private double balance;
	
	private Date createAt;
	private AccountStatus status;
	@ManyToOne
	private Customer customer;
	private List<AccountOperation> accountOperations;

}
