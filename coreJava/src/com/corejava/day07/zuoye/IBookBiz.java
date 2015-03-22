package com.corejava.day07.zuoye;

import com.corejava.day06.Book;

public interface IBookBiz {

	//添加图书
	 void add(Book b);
	//根据图书name 来删除指定图书
	 void deleteByName(String name);
	//根据图书名来查找图书
	 Book findByName(String name);
	//打印出所有的图书信息
	 void outputAllBooks();

}
