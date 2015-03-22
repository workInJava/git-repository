package com.corejava.day08;
//�ͻ���
public class TestAccountService {

	public static void main(String[] args) {
		//�����ʻ�����[ʵ��]
		Account a1 = new Account(1001,5000);
		Account a2 = new Account(1002,100);
		System.out.println("//ת��ǰ:");
		System.out.println(a1);
		System.out.println(a2);
		//����ҵ�����
		IAccountService as = new AccountService();
		//����ҵ�񷽷������ģ��ת��
		try {
			as.transfer(a1, a2, 5100);
			System.out.println("ת�ʳɹ�...");
		} catch (BalanceNotEnoughException e) {
//			e.printStackTrace();
			System.out.println("ת��ʧ��");
			System.out.println(e.getMessage()
					+"������:"+e.getBalance()+"Ԫ");
		}
		
		System.out.println("//ת�ʺ�:");
		//������������ʻ������
		System.out.println(a1);
		System.out.println(a2);
	}
}

