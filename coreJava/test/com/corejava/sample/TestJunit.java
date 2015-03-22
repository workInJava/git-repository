package com.corejava.sample;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TestJunit {

//	private Scene s;
	
	@Before
	public void init(){
		System.out.println("before....");
//		this.s = new Scene();
	}
	
	@After
	public void end(){
		System.out.println("-- after ....");
	}
	
	@BeforeClass
	public static void init2(){
		System.out.println("beforeclass....");
	}
	
	@Test
	public void a(){
		System.out.println("test a()");
//		s.start();
	}
	
	@Test
	public void b(){
		System.out.println("test b()");
//		s.start();
	}
}
