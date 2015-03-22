package com.corejava.day09.homework;

import java.util.List;

//扑克游戏
public class PokerGame {

	/************
	 * 玩扑克的方法，本方法指定几个人玩，以及每人发多少张扑克牌
	 * @param persons 玩的人数
	 * @param num 发张的数量
	 */
	public void play(int persons,int num){
		//1.首先，获取一副扑克
		List poker = Poker.getPoker();
		//2.洗牌
		Poker.shuffle(poker);
		//3.发牌
		for(int i=1;i<=persons;i++){
			//依次获取每一个人所发的牌
			List myCards = Poker.sendCard(poker, num);
			//输出每个人所获取 的扑克牌
			System.out.printf("\n第[%d]个人的牌是：\n",i);
			for(Object card : myCards){
				System.out.printf("%s ",card);
			}
		}
	}
}
