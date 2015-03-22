package com.corejava.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/********
 * ������ʾ List�ӿڵ�ʹ��
 * @author 	jsd1307
 * @����ʱ�� Jul 31, 2013 2:33:26 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day09
 * @�ļ���   ListDemo.java
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		//1.�������϶���
		List strList = new ArrayList();
		System.out.println(strList.isEmpty());//true
		//2.���Ԫ�ص�������
		strList.add("jack");
		strList.add("����");
		strList.add("ann");
		strList.add("��÷÷");
		strList.add("smith");
		strList.add("solo");
		strList.add("steven");
		strList.add("tim");
		strList.add("jack");
		strList.add("��÷÷");
		System.out.println(strList.isEmpty());//false
		//���򡢿��ظ�
		System.out.println("�˼��ϵ�Ԫ�ظ�����"
				+strList.size());
		//�жϴ˼������Ƿ���� smith �������
		boolean b = strList.contains("smith");
		System.out.println(b);
		//�������
		Iterator iter = strList.iterator();
		while(iter.hasNext()){
			//ȡ����һ��Ԫ��
			String str = (String)iter.next();
			System.out.println(str);
		}
		
		//����˳��
		Collections.shuffle(strList);
		//�ٴ����
		System.out.println("//--����˳���");
		for(Object o : strList){
			System.out.println(o);
		}
	}
}
