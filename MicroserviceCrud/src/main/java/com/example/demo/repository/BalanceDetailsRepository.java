package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BalanceDetails;

public interface BalanceDetailsRepository extends JpaRepository<BalanceDetails,String>{

	List<BalanceDetails> findByphoneNumber(String phoneNumber);
}
