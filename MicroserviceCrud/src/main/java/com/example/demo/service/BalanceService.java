package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AccountDetailsDTO;
import com.example.demo.dto.BalanceDetailsDTO;
import com.example.demo.entity.AccountDetails;
import com.example.demo.entity.BalanceDetails;
import com.example.demo.repository.BalanceDetailsRepository;

@Service
public class BalanceService {

	
	@Autowired 
	BalanceDetailsRepository balrepo;
	
	public List<BalanceDetailsDTO> getAllBalance()
	{
		Collection<BalanceDetails> bal= balrepo.findAll();
		List<BalanceDetailsDTO> balance = new ArrayList<BalanceDetailsDTO>();
			for(BalanceDetails balanceDetails:bal)
			{
				BalanceDetailsDTO balanceDTO = BalanceDetailsDTO.valueof(balanceDetails);
				balance.add(balanceDTO);
			}
		return balance;
		
	}
	public void createAccount(BalanceDetailsDTO accountdetailsdto) {
		BalanceDetails acct = accountdetailsdto.createBalanceAccount();

		balrepo.save(acct);
	}

}
