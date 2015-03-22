package com.corejava.day09.homework;

import java.util.List;
import java.util.ArrayList;
/**
 * �˿��ƵĿ�Ƭ�࣬�� ��ɫ(Suit)�͵���(Rank)���
 * 
 * @author libin
 * @date 2013-7-31 ����06:56:59
 * @version v1.0
 * @since JDK6.0
 * @��Ŀ�� core_Java
 * @���� com.corejava.day09.homework
 * @�ļ��� Card.java
 */

public class Card {

	private static final List cards = new ArrayList();
	
	// a.��ʼ��һ���˿��� [��̬�����]
	static {
		Suit[] h = Suit.values();
		Rank[] d = Rank.values();

		for (Suit s : h) {
			for (Rank r : d) {
				Card c = new Card(s,r);
				cards.add(c);
			}
		}
	}
	
	public static List getInstance(){
		return cards;
	}
	
	// ����
	private Suit suit;
	private Rank rank;

	private Card(Suit s, Rank r) {
		this.suit = s;
		this.rank = r;
	}
	
	/*public Card() {
		super();
	}*/

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(suit).append(rank);
		return builder.toString();
	}

	//�ڲ�ö��
	private enum Suit{
		SPADES("����"), DIAMONDS("��Ƭ"), HEARTS("����"), CLUBS("÷��");

		private Suit(String value) {
			this.value = value;
		}

		private String value;

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.value;
		}
	}
	
	private enum Rank {
		A("A"), two("2"), three("3"), four("4"), five("5"), six("6"), seven("7"), eight(
		"8"), nine("9"), ten("10"), J("J"), Q("Q"), K("K");

		private Rank(String value) {
			this.value = value;
		}
		
		private String value;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.value;
		}
	}
}
