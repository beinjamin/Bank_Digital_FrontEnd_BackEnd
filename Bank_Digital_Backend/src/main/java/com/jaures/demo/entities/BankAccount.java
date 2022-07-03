package com.jaures.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.jaures.demo.enums.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Data @NoArgsConstructor @AllArgsConstructor
public class BankAccount {
	@Id 
	private String id;
	private double balance;
	private Date createAt;
	private AccountStatus status;
	@ManyToOne
	private Customer customer;
	@OneToMany(mappedBy="BankAccount")
	private List<AccountOperation> accountOperations;

}
