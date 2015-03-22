package com.corejava.day09.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestPoker {
	public static void main(String[] args) {
		
		PokerGame pg = new PokerGame();
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入要玩的人数>");
		int person = scan.nextInt();
		System.out.print("请输入每人发多少张牌>");
		int num = scan.nextInt();
		//
		pg.play(person, num);
		
		// 打印出初始化好的扑克
		/*Poker p = new Poker();
		List cards = p.getPoker();
		System.out.println("初始化的扑克共有" + cards.size() + "张牌");
		System.out.println("打印所有扑克");
		Iterator it = cards.iterator();
		int i = 1;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
			i++;
		}*/
		/*System.out.println("\n---------------洗牌阶段-------------------------\n");
		p.shuffle(cards);
		System.out.println("\n---------------发牌阶段-------------------------\n");
		int num = 5;// 定义一个变量，表示发牌数量
		// 发牌开始
		p.sendCard(cards, num);
		// 得到所有发出去的牌
		List sendCards = p.getSendCard();
		System.out.println("共发牌" + num + "张,打印发出的所有牌：");
		it = sendCards.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println("\n剩余牌的数量是：" + cards.size());
		// 打印剩余牌
		System.out.println("打印剩余牌：");
		it = cards.iterator();
		i = 1;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("\n\n---------------继续发牌5张-------------------------\n");
		// 继续发牌
		p.sendCard(cards, num);
		// 得到所有发出去的牌
		sendCards = p.getSendCard();
		System.out.println("共发牌" + sendCards.size() + "张,打印发出的所有牌：");
		it = sendCards.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println("\n剩余牌的数量是：" + cards.size());
		// 打印剩余牌
		System.out.println("打印剩余牌：");
		it = cards.iterator();
		i = 1;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("\n\n---------------收回所有牌-------------------------\n");
		// 收回发出去的牌
		p.addSendCards();
		System.out.println("收回牌后，总数为：" + cards.size());
		System.out.println("\n---------------重新洗牌---------------------------\n");
		p.shuffle();
		System.out.println("\n洗牌过后,打印所有扑克");
		it = cards.iterator();
		i = 1;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
			i++;
		}*/
		
		
	}
}
