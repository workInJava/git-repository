package com.Design.pattern.adapter;

public class AdapterTest {

	public static void main(String[] args){
		//������ģʽ��дһ��Adapter��̳�ԭ��ʵ�ֽӿڣ���ô�����Ϳ�����������ӿ���
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
		
		//������ģʽ����������ʵ�ֽӿ����з�����ʵ���಻��ֱ����ӿڴ򽻵����̳г�������д�Լ���Ҫ�ķ���
		s1.method1();//���ǳ�����ķ���
		s1.method2();
		
		s2.method1();
		s2.method2();//���ǳ�����ķ���
	
	}
	
	//������ģʽ
}
