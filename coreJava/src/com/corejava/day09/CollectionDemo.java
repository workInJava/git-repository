package com.corejava.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.corejava.day06.Book;

//本类演示集合对象、集合元素对象、引用
public class CollectionDemo {

	public static void main(String[] args) {
		//创建5本图书
		Book b1 = new Book(1001,"莫言","生死疲劳",19.8);
		Book b2 = new Book(1002,"金庸","雪山飞狐",29.5);
		Book b3 = new Book(1003,"金庸","神雕侠侣",28.0);
		Book b4 = new Book(1004,"古龙","小李飞刀",31.8);
		Book b5 = new Book(1005,"琼瑶","一帘幽梦",9.8);
		
		//创建一个集合
		List bList1 = new ArrayList();
		//添加元素至集合中
		bList1.add(b1);
		bList1.add(b5);
		bList1.add(b3);
		bList1.add(b2);
		bList1.add(b4);
		//输出结果
		for(Object obj : bList1){ //使用增强for循环来迭代Collection
			System.out.println(obj);
		}
	
		//再创建一个集合
		List bList2 = bList1;
		//再创建一个新的集合，以bList1的元素为基础
		List bList3 = new ArrayList(bList1);
		//从bList2中移掉一个元素
		bList2.remove(b5);
		System.out.println("bList1的大小："+bList1.size());
		System.out.println("bList2的大小："+bList2.size());
		System.out.println("bList3的大小："+bList3.size());
		
		//通过bList1找到其中的某个元素，再改变这个元素的值
		Book b = (Book)bList1.get(0);
		b.setAuthor("诺贝尔奖得主莫言");
		
		//输出bList1的结果
		System.out.println("//-- bList1的数据:");
		for(Object o : bList1){
			System.out.println(o);
		}
		//由于bList3与bList1集合元素指向的对象是同一个
		//所以，bList1的非结构性修改也会影响到bList3
		System.out.println("//-- bList3的数据:");
		for(Object o : bList3){
			System.out.println(o);
		}
		
		//通过subList方法来获取一个 bList4
		List bList4 = bList3.subList(2, 4);
		System.out.println("bList4的大小："+bList4.size());
		System.out.println("//-- bList4的数据:");
		for(Object o : bList4){
			System.out.println(o);
		}
		//清空bList4
		bList4.clear();
		//再查看 bList3
		System.out.println("bList3的大小："+bList3.size());
		System.out.println("//-- bList3的数据:");
		for(Object o : bList3){
			System.out.println(o);
		}
		
		//打乱顺序
		Collections.shuffle(bList1);
		System.out.println("//bList1打乱顺序后：");
		for(Object o : bList1){
			System.out.println(o);
		}
	}
}
