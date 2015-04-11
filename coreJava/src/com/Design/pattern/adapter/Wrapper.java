package com.Design.pattern.adapter;

public class Wrapper implements Targetable {
	
	
	private Source source;
	
	public Wrapper(){
		
	}
	
	public Wrapper(Source source){
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("Wrapper method2");
	}

}
