package org.cap.dao;

import org.cap.dto.Account;
import org.cap.dto.Customer;
import org.cap.exception.InsufficientBalanceException;

public interface AccountDao {
	
	public boolean createAccount(Account account);
	
	public Account findAccountById(int accountNo);
	
	public Account withdraw(int accountNo, double amount)throws InsufficientBalanceException;
	

}
