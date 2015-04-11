package com.Design.pattern.adapter;

public class AdapterTest {

	public static void main(String[] args){
		Targetable t = new Adapter();
		t.method1();
		t.method2();
		Source source = new Source();
		Targetable s = new Wrapper(source);
		s.method1();
		s.method2();
	}
	
	//ÊÊÅäÆ÷Ä£Ê½
}
