package com.corejava.day03;

/**************
 * ��������֮һ�� Сè��
 * @author 	jsd1307
 * @����ʱ�� Jul 23, 2013 1:45:15 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03
 * @�ļ���   Cat.java
 *
 */
public class Cat extends Animals {

	//�������췽�������ø��๹��
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String category) {
		super(name, category);
		// TODO Auto-generated constructor stub
	}

	//ҵ�񷽷�
	public void catchMouse(){
		System.out.printf("��%s����ץ����.\n"
				,getName() == null ? "Сè" : getName());
		
	}
	
	//��д����� eat����
	@Override
	public void eat() {
//		super.eat();
		System.out.printf("�Ұ�����...#@$#$##$#@#\n");
	}

	@Override
	public void spark() {
		// TODO Auto-generated method stub
//		super.spark();
		System.out.println(getName()+" ��:������...");
	}
	
}
