package com.corejava.day09.homework;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStack {
	// ��� LinkedList
	private LinkedList ll;

	// ����
	public MyStack() {
		// �����ʼ�� LinkedList
		this.ll = new LinkedList();
	}
	
	// ��ջ
	public void push(Object o) {
		// ί��
		ll.push(o);
	}

	// �鿴��ЧԪ��
	public int size() {
		return ll.size();
	}

	// �鿴ջ��Ԫ��
	public Object peek() {
		return ll.peek();
	}

	// �ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty() {
		return ll.isEmpty();
	}

	// ��ջ
	public Object pop() {
		return ll.pop();
	}

	public String toString() {
		return ll.toString();
	}

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		System.out.println("��ջǰ,��СΪ��" + ms.size());
		ms.push("a1");
		ms.push("a2");
		ms.push("a3");
		ms.push("a4");
		ms.push("a5");
		ms.push("a6");
		System.out.println("a1,a2,a3,a4,a5,a6������ջ��,��СΪ��" + ms.size());
		System.out.println("��ӡ����Ԫ�أ�" + ms.toString());
		System.out.println("�ж�ջ�Ƿ�Ϊ�գ�" + ms.isEmpty());
		System.out.println("ջ��Ԫ���ǣ�" + ms.peek());
		System.out.println("-----------------");
		// ���γ�ջ
		System.out.println("Ԫ�����γ�ջ��");
		while (ms.size() != 0) {
			Object o = ms.pop();
			System.out.println(o + "��ջ");
			System.out.println("��ջ��,��СΪ��" + ms.size());
		}
	}
}
