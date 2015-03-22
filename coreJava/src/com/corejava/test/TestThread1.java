package com.corejava.test;

public class TestThread1 implements Runnable{

	int b = 100;
	public synchronized void m1() throws Exception {
		b =  1000;
		Thread.sleep(5000);
		System.out.println("b="+b);
	}
	public synchronized void m2() throws Exception {
		b = 2000;
		Thread.sleep(2500);
	}	
	public void run() {
		try{
			m1();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception{
		TestThread1 th = new TestThread1();
		Thread t = new Thread(th);
		t.start();
		
		Thread.sleep(1000);
		th.m2();
		System.out.println(th.b);
	}
}
