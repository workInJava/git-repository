package com.corejava.day10;

import java.util.Comparator;

import com.corejava.day06.Book;

//图书比较器工厂
public class BookCompFactory {

	public static Comparator<Book> getComp(int type){
		Comparator<Book> c = null;
		switch (type) {
		case 1:
			c = new Comparator<Book>(){
				@Override
				public int compare(Book o1, Book o2) {
					//按价格排
//					Book b1 = (Book)o1;
//					Book b2 = (Book)o2;
					if(o1.getPrice() > o2.getPrice()){
					   return 1;
					}else if(o1.getPrice() < o2.getPrice()){
					   return -1;
					}else{
					   return 0;
					}
				}
			};
			break;
		case 2:
			c = new Comparator<Book>(){
				@Override
				public int compare(Book o1, Book o2) {
//					Book b1 = (Book)o1;
//					Book b2 = (Book)o2;
					return o1.getName().compareTo(o2.getName());
				}
			};
			break;
		case 3:
			c = new Comparator<Book>(){
				@Override
				public int compare(Book o1, Book o2) {
//					Book b1 = (Book)o1;
//					Book b2 = (Book)o2;
					return (int)(o1.getId() - o2.getId());
				}
			};
		}
		return c;
	}
}
