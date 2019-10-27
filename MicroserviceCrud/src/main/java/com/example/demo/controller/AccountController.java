package com.example.demo.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDetailsDTO;
import com.example.demo.entity.AccountDetails;
/*import com.example.demo.entity.AccountDetails;*/
/*import com.example.demo.repository.AccountDetailsRepository;*/
/*import com.example.demo.service.AccountService;*/
import com.example.demo.repository.AccountDetailsRepository;
import com.example.demo.service.AccountService;

@RestController
/* @Controller */
public class AccountController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	AccountDetailsRepository accrepo;

	@Autowired
	AccountService accountService;

	@RequestMapping(value = "/adddetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createAccount(@RequestBody AccountDetailsDTO accDTO) {
		logger.info("Creation request for account {}", accDTO);
		accountService.createAccount(accDTO);
	}

	@RequestMapping(value = "/getdetails/{accountId}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AccountDetailsDTO getcustomer(@Valid @PathVariable int accountId) {
		// return accrepo.findAll().toString();
		logger.info("get accountdetails based on accountId {}", accountId);
		return accountService.getAccountDetails(accountId);
	}

	@RequestMapping(value = "/details/{accountId}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String deleteacount( @Valid @PathVariable int accountId) {
		
		logger.info("delete accountdetails based on accountId {}", accountId);
		return accountService.deleteaccount(accountId);
	}

	@RequestMapping(value = "/updatecustomers", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveorUpdate(@RequestBody AccountDetailsDTO accDTO) {
		logger.info("update  accountdetails based on accountId {}", accDTO);
		accountService.createAccount(accDTO);
	}

}
