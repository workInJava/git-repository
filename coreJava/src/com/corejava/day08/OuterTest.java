package com.corejava.day08;

//�ⲿ��
public class OuterTest {

	//����
	private int index = 10;
	private String msg = "�ⲿ��";
	//���ԣ��������ڲ�����
	private MemberInner mi;
	
	//��Ա�ڲ���
	class MemberInner {
		//�ڲ��������
		private int index = 100; //���ⰲ��
		//�ڲ���ķ���
		public void print(){
			//��ӡ����ֵ 
			System.out.println("index = "+index);
			System.out.println
				(msg+":"+OuterTest.this.index);
		}
	}
	
	//Ƕ����
	public static class MemberNested{
		//����
		
		//����
		public void nested(){
			System.out.println("Ƕ����...");
		}
	}
	
	public OuterTest(){
		this.mi = new MemberInner();
	}
	
	public void method1(){
		System.out.println("�ⲿ��ķ���");
		mi.print();
	}
	
}
