package com.corejava.day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//泛型案例
public class GenericDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		System.out.println(set.add("2"));
		System.out.println(set.add("2"));
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);  
		intList.add(100);
		intList.add(1000);
		intList.add(10000);
		//输出
		print(intList);
		//再创建一个集合
		List<Double> dList = new ArrayList<Double>();
		dList.add(3.24);
		dList.add(5.14);
		dList.add(2.85);
		dList.add(1.03);
		System.out.println("//------------");
		//输出
		print(dList);
		
		//验证泛型只在编译时有效，运行时会擦除
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
