package com.corejava.test;

import java.util.Calendar;
import java.util.Date;

public class B extends A{
	static{
		System.out.println("b");
	    }
	    public B(){System.out.println("2");}
	    
	    public static void main(String args[]){
	    	Date date = new Date("2014-10-11");
	    	Calendar mc = Calendar.getInstance();
	    	mc.setTime(date);
	    	System.out.println(mc);
	    }
}
