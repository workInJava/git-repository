package com.corejava.day09.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �˿�����
 * 
 * @author libin
 * @date 2013-7-31 ����07:01:21
 * @version v1.0
 * @since JDK6.0
 * @��Ŀ�� core_Java
 * @���� com.corejava.day09.homework
 * @�ļ��� Poker.java
 */
public class Poker {
//	private static final List cards = new ArrayList();
	// ������ŷ��˵���

	// b.��ȡһ���˿��Ƶķ���
	public static List getPoker() {
//		return cards;
		List newPoker = new ArrayList(Card.getInstance());
		return newPoker;
	}

	// c.ϴ�� ����
	public static void shuffle(List poker) {
		System.out.println("....��ʼϴ��");
		Collections.shuffle(poker);
	}

	// d.���� ����
	/********
	 * @param poker �������˿���
	 * @param num ��������
	 * @return {@link Poker} �������·����˿���
	 */
	public static List sendCard(List poker, int num) {
		/*List list = cards.subList(0, 5);
		if (sendCard == null) {
			sendCard = new ArrayList(list);
		} else {
			sendCard.addAll(list);
		}
		// ������֮��ʹ��clear�����������˵��ƴӳ�ʼ����cards�����
		list.clear();*/
		//1.�жϵ�ǰ��poker�������µ����Ƿ����num
		if(num > poker.size()){
			num = poker.size();
		}
		//����subList��������ȡ�Ӽ���
		List temp = poker.subList(0, num);
		//�����ѷ������������´���һ������
		List result = new ArrayList(temp);
		//���ѷ������Ƹ����
		temp.clear();
		//�����ѷ�������
		return result;
	}

}
