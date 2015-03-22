package com.corejava.day10;

import java.util.TreeSet;

import com.corejava.day06.Book;

public class TreeSetDemo {

	public static void main(String[] args) {
//		TreeSet bSet = new TreeSet();
		//以比较器为构造参数
		TreeSet<Book> bSet = new TreeSet<Book>(BookCompFactory.getComp(2));
		
		Book b2 = new Book(1002,"金庸","雪山飞狐",29.5);
		Book b3 = new Book(1003,"金庸","神雕侠侣",28.0);
		Book b4 = new Book(1004,"古龙","小李飞刀",31.8);
		Book b5 = new Book(1005,"琼瑶","一帘幽梦",19.2);
		Book b6 = new Book(1006,"莫言","生死疲劳",29.8);
		
		bSet.add(b2);
		System.out.println("大小："+bSet.size());
		bSet.add(b3);
		System.out.println("大小："+bSet.size());
		bSet.add(b4);
		System.out.println("大小："+bSet.size());
		bSet.add(b5);
		System.out.println("大小："+bSet.size());
		bSet.add(b6);
		System.out.println("大小："+bSet.size());
		
		//输出
		for(Book o : bSet){
			System.out.println(o);
		}
	}
}
