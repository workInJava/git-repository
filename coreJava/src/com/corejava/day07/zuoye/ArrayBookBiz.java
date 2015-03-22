package com.corejava.day07.zuoye;

import com.corejava.day06.Book;

public class ArrayBookBiz implements IBookBiz {

	private int capacity = 5; // 初始容量
	private int count = 0; // 代表有效图书数量
	private Book[] books;

	public void add(Book b) {
		// TODO Auto-generated method stub

		if (count >= books.length) {
			expand();
		}
		books[count++] = b;
	}

	private void expand() {
		// TODO Auto-generated method stub
		System.out.println("~~~扩展容量");
		Book[] _book = new Book[capacity * 2];
		System.arraycopy(books, 0, _book, 0, books.length);
		books = _book;
		this.capacity = books.length;

	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		int flag = -1;
		for (int i = 0; i < count; i++) {
			if (books[i].getName().equals(name)){
				flag = i;
				break;
			}

		}
		if (flag != -1) {
			for (int i = flag; i < count - 1; i++) {
				books[i] = books[i + 1];

			}
			this.count--;
			books[count] = null; 
		}

	}

	public Book findByName(String name) {
		// TODO Auto-generated method stub
		Book b = null;
		for (Book a : books) {
			if (a.getName().equals(name)){	
				b = a;
				break;
			}

		}

		return b;
	}

	public void outputAllBooks() {
		// TODO Auto-generated method stub

		for (int i = 0; i < count; i++) {
			System.out.println(books[i]);
		}

	}

	public ArrayBookBiz() {

		books = new Book[capacity];
	}

	public ArrayBookBiz(int capacity){
		this.capacity = capacity;
		books = new Book[capacity];
	}
	
}
