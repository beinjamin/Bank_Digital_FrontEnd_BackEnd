package com.jaures.demo.entities;

import java.util.Date;
import java.util.List;

import com.jaures.demo.enums.AccountStatus;
import com.jaures.demo.enums.OperationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor @AllArgsConstructor
public class AccountOperation {
	
	private Long id;
	private Date operationDate;
	private double amount;
	private OperationType type;
	private BankAccount bankAccount;

}
