package com.corejava.day05.homework;

import java.util.Date;

public class TestInner {
	
	private String name;
	class Inner{
		private Date date;
		public void method(){
			name="ss";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
