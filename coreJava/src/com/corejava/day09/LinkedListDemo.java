package com.corejava.day09;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList intList = new LinkedList();
		intList.add(9);
		intList.add(7);
		intList.add(1);
		intList.add(11);
		intList.add(6);
		intList.add(13);
		intList.add(7);
		
		//��������
		for(Object o : intList){
			System.out.println(o);
		}
		//����
		System.out.println("��һ��Ԫ��:"
					+intList.getFirst());
		System.out.println("���һ��Ԫ��:"
					+intList.getLast());
		//ѹջһ��Ԫ��
		intList.push(100);
		//��������
		for(Object o : intList){
			System.out.println(o);
		}
		//����һ��Ԫ��
		System.out.println("ȡ��ջ��Ԫ�أ�"
					+intList.pop());
		//��������
		for(Object o : intList){
			System.out.println(o);
		}
	}
}
