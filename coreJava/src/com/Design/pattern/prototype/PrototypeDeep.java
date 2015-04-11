package com.Design.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.corejava.day02.Cup;

public class PrototypeDeep implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	private Cup cup;
	
	

	public Cup getCup() {
		return cup;
	}



	public void setCup(Cup cup) {
		this.cup = cup;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	//…Ó∏¥÷∆
	public Object deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		Object o = ois.readObject();
		
		
		return o;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException{
//		PrototypeDeep d1 = new PrototypeDeep();
//		Cup c = new Cup();
//		c.setBrand("cup");
//		c.setCapacity(3.20);
//		d1.setCup(c);
//		d1.setName("d1");
//		d1.setAge(23);
//		
//		PrototypeDeep d2 = (PrototypeDeep)d1.clone();
//		System.out.println(d1.getName());
//		System.out.println(d1.getAge() == d2.getAge());
//		System.out.println(d2.getName() == d1.getName());
//		System.out.println(d2.getCup() == d1.getCup());
//		System.out.println("---------------------------");
//		PrototypeDeep d3 = (PrototypeDeep)d1.deepClone();
//		System.out.println(d1.getAge() == d3.getAge());
//		System.out.println(d1.getName() == d3.getName());
//		System.out.println(d3.getCup() == d1.getCup());
//		d2.setName("d2");
//		d2.getCup().setBrand("cup1");
//		System.out.println(d1.getName());
//		System.out.println("d1.getCup().getBrand()£∫£∫£∫£∫"+d1.getCup().getBrand());
//		
//		System.out.println("String-------------------------------------------");
//		
//		String ns = "hhhhhhh";
//		String se = new String("hhhhhhh");
//		String de = "hhhhhhh";
//		System.out.println(ns==se);
//		System.out.println(ns == de);
		
		
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str == str1);//true
		System.out.println(str1 == "abc");//true
		System.out.println(str2 == "abc");//false
		System.out.println(str1 == str2);//false
		System.out.println(str1.equals(str2));//true
		System.out.println(str1 == str2.intern());//true
		System.out.println(str2.intern());
		System.out.println(str2 == str2.intern());//false
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode() == str2.hashCode());

	}
}
