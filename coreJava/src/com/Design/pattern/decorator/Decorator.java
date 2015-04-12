package com.Design.pattern.decorator;

public class Decorator implements ISourceable {
	
	private Source source;
	
	public Decorator(){
		
	}
	
	public Decorator(Source source){
		this.source = source;
	}
	
	

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	@Override
	public void method1() {
		System.out.println("before Decorator");
		source.method1();
		System.out.println("after Decorator");
	}

}
