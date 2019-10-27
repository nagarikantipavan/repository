
package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AccountDetails {

	@Id
	int accountId;
	String firstName;
	String lastName;
	String email;
	@Column(name = "phone_no")
	String phoneNumber;
	String Address;

	/*
	 * @OneToMany(cascade = CascadeType.MERGE)
	 * 
	 * @JoinColumn(name = "phone_no") List<BalanceDetails> balance = new
	 * ArrayList<BalanceDetails>();
	 */

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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	/*
	 * public List<BalanceDetails> getBalance() { return balance; }
	 * 
	 * public void setBalance(List<BalanceDetails> balance) { this.balance =
	 * balance; }
	 */

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountId=" + accountId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", Address=" + Address + "]";
	}
}
