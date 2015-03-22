package com.corejava.day12;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import com.corejava.day06.Book;

import org.junit.Test;

public class TestObjectStream {

	private ObjectStreamDemo demo;
	
	@Before
	public void init(){
		this.demo = new ObjectStreamDemo();//创建对象1
	}
	
	@Test
	public void testWriteObject() {
		//创建Books集合
		List<Book> books = new ArrayList<Book>();
		Book b2 = new Book(1002,"金庸","雪山飞狐",29.5);
		Book b3 = new Book(1003,"金庸","神雕侠侣",28.0);
		Book b4 = new Book(1004,"古龙","小李飞刀",31.8);
		Book b5 = new Book(1005,"琼瑶","一帘幽梦",19.2);
		Book b6 = new Book(1006,"莫言","生死疲劳",29.8);
		Book b1 = new Book(1001,"金庸","连城决",5.5);
		Book b7 = new Book(1007,"莫言","蛙",21.8);
		Book b8 = new Book(1008,"莫言","丰乳肥臀",45.2);
		Book b9 = new Book(1009,"琼瑶","还珠格格",5.8);
		Book b10 = new Book(1010,"金庸","鹿鼎记",39.5);
		Book b11 = new Book(1011,"金庸","笑傲江湖",11.9);
		books.add(b1);
		books.add(b5);
		books.add(b3);
		books.add(b4);
		books.add(b6);
		books.add(b2);
		books.add(b8);
		books.add(b7);
		books.add(b11);
		books.add(b9);
		books.add(b10);
		
		boolean b = demo.writeObject(books);
		assertEquals(b, true);
	}

	@Test
	public void testLoadBooks(){
		List<Book> books = demo.loadBooks();
		assertNotNull(books);
		//迭代输出
		for(Book b : books){
			System.out.println(b.getId()+","+b);
		}
	}
}
