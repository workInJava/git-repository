package com.corejava.day07.zuoye;

import com.corejava.day06.Book;

public interface IBookBiz {

	//���ͼ��
	 void add(Book b);
	//����ͼ��name ��ɾ��ָ��ͼ��
	 void deleteByName(String name);
	//����ͼ����������ͼ��
	 Book findByName(String name);
	//��ӡ�����е�ͼ����Ϣ
	 void outputAllBooks();

}
