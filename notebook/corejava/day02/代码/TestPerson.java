package com.corejava.day02;

import java.sql.Date;

public class TestPerson {

	public static void main(String[] args) {
		Person p1 = new Person("����");
		p1.setGender('��');
		p1.setBirth(Date.valueOf("1992-12-15"));
		p1.sayHello();
		System.out.println("//---------------");
		
		Person p2 = new Person("��÷÷",'Ů'
					,Date.valueOf("1993-06-27"));
		p2.sayHello();
		System.out.println("//=---------------");

		p1.setCouple(p2);
		System.out.printf("%s��couple��%s\n",
				p1.getName(),p1.getCouple().getName());
		
		System.out.println("//--------------");
		System.out.printf("[%s]��couple��[%s]\n",
				p2.getName(),p2.getCouple().getName());
	}
}
