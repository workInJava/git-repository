package com.corejava.day10;

import java.util.Map;

public class TestMapSkill {

	public static void main(String[] args) {
		String author = "��ӹ";
		Map m1 = MapSkill.getBooksByAuthor(author);
		System.out.println(author+"���鹲�ƣ�"+m1.size()+"��");
		MapSkill.print(m1);
	}
}
