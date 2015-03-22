package com.corejava.day13;

public class Parent {

	private Children child;
	
	public Parent(){
		
	}
	public Parent(Children child){
		System.out.println("Pratent±»´´½¨");
		this.child = child;
		//this.toString();
	}
	
	@Override
	public String toString() {
		System.out.println(child.getName());
		return child.getName();
	}
	
	
	
}
