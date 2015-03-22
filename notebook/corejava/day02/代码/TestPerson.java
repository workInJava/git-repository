package com.corejava.day02;

import java.sql.Date;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("张三");
		p1.setGender('男');
		p1.setBirth(Date.valueOf("1992-12-15"));
		p1.sayHello();
		System.out.println("//---------------");
		
		Person p2 = new Person("韩梅梅",'女'
					,Date.valueOf("1993-06-27"));
		p2.sayHello();
		System.out.println("//=---------------");

		p1.setCouple(p2);
		System.out.printf("%s的couple是%s\n",
				p1.getName(),p1.getCouple().getName());
		
		System.out.println("//--------------");
		System.out.printf("[%s]的couple是[%s]\n",
				p2.getName(),p2.getCouple().getName());
	}
}
