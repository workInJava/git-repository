package com.corejava.day09.homework;

import java.util.List;
import java.util.ArrayList;
/**
 * 扑克牌的卡片类，由 花色(Suit)和点数(Rank)组成
 * 
 * @author libin
 * @date 2013-7-31 下午06:56:59
 * @version v1.0
 * @since JDK6.0
 * @项目名 core_Java
 * @包名 com.corejava.day09.homework
 * @文件名 Card.java
 */

public class Card {

	private static final List cards = new ArrayList();
	
	// a.初始化一副扑克牌 [静态代码块]
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
	
	// 属性
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

	//内部枚举
	private enum Suit{
		SPADES("黑桃"), DIAMONDS("方片"), HEARTS("红桃"), CLUBS("梅花");

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
