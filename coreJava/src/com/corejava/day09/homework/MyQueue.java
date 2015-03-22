package com.corejava.day09.homework;

import java.util.Collections;
import java.util.LinkedList;

//����
public class MyQueue {

	// ��� LinkedList
	private LinkedList ll;

	// ����
	public MyQueue() {
		// �����ʼ�� LinkedList
		this.ll = new LinkedList();
	}

	// ����
	public Object poll() {
		return ll.pollLast();// ��ȡ���Ƴ����б�����һ��Ԫ��
	}

	// ����
	public void offer(Object o) {
		ll.push(o);
	}

	// �鿴�Ӷ�Ԫ��
	public Object peek() {
		return ll.getLast();
	}

	// �ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return ll.isEmpty();
	}

	// �鿴��ЧԪ�ظ���
	public int size() {
		return ll.size();
	}

	public String toString() {
		LinkedList list = new LinkedList(ll);
		Collections.reverse(list);
		return list.toString();
	}

	public static void main(String[] args) {
		MyQueue ms = new MyQueue();
		System.out.println("����ǰ,��СΪ��" + ms.size());
		ms.offer("a1");
		ms.offer("a2");
		ms.offer("a3");
		ms.offer("a4");
		ms.offer("a5");
		ms.offer("a6");
		System.out.println("a1,a2,a3,a4,a5,a6�������к�,��СΪ��" + ms.size());
		System.out.println("��ӡ���ж���Ԫ�أ�" + ms.toString());
		System.out.println("�ж϶����Ƿ�Ϊ�գ�" + ms.isEmpty());
		System.out.println("�Ӷ�Ԫ���ǣ�" + ms.peek());
		System.out.println("-----------------");
		// ���γ���
		System.out.println("Ԫ�����γ��У�");
		while (ms.size() != 0) {
			Object o = ms.poll();
			System.out.println(o + "����");
			System.out.println("���к�,��СΪ��" + ms.size());
		}

	}
}
