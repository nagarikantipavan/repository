package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AccountDetailsDTO;
import com.example.demo.dto.BalanceDetailsDTO;
import com.example.demo.service.BalanceService;

@RestController
public class BalanceController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	BalanceService balservice;
	
	@RequestMapping(value = "/plans", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public long getallBalances()
	{
		return balservice.getAllBalance();
	}
	
	@RequestMapping(value = "/addbalance", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createAccount(@RequestBody BalanceDetailsDTO accDTO) {
		logger.info("Creation request for account {}", accDTO);
		balservice.createAccount(accDTO);
	}

}
