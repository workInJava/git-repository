package com.corejava.day08;
//�ʻ� ��ҵ����
public class AccountService implements IAccountService{

	/*************
	 * ������ģ��ת��
	 * @param from Դ�ʻ�
	 * @param to Ŀ���ʻ�
	 * @param money ���
	 * @throws BalanceNotEnoughException 
	 */
	public void transfer(
			Account from,Account to, double money)
					throws BalanceNotEnoughException{
		//1.���ȣ���ȡԴ�ʻ������
		double balance = from.getBalance();
		//2.�ж�Դ�ʻ�������Ƿ���� money
		if(balance < money){
			//�׳��쳣
			BalanceNotEnoughException be = 
					new BalanceNotEnoughException
					("�ʻ�["+from.getId()+"]����",balance-money);
			throw be;
		}
		//3.����㹻
		from.setBalance(balance - money);
		to.setBalance(to.getBalance()+money);
	}
}
