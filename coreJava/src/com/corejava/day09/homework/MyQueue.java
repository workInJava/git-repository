package com.corejava.day09.homework;

import java.util.Collections;
import java.util.LinkedList;

//队列
public class MyQueue {

	// 组合 LinkedList
	private LinkedList ll;

	// 构造
	public MyQueue() {
		// 负责初始化 LinkedList
		this.ll = new LinkedList();
	}

	// 出列
	public Object poll() {
		return ll.pollLast();// 获取并移除此列表的最后一个元素
	}

	// 入列
	public void offer(Object o) {
		ll.push(o);
	}

	// 查看队顶元素
	public Object peek() {
		return ll.getLast();
	}

	// 判断队列是否为空
	public boolean isEmpty() {
		return ll.isEmpty();
	}

	// 查看有效元素个数
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
		System.out.println("入列前,大小为：" + ms.size());
		ms.offer("a1");
		ms.offer("a2");
		ms.offer("a3");
		ms.offer("a4");
		ms.offer("a5");
		ms.offer("a6");
		System.out.println("a1,a2,a3,a4,a5,a6依次入列后,大小为：" + ms.size());
		System.out.println("打印所有队列元素：" + ms.toString());
		System.out.println("判断队列是否为空：" + ms.isEmpty());
		System.out.println("队顶元素是：" + ms.peek());
		System.out.println("-----------------");
		// 依次出列
		System.out.println("元素依次出列：");
		while (ms.size() != 0) {
			Object o = ms.poll();
			System.out.println(o + "出列");
			System.out.println("出列后,大小为：" + ms.size());
		}

	}
}
