package com.corejava.day08;
//帐户 的业务类
public class AccountService implements IAccountService{

	/*************
	 * 本方法模拟转帐
	 * @param from 源帐户
	 * @param to 目的帐户
	 * @param money 金额
	 * @throws BalanceNotEnoughException 
	 */
	public void transfer(
			Account from,Account to, double money)
					throws BalanceNotEnoughException{
		//1.首先，获取源帐户的余额
		double balance = from.getBalance();
		//2.判断源帐户的余额是否大于 money
		if(balance < money){
			//抛出异常
			BalanceNotEnoughException be = 
					new BalanceNotEnoughException
					("帐户["+from.getId()+"]余额不足",balance-money);
			throw be;
		}
		//3.余额足够
		from.setBalance(balance - money);
		to.setBalance(to.getBalance()+money);
	}
}
