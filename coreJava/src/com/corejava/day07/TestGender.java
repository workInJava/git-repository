package com.corejava.day07;

public class TestGender {

	public static void main(String[] args) {
		//ȡö�ٳ���
		Gender m = Gender.MALE;
		Gender f = Gender.FEMALE;
		
		System.out.println(m);
		System.out.println(f);
		
		Gender[] genders = Gender.values();
		for(Gender g:genders){
			System.out.println(g);
		}
	}
}
