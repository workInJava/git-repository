package com.corejava.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.corejava.day06.Book;

public class SetDemo {

	public static void main(String[] args) {
		//创建一个 HashSet
		Set<String> strSet = new HashSet<String>();
		//添加元素
		strSet.add("jack");
		strSet.add("ann");
		strSet.add("韩梅梅");
		strSet.add("李雷");
		strSet.add("solo");
		strSet.add("smith");
		strSet.add("jack");
		strSet.add("tim");
		strSet.add("李雷");
		//验证是否有重复的数据
		System.out.println("Set元素个数："+strSet.size());
		//输出结果, 验证是否有序?
		Iterator<String> iter = strSet.iterator();
		while(iter.hasNext()){
//			String str = (String)iter.next();
			String str = iter.next();
			System.out.println(str);
		}
		//再创建一个HashSet，存放 Book 实例
		Set<Book> bookSet = new HashSet<Book>();
		//创建5本图书
		Book b1 = new Book(1001,"生死疲劳","莫言",19.8);
		Book b2 = new Book(1002,"金庸","雪山飞狐",29.5);
		Book b3 = new Book(1003,"金庸","神雕侠侣",28.0);
		Book b4 = new Book(1004,"古龙","小李飞刀",31.8);
		Book b5 = new Book(1005,"琼瑶","一帘幽梦",9.8);
		Book b6 = new Book(1006,"莫言","生死疲劳",9.8);
		//把以上对象添加到bookSet中
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
		bookSet.add(b5);
		bookSet.add(b6);
		
		System.out.println("bookSet的元素个数："
							+bookSet.size());
		//输出
		for(Book o : bookSet){
			System.out.println(o);
		}
	}
}
