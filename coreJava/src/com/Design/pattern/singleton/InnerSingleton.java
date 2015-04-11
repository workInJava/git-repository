package com.Design.pattern.singleton;

public class InnerSingleton {

	private InnerSingleton(){
		
	}
	
	private static class Inner{
		private static InnerSingleton INSTANCE = new InnerSingleton(); 
	}
	
	public static InnerSingleton getInstance(){
		return Inner.INSTANCE;
	}
}
