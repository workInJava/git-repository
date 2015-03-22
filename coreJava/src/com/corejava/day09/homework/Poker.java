package com.corejava.day09.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 扑克牌类
 * 
 * @author libin
 * @date 2013-7-31 下午07:01:21
 * @version v1.0
 * @since JDK6.0
 * @项目名 core_Java
 * @包名 com.corejava.day09.homework
 * @文件名 Poker.java
 */
public class Poker {
//	private static final List cards = new ArrayList();
	// 用来存放发了的牌

	// b.获取一副扑克牌的方法
	public static List getPoker() {
//		return cards;
		List newPoker = new ArrayList(Card.getInstance());
		return newPoker;
	}

	// c.洗牌 方法
	public static void shuffle(List poker) {
		System.out.println("....开始洗牌");
		Collections.shuffle(poker);
	}

	// d.发牌 方法
	/********
	 * @param poker 待发的扑克牌
	 * @param num 发多少张
	 * @return {@link Poker} 返回已下发的扑克牌
	 */
	public static List sendCard(List poker, int num) {
		/*List list = cards.subList(0, 5);
		if (sendCard == null) {
			sendCard = new ArrayList(list);
		} else {
			sendCard.addAll(list);
		}
		// 发完牌之后，使用clear方法，将发了的牌从初始化的cards中清除
		list.clear();*/
		//1.判断当前的poker中所余下的牌是否大于num
		if(num > poker.size()){
			num = poker.size();
		}
		//利用subList方法来获取子集合
		List temp = poker.subList(0, num);
		//根据已发出的牌来重新创建一个集合
		List result = new ArrayList(temp);
		//把已发生的牌给清掉
		temp.clear();
		//返回已发出的牌
		return result;
	}

}
