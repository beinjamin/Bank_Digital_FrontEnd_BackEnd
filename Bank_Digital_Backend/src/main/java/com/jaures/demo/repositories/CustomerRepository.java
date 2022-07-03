package com.jaures.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaures.demo.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
