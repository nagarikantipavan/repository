
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AccountDetails;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {

}
