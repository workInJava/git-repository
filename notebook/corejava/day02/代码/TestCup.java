package com.corejava.day02;

public class TestCup {

	public static void main(String[] args) {
		//1.����һ��Cup ����
		Cup c1 = new Cup();
		//��c1��������Ը�ֵ
//		c1.brand = "��ʦ��";
//		c1.capacity = 10.0;
//		c1.price = 15.8;
		//���ö���c1��show����
		c1.show();
		System.out.println("//-----------------");
		//�ٴ���һ������
//		Cup c2 = new Cup();
//		c2.capacity = 0.43;
//		c2.price = 2.2;
//		c2.show();
		Cup c2 = new Cup("��������","��ɫ",58);
		c2.show();
		
		//����ֻ�룬��ȡc2����ĵ���
		System.out.println(c2.getPrice());
	}
}
