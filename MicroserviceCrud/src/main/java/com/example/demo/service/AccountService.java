
package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AccountDetailsDTO;
import com.example.demo.entity.AccountDetails;
import com.example.demo.repository.AccountDetailsRepository;

@Service
public class AccountService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AccountDetailsRepository accountdetailrepo;

	public void createAccount(AccountDetailsDTO accountdetailsdto) {
		logger.info("Creation request for customer {}", accountdetailsdto);
		AccountDetails acct = accountdetailsdto.createAccount();

		accountdetailrepo.save(acct);
	}

	public AccountDetailsDTO getAccountDetails(int accountId) {
		logger.info("get request accountdetails {}", accountId);
		AccountDetails acct = accountdetailrepo.findById(accountId).orElse(new AccountDetails());
		AccountDetailsDTO accDto = AccountDetailsDTO.valueof(acct);
		return accDto;
	}

	public String deleteaccount(int accountId) {
		AccountDetails acct = accountdetailrepo.getOne(accountId);

		accountdetailrepo.delete(acct);

		return "deleted";
	}
}
