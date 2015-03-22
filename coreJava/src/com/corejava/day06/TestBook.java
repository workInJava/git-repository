package com.corejava.day06;

public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book("Ī��a","����ƣ��b",18.6);
		Book b2 = new Book("Ī��b","����ƣ��a",19.6);
		
		System.out.println(b1 == b2);
		
		System.out.println(b1.equals(b2));
		
		System.out.println(b1.hashCode()+","+b2.hashCode());
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1 = null; //�ϵ� b1������
		//�ֶ�����һ�� gc
		System.gc();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(
				Thread.currentThread().getName()+
				" ���н���...");
	}
}


