package com.corejava.day09.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestPoker {
	public static void main(String[] args) {
		
		PokerGame pg = new PokerGame();
		Scanner scan = new Scanner(System.in);
		System.out.print("������Ҫ�������>");
		int person = scan.nextInt();
		System.out.print("������ÿ�˷���������>");
		int num = scan.nextInt();
		//
		pg.play(person, num);
		
		// ��ӡ����ʼ���õ��˿�
		/*Poker p = new Poker();
		List cards = p.getPoker();
		System.out.println("��ʼ�����˿˹���" + cards.size() + "����");
		System.out.println("��ӡ�����˿�");
		Iterator it = cards.iterator();
		int i = 1;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
			i++;
		}*/
		/*System.out.println("\n---------------ϴ�ƽ׶�-------------------------\n");
		p.shuffle(cards);
		System.out.println("\n---------------���ƽ׶�-------------------------\n");
		int num = 5;// ����һ����������ʾ��������
		// ���ƿ�ʼ
		p.sendCard(cards, num);
		// �õ����з���ȥ����
		List sendCards = p.getSendCard();
		System.out.println("������" + num + "��,��ӡ�����������ƣ�");
		it = sendCards.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println("\nʣ���Ƶ������ǣ�" + cards.size());
		// ��ӡʣ����
		System.out.println("��ӡʣ���ƣ�");
		it = cards.iterator();
		i = 1;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("\n\n---------------��������5��-------------------------\n");
		// ��������
		p.sendCard(cards, num);
		// �õ����з���ȥ����
		sendCards = p.getSendCard();
		System.out.println("������" + sendCards.size() + "��,��ӡ�����������ƣ�");
		it = sendCards.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println("\nʣ���Ƶ������ǣ�" + cards.size());
		// ��ӡʣ����
		System.out.println("��ӡʣ���ƣ�");
		it = cards.iterator();
		i = 1;
		while (it.hasNext()) {
			System.out.print(it.next() + "\t");
			if (i % 13 == 0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("\n\n---------------�ջ�������-------------------------\n");
		// �ջط���ȥ����
		p.addSendCards();
		System.out.println("�ջ��ƺ�����Ϊ��" + cards.size());
		System.out.println("\n---------------����ϴ��---------------------------\n");
		p.shuffle();
		System.out.println("\nϴ�ƹ���,��ӡ�����˿�");
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
