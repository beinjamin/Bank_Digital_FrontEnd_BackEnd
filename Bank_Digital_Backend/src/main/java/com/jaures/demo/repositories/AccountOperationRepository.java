package com.jaures.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaures.demo.entities.AccountOperation;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {

}
