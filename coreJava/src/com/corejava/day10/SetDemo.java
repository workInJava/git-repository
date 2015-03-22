package com.corejava.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.corejava.day06.Book;

public class SetDemo {

	public static void main(String[] args) {
		//����һ�� HashSet
		Set<String> strSet = new HashSet<String>();
		//���Ԫ��
		strSet.add("jack");
		strSet.add("ann");
		strSet.add("��÷÷");
		strSet.add("����");
		strSet.add("solo");
		strSet.add("smith");
		strSet.add("jack");
		strSet.add("tim");
		strSet.add("����");
		//��֤�Ƿ����ظ�������
		System.out.println("SetԪ�ظ�����"+strSet.size());
		//������, ��֤�Ƿ�����?
		Iterator<String> iter = strSet.iterator();
		while(iter.hasNext()){
//			String str = (String)iter.next();
			String str = iter.next();
			System.out.println(str);
		}
		//�ٴ���һ��HashSet����� Book ʵ��
		Set<Book> bookSet = new HashSet<Book>();
		//����5��ͼ��
		Book b1 = new Book(1001,"����ƣ��","Ī��",19.8);
		Book b2 = new Book(1002,"��ӹ","ѩɽ�ɺ�",29.5);
		Book b3 = new Book(1003,"��ӹ","�������",28.0);
		Book b4 = new Book(1004,"����","С��ɵ�",31.8);
		Book b5 = new Book(1005,"����","һ������",9.8);
		Book b6 = new Book(1006,"Ī��","����ƣ��",9.8);
		//�����϶�����ӵ�bookSet��
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		bookSet.add(b5);
		bookSet.add(b6);
		
		System.out.println("bookSet��Ԫ�ظ�����"
							+bookSet.size());
		//���
		for(Book o : bookSet){
			System.out.println(o);
		}
	}
}
