package com.corejava.day10;

import java.util.TreeSet;

import com.corejava.day06.Book;

public class TreeSetDemo {

	public static void main(String[] args) {
//		TreeSet bSet = new TreeSet();
		//�ԱȽ���Ϊ�������
		TreeSet<Book> bSet = new TreeSet<Book>(BookCompFactory.getComp(2));
		
		Book b2 = new Book(1002,"��ӹ","ѩɽ�ɺ�",29.5);
		Book b3 = new Book(1003,"��ӹ","�������",28.0);
		Book b4 = new Book(1004,"����","С��ɵ�",31.8);
		Book b5 = new Book(1005,"����","һ������",19.2);
		Book b6 = new Book(1006,"Ī��","����ƣ��",29.8);
		
		bSet.add(b2);
		System.out.println("��С��"+bSet.size());
		bSet.add(b3);
		System.out.println("��С��"+bSet.size());
		bSet.add(b4);
		System.out.println("��С��"+bSet.size());
		bSet.add(b5);
		System.out.println("��С��"+bSet.size());
		bSet.add(b6);
		System.out.println("��С��"+bSet.size());
		
		//���
		for(Book o : bSet){
			System.out.println(o);
		}
	}
}
