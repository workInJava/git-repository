package com.corejava.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import com.corejava.day06.Book;

public class Test1 extends TestF{
	public void sayHello(){
		System.out.println("Hello lijunli");
	}
	
	public void play1() {
		System.out.println("1");
	}
	public void play2() {
		System.out.println("1");
	}
	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		long de = System.currentTimeMillis();
		System.out.println(new Date(de));
		
		Book b = new Book();
		Constructor<Book> f = (Constructor<Book>) b.getClass().getDeclaredConstructor();
		Book b1 = f.newInstance(null);
		System.out.println(b1==b);
	}
}


