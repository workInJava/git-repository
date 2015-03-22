package com.corejava.day12;

import org.junit.Test;

public class TestReflectDemo {

	@Test
	public void testPrint(){
		String cn = "java.util.TreeMap";
		ReflectDemo.introspect(cn);
	}
}
