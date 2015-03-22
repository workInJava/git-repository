package com.corejava.day09.homework;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStack {
	// 组合 LinkedList
	private LinkedList ll;

	// 构造
	public MyStack() {
		// 负责初始化 LinkedList
		this.ll = new LinkedList();
	}
	
	// 入栈
	public void push(Object o) {
		// 委托
		ll.push(o);
	}

	// 查看有效元素
	public int size() {
		return ll.size();
	}

	// 查看栈顶元素
	public Object peek() {
		return ll.peek();
	}

	// 判断栈是否为空
	public boolean isEmpty() {
		return ll.isEmpty();
	}

	// 出栈
	public Object pop() {
		return ll.pop();
	}

	public String toString() {
		return ll.toString();
	}

	public static void main(String[] args) {
		MyStack ms = new MyStack();
		System.out.println("入栈前,大小为：" + ms.size());
		ms.push("a1");
		ms.push("a2");
		ms.push("a3");
		ms.push("a4");
		ms.push("a5");
		ms.push("a6");
		System.out.println("a1,a2,a3,a4,a5,a6依次入栈后,大小为：" + ms.size());
		System.out.println("打印所有元素：" + ms.toString());
		System.out.println("判断栈是否为空：" + ms.isEmpty());
		System.out.println("栈顶元素是：" + ms.peek());
		System.out.println("-----------------");
		// 依次出栈
		System.out.println("元素依次出栈：");
		while (ms.size() != 0) {
			Object o = ms.pop();
			System.out.println(o + "出栈");
			System.out.println("出栈后,大小为：" + ms.size());
		}
	}
}
