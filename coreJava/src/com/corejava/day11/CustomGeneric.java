package com.corejava.day11;

import java.util.Collections;

import com.corejava.day06.Book;

/***
 * �Զ��巺����
 * @author 	jsd1307
 * @����ʱ�� Aug 2, 2013 1:43:22 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day11
 * @�ļ���   CustomGeneric.java
 *
 */
public class CustomGeneric {

	public static void main(String[] args) {
		//����Entry
		Book b1 = new Book(1111,"Ī��","��",36.5);
		Entry<Long,Book> e1 =
			new Entry<Long, Book>(b1.getId(),b1);
		Entry<Integer, String> e2 = 
			new Entry<Integer, String>(1,"one");
		
		//...
		System.out.println(e1);
		System.out.println(e2);
	}
	
	//�ڲ���
	private static class Entry<K,V>{
		//����
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
