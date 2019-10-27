package com.example.demo.dto;

import com.example.demo.entity.AccountDetails;

/*import com.example.demo.entity.AccountDetails;*/

public class AccountDetailsDTO {

	int accountId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public AccountDetailsDTO() {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}

	

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public static AccountDetailsDTO valueof(AccountDetails accountDetails) {
		AccountDetailsDTO accdto = new AccountDetailsDTO();
		accdto.setAccountId(accountDetails.getAccountId());
		accdto.setFirstName(accountDetails.getFirstName());
		accdto.setLastName(accountDetails.getLastName());
		accdto.setEmail(accountDetails.getEmail());
		accdto.setPhoneNumber(accountDetails.getPhoneNumber());
		accdto.setAddress(accountDetails.getAddress());

		return accdto;

	}

	@Override
	public String toString() {
		return "AccountDetailsDTO [accountId=" + accountId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	public AccountDetails createAccount() {
		AccountDetails accdt = new AccountDetails();

		accdt.setAccountId(this.getAccountId());
		accdt.setFirstName(this.getFirstName());
		accdt.setLastName(this.getLastName());
		accdt.setEmail(this.getEmail());
		accdt.setPhoneNumber(this.getPhoneNumber());
		accdt.setAddress(this.getAddress());
		return accdt;
	}

}
