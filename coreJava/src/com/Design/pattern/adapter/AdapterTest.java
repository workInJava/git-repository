package com.Design.pattern.adapter;

public class AdapterTest {

	public static void main(String[] args){
		//类适配模式，写一个Adapter类继承原类实现接口，那么这个类就可以满足这个接口了
		Targetable t = new Adapter();
		t.method1();
		t.method2();
		Source source = new Source();
		Targetable s = new Wrapper(source);
		s.method1();
		s.method2();
		System.out.println("========================");
		Sourceable s1 = new Source1();
		Sourceable s2 = new Source2();
		
		//适配器模式借助抽象类实现接口所有方法，实现类不用直接与接口打交道，继承抽象类重写自己想要的方法
		s1.method1();//覆盖抽像类的方法
		s1.method2();
		
		s2.method1();
		s2.method2();//覆盖抽像类的方法
	
	}
	
	//适配器模式
}
