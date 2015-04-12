package com.Design.pattern.decorator;

public class TestDecorator {

	public static void main(String[] args){
		ISourceable s = new Decorator(new Source());
		s.method1();
	}
}
