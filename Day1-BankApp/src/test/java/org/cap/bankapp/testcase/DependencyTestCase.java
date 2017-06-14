package org.cap.bankapp.testcase;

import org.cap.dto.Account;
import org.cap.dto.Address;
import org.cap.dto.Customer;
import org.cap.exception.InsufficientBalanceException;
import org.cap.service.AcccountService;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

import org.cap.dao.AccountDao;

public class DependencyTestCase {
	
	private AccountDao accountDao;
	private AcccountService accountService;
	
	@Test
	public void test_withDraw_withMock() throws InsufficientBalanceException {
		
		Customer customer =  new Customer();
		customer.setCustName("test");
		customer.setCustAddress(new Address());
		
		Account account = new Account();
		account.setCustomer(customer);
		account.setAccountNo(1000);
		
		// Declaration
		Mockito.when(accountDao.findAccountById(1000)).thenReturn(account);
		
		
		//Mockito.when(accountDao.withdraw(10000, 100)).thenReturn(account);
		
		// Actual logic
		
		Account newaccount = accountService.withdraw(1000, 100);
		
		// verification
		
		Mockito.verify(accountDao).findAccountById(1000);
		assertEquals(4700,newaccount.getAmount(),0.0);
	}

}
