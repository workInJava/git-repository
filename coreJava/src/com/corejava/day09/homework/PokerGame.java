package com.corejava.day09.homework;

import java.util.List;

//�˿���Ϸ
public class PokerGame {

	/************
	 * ���˿˵ķ�����������ָ���������棬�Լ�ÿ�˷��������˿���
	 * @param persons �������
	 * @param num ���ŵ�����
	 */
	public void play(int persons,int num){
		//1.���ȣ���ȡһ���˿�
		List poker = Poker.getPoker();
		//2.ϴ��
		Poker.shuffle(poker);
		//3.����
		for(int i=1;i<=persons;i++){
			//���λ�ȡÿһ������������
			List myCards = Poker.sendCard(poker, num);
			//���ÿ��������ȡ ���˿���
			System.out.printf("\n��[%d]���˵����ǣ�\n",i);
			for(Object card : myCards){
				System.out.printf("%s ",card);
			}
		}
	}
}
