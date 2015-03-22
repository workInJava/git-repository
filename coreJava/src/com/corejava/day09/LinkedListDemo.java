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
		
		//迭代出来
		for(Object o : intList){
			System.out.println(o);
		}
		//操作
		System.out.println("第一个元素:"
					+intList.getFirst());
		System.out.println("最后一个元素:"
					+intList.getLast());
		//压栈一个元素
		intList.push(100);
		//迭代出来
		for(Object o : intList){
			System.out.println(o);
		}
		//出来一个元素
		System.out.println("取出栈顶元素："
					+intList.pop());
		//迭代出来
		for(Object o : intList){
			System.out.println(o);
		}
	}
}
