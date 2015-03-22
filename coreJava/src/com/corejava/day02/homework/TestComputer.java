package com.corejava.day02.homework;

public class TestComputer {
	public static void main(String[] args) {
		//1.创建一个Computer对象
		Computer c1=new Computer();
		c1.setBrand("联想");
		c1.setPrice(4000);
		c1.outputComputerInfo();
		System.out.println("///---------------");
	 
		Computer c = new Computer();
		c.setBrand("联想");
		c.setPrice(4000);
		c.setDescription( "I7/500G/7200转/4G内存/独显");
		

		// 创建一个Screen对象
		Screen screen = new Screen("LED", 17, "ViewSonic");
		// 把screen对象注册到 computer之中
		c.setScreen(screen);

		c.outputComputerInfo();
		
	}
}

	



