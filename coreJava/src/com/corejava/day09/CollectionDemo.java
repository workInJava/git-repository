package com.corejava.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.corejava.day06.Book;

//������ʾ���϶��󡢼���Ԫ�ض�������
public class CollectionDemo {

	public static void main(String[] args) {
		//����5��ͼ��
		Book b1 = new Book(1001,"Ī��","����ƣ��",19.8);
		Book b2 = new Book(1002,"��ӹ","ѩɽ�ɺ�",29.5);
		Book b3 = new Book(1003,"��ӹ","�������",28.0);
		Book b4 = new Book(1004,"����","С��ɵ�",31.8);
		Book b5 = new Book(1005,"����","һ������",9.8);
		
		//����һ������
		List bList1 = new ArrayList();
		//���Ԫ����������
		bList1.add(b1);
		bList1.add(b5);
		bList1.add(b3);
		bList1.add(b2);
		bList1.add(b4);
		//������
		for(Object obj : bList1){ //ʹ����ǿforѭ��������Collection
			System.out.println(obj);
		}
	
		//�ٴ���һ������
		List bList2 = bList1;
		//�ٴ���һ���µļ��ϣ���bList1��Ԫ��Ϊ����
		List bList3 = new ArrayList(bList1);
		//��bList2���Ƶ�һ��Ԫ��
		bList2.remove(b5);
		System.out.println("bList1�Ĵ�С��"+bList1.size());
		System.out.println("bList2�Ĵ�С��"+bList2.size());
		System.out.println("bList3�Ĵ�С��"+bList3.size());
		
		//ͨ��bList1�ҵ����е�ĳ��Ԫ�أ��ٸı����Ԫ�ص�ֵ
		Book b = (Book)bList1.get(0);
		b.setAuthor("ŵ����������Ī��");
		
		//���bList1�Ľ��
		System.out.println("//-- bList1������:");
		for(Object o : bList1){
			System.out.println(o);
		}
		//����bList3��bList1����Ԫ��ָ��Ķ�����ͬһ��
		//���ԣ�bList1�ķǽṹ���޸�Ҳ��Ӱ�쵽bList3
		System.out.println("//-- bList3������:");
		for(Object o : bList3){
			System.out.println(o);
		}
		
		//ͨ��subList��������ȡһ�� bList4
		List bList4 = bList3.subList(2, 4);
		System.out.println("bList4�Ĵ�С��"+bList4.size());
		System.out.println("//-- bList4������:");
		for(Object o : bList4){
			System.out.println(o);
		}
		//���bList4
		bList4.clear();
		//�ٲ鿴 bList3
		System.out.println("bList3�Ĵ�С��"+bList3.size());
		System.out.println("//-- bList3������:");
		for(Object o : bList3){
			System.out.println(o);
		}
		
		//����˳��
		Collections.shuffle(bList1);
		System.out.println("//bList1����˳���");
		for(Object o : bList1){
			System.out.println(o);
		}
	}
}
