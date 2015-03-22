package com.corejava.day03.homework;

public class TestStatic {

	private static String name ="dhhd";
	private static int a=2;
	private String na;
	
	static{
		System.out.println("静态代码块");
	}
	
	public TestStatic(){
		System.out.println("构造函数");
	}
	
	
	
	public TestStatic(String na){
		this.na = na;
		a++;
		System.out.println("构造函数");
		System.out.println(a);
	}
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		TestStatic.name = name;
	}

	public String getNa() {
		return na;
	}

	public void setNa(String na) {
		this.na = na;
	}
	
	public static void main(String[] args){
		
		TestStatic na = new TestStatic();
		TestStatic na1 = new TestStatic("www");
		
	}
	
}
