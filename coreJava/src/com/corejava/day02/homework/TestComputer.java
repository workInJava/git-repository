package com.corejava.day02.homework;

public class TestComputer {
	public static void main(String[] args) {
		//1.����һ��Computer����
		Computer c1=new Computer();
		c1.setBrand("����");
		c1.setPrice(4000);
		c1.outputComputerInfo();
		System.out.println("///---------------");
	 
		Computer c = new Computer();
		c.setBrand("����");
		c.setPrice(4000);
		c.setDescription( "I7/500G/7200ת/4G�ڴ�/����");
		

		// ����һ��Screen����
		Screen screen = new Screen("LED", 17, "ViewSonic");
		// ��screen����ע�ᵽ computer֮��
		c.setScreen(screen);

		c.outputComputerInfo();
		
	}
}

	



