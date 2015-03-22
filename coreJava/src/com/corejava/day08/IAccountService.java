package com.corejava.day08;

public interface IAccountService {

	/***
	 * ×ªÕÊÒµÎñ
	 * @param from
	 * @param to
	 * @param money
	 * @throws BalanceNotEnoughException
	 */
	void transfer(
			Account from,Account to, double money)
					throws BalanceNotEnoughException;
}
