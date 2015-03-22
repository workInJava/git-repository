package com.corejava.day10;

import java.util.Map;

public class TestMapSkill {

	public static void main(String[] args) {
		String author = "金庸";
		Map m1 = MapSkill.getBooksByAuthor(author);
		System.out.println(author+"的书共计："+m1.size()+"本");
		MapSkill.print(m1);
	}
}
