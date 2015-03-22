package com.corejava.day13;

public class Children {

	private final Parent p= new Parent(this);
	
	private String name;
	
	public Children(){
		
	}
	
	public Children(String name){
		System.out.println("Children±»´´½¨");
		this.name = name;
		this.p.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
