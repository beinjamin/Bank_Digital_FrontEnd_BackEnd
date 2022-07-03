package com.jaures.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaures.demo.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, String>{

}
