package com.Design.pattern.proxy;

public class CglibProxyBean {

	private String name;
	
	public void method(String name){
		System.out.println(name+"CglibBean");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}
