package org.cap.dao;

import org.cap.dto.Account;
import org.cap.dto.Customer;
import org.cap.exception.InsufficientBalanceException;

public class AccountDaoImpl implements AccountDao{

	@Override
	public boolean createAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findAccountById(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account withdraw(int accountNo, double amount) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		return null;
	}

}
