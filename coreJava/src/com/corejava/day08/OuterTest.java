package com.corejava.day08;

//外部类
public class OuterTest {

	//属性
	private int index = 10;
	private String msg = "外部类";
	//属性，类型是内部类型
	private MemberInner mi;
	
	//成员内部类
	class MemberInner {
		//内部类的属性
		private int index = 100; //故意安排
		//内部类的方法
		public void print(){
			//打印属性值 
			System.out.println("index = "+index);
			System.out.println
				(msg+":"+OuterTest.this.index);
		}
	}
	
	//嵌套类
	public static class MemberNested{
		//属性
		
		//方法
		public void nested(){
			System.out.println("嵌套类...");
		}
	}
	
	public OuterTest(){
		this.mi = new MemberInner();
	}
	
	public void method1(){
		System.out.println("外部类的方法");
		mi.print();
	}
	
}
