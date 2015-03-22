package com.corejava.day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//���Ͱ���
public class GenericDemo {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(100);
		intList.add(1000);
		intList.add(10000);
		//���
		print(intList);
		//�ٴ���һ������
		List<Double> dList = new ArrayList<Double>();
		dList.add(3.24);
		dList.add(5.14);
		dList.add(2.85);
		dList.add(1.03);
		System.out.println("//------------");
		//���
		print(dList);
		
		//��֤����ֻ�ڱ���ʱ��Ч������ʱ�����
//		dList = intList;
		System.out.println(
				dList.getClass() == intList.getClass());
	}

	private static void print
			(List<? extends Number> list) {
		Iterator<? extends Number> iter 
							= list.iterator();
		while(iter.hasNext()){
			Number i = iter.next();
			System.out.println(i);
		}
	}
}
