package com.corejava.day08;
//客户端
public class TestAccountService {

	public static void main(String[] args) {
		//创建帐户对象[实体]
		Account a1 = new Account(1001,5000);
		Account a2 = new Account(1002,100);
		System.out.println("//转帐前:");
		System.out.println(a1);
		System.out.println(a2);
		//创建业务对象
		IAccountService as = new AccountService();
		//调用业务方法，完成模拟转帐
		try {
			as.transfer(a1, a2, 5100);
			System.out.println("转帐成功...");
		} catch (BalanceNotEnoughException e) {
//			e.printStackTrace();
			System.out.println("转帐失败");
			System.out.println(e.getMessage()
					+"，还差:"+e.getBalance()+"元");
		}
		
		System.out.println("//转帐后:");
		//输出现在两个帐户的余额
		System.out.println(a1);
		System.out.println(a2);
	}
}

