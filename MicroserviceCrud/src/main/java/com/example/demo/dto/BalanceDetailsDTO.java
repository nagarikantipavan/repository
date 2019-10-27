package com.example.demo.dto;

import javax.persistence.Column;

import com.example.demo.entity.BalanceDetails;

public class BalanceDetailsDTO {

	
	 int id;
	 long balance;
	 
	 public BalanceDetailsDTO() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	String phoneNumber;
	
	public static BalanceDetailsDTO valueof(BalanceDetails balancedetails)
	{
		BalanceDetailsDTO balDTO= new BalanceDetailsDTO();
		balDTO.setId(balancedetails.getId());
		balDTO.setBalance(balancedetails.getBalance());
		return balDTO;
	}
	public BalanceDetails createBalanceAccount()
	{
		BalanceDetails bal = new BalanceDetails();
		bal.setId(this.getId());
		bal.setBalance(this.getBalance());
		bal.setPhoneNumber(this.getPhoneNumber());
		
		return bal;
		
	}
}
