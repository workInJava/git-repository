package com.corejava.day11;

import java.util.Collections;

import com.corejava.day06.Book;

/***
 * 自定义泛型类
 * @author 	jsd1307
 * @创建时间 Aug 2, 2013 1:43:22 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day11
 * @文件名   CustomGeneric.java
 *
 */
public class CustomGeneric {

	public static void main(String[] args) {
		//创建Entry
		Book b1 = new Book(1111,"莫言","蛙",36.5);
		Entry<Long,Book> e1 =
			new Entry<Long, Book>(b1.getId(),b1);
		Entry<Integer, String> e2 = 
			new Entry<Integer, String>(1,"one");
		
		//...
		System.out.println(e1);
		System.out.println(e2);
	}
	
	//内部类
	private static class Entry<K,V>{
		//属性
		private K key;
		private V value;
		
		public Entry(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(key).append(" => ")
					.append(value);
			return builder.toString();
		}
	}
}
