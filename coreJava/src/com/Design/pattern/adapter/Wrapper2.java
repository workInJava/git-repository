package com.Design.pattern.adapter;

public abstract class Wrapper2 implements Sourceable {

	@Override
	public void method1() {
		System.out.println("Wrapper2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Wrapper2 method2");
	}

}
