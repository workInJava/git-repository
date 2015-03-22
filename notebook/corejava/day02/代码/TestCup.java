package com.corejava.day02;

public class TestCup {

	public static void main(String[] args) {
		//1.创建一个Cup 对象
		Cup c1 = new Cup();
		//给c1对象的属性赋值
//		c1.brand = "康师父";
//		c1.capacity = 10.0;
//		c1.price = 15.8;
		//调用对象c1的show方法
		c1.show();
		System.out.println("//-----------------");
		//再创建一个对象
//		Cup c2 = new Cup();
//		c2.capacity = 0.43;
//		c2.price = 2.2;
//		c2.show();
		Cup c2 = new Cup("迪亚天天","红色",58);
		c2.show();
		
		//本处只想，获取c2对象的单价
		System.out.println(c2.getPrice());
	}
}
