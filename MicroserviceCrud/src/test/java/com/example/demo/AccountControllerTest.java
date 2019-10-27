package com.example.demo;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.example.demo.entity.AccountDetails;
import com.example.demo.repository.AccountDetailsRepository;
import com.example.demo.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AccountControllerTest {

	@Mock
	AccountDetailsRepository accrepo;

	@InjectMocks
	private AccountService toDoService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	/*
	 * @Test public void testGetToDoById() { AccountDetails accd = createAccount();
	 * when(accrepo.getOne(accd.getAccountId()).thenReturn()
	 * 
	 * //ToDo result = toDoService.getToDoById(1); AccountDetailsDTO accDto =
	 * AccountDetailsDTO.valueof(accd); assertEquals(1, accDto.getId());
	 * assertEquals(true, accDto.isCompleted()); }
	 */

	public AccountDetails createAccount() {
		AccountDetails accdt = new AccountDetails();

		accdt.setAccountId(101);
		accdt.setFirstName("fname");
		accdt.setLastName("lname");
		accdt.setEmail("pk@gmail.com");
		accdt.setPhoneNumber("8374");
		accdt.setAddress("asda");
		return accdt;
	}

	@Test
	public void removeToDo() {
		AccountDetails toDo = createAccount();
		toDoService.deleteaccount(toDo.getAccountId());
		verify(accrepo, times(1)).delete(toDo);
	}
}
