/**
 * 
 */
package com.corejava.day06.homework;

import java.util.Scanner;

/**
 * @author   �� ��
 * @����ʱ�� Jul 26, 2013 7:06:39 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day06.homework
 * @�ļ���   TestMyArrayList.java
 *
 */
public class TestMyArrayList {

	public static void main(String[] args) {
		/*MyArrayList mal = new MyArrayList();
		Scanner scan =new Scanner(System.in);
//		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 600 ;i ++){
//			System.out.println("���������֣�");
//			int n1 = scan.nextInt();
//			mal.add(n1);
			mal.add(i);
		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		mal.output();
		System.out.println("��ЧԪ���У�"+mal.size());
		System.out.println("������Ҫ�Ƴ����֣�");
		int n2 = scan.nextInt();
		mal.remove(n2);
		mal.output();
		System.out.println("��ЧԪ���У�"+mal.size());
		System.out.println("������Ҫ��ѯ�������±꣺");
		int n3 = scan.nextInt();
		System.out.println(mal.get(n3));
		System.out.println(mal.size());
		
		MyArrayList ma2 = new MyArrayList();
		ma2.remove(100);
		System.out.println("//--------------------");
		mal.output();*/
		
		MyList list = new MyArrayList2();
		for(int i=0;i<33;i++){
			list.add(i*7+5);
		}
		//
		list.output();
		//
		System.out.println("��ЧԪ�ظ�����"+list.size());
		list.remove(5);
		list.output();
		//
		System.out.println("��ЧԪ�ظ�����"+list.size());
		list.remove(229);
		list.output();
		//
		System.out.println(list.get(10));
		System.out.println("��ЧԪ�ظ�����"+list.size());
		
		//����ѭ������
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
