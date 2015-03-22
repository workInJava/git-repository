package com.corejava.day07.zuoye;

import com.corejava.day06.Book;

public class TestArrayBookBiz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1=new Book(01,"½ðÓ¹","Â¹¶¦¼Ç",39.0);
		Book b2=new Book(02,"¹ÅÁú","Ñ©É½·Éºü",33.0);
		Book b3=new Book(03,"½ðÓ¹","Â¹¶¦¼Ç2",39.0);
		Book b4=new Book(04,"¹ÅÁú","Ñ©É½·Éºü2",33.0);
		Book b5=new Book(05,"½ðÓ¹","Â¹¶¦¼Ç3",39.0);
		Book b6=new Book(06,"¹ÅÁú","Ñ©É½·Éºü3",33.0);
		System.out.println(b1.getId()+","+b2.getId());
		ArrayBookBiz abb=new ArrayBookBiz();
		abb.add(b1);
		abb.add(b2);
		abb.add(b3);
		abb.add(b4);
		abb.add(b5);
		abb.add(b6);
		abb.outputAllBooks();
		System.out.println("//-----------------");
		System.out.println(abb.findByName("Â¹¶¦¼Ç"));
		System.out.println("//É¾³ýºó£º-----------------");
		abb.deleteByName("Â¹¶¦¼Ç");
		abb.outputAllBooks();
		
		
		
		
	}

}
