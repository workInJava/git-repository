package com.Design.pattern.singleton;

import java.util.Vector;

public class ShadowSingleton {

	private static ShadowSingleton instance = null;
	private Vector properties  = null;

	public Vector getProperties(){
		return properties;
	}
	
	private ShadowSingleton(){
		
	}
	
	private static synchronized void syncInit(){
		if(instance==null){
			instance = new ShadowSingleton();
		}
	} 
	
	 public static ShadowSingleton getInstance() {  
		 if (instance == null) {
			 syncInit();
		 }
		 return instance;
	 }
	
	 public void updateProperties() { 
		 
		 ShadowSingleton shadow = new ShadowSingleton();  
		 
		 properties = shadow.getProperties();
	 }
	
	 
	 public static void main(String[] args){
		 ShadowSingleton d = ShadowSingleton.getInstance();
		 ShadowSingleton d2 = ShadowSingleton.getInstance();
		 System.out.println(d==d2);
	 }
	 
}
