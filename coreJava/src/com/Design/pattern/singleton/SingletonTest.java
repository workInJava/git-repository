package com.Design.pattern.singleton;

public class SingletonTest {

	private SingletonTest(){
		
	}
	
	private static class SingletonFactory{
		private static SingletonTest  instance = new SingletonTest(); 
	}
	
	public static SingletonTest getInstance(){
		return SingletonFactory.instance;
	}
	
	public Object readObject(){
		return getInstance();
	}
	
	public static void main(String[] args){
		SingletonTest s = SingletonTest.getInstance();
		SingletonTest s1  =  SingletonTest.getInstance();
		System.out.println(s==s1);
		
	}
}
