package com.corejava.day04;

import com.corejava.day03.Employee;

public class TestSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);//==比较的是对象的地址
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1 == e2);
	}
}
