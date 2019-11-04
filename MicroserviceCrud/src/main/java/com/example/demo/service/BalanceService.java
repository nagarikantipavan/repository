package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.Line;

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
	
	public long getAllBalance()
	{
		Collection<BalanceDetails> bal= balrepo.findAll();
		List<BalanceDetailsDTO> balance = new ArrayList<BalanceDetailsDTO>();
		long sum = 0;
			for(BalanceDetails balanceDetails:bal)
			{
				BalanceDetailsDTO balanceDTO = BalanceDetailsDTO.valueof(balanceDetails);
				balance.add(balanceDTO);
				List<BalanceDetailsDTO> bal1= new ArrayList<BalanceDetailsDTO>(balance);
				 Stream<BalanceDetailsDTO> filtered = bal1.stream().filter(BalanceDetailsDTO -> BalanceDetailsDTO.getBalance() > 2);
			//	List<BalanceDetailsDTO> filtered= (List<BalanceDetailsDTO>) bal.stream().filter(BalanceDetailsDTO ->BalanceDetailsDTO.getBalance()>10);
				  sum =  filtered.collect(Collectors.summingLong(o -> o.getBalance()));
				 System.out.println(sum);

			}
		return sum;
		
	}
	public void createAccount(BalanceDetailsDTO accountdetailsdto) {
		BalanceDetails acct = accountdetailsdto.createBalanceAccount();

		balrepo.save(acct);
	}

}
