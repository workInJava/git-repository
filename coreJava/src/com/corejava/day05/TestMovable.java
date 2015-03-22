package com.corejava.day05;

/**********
 * ������
 * @author 	jsd1307
 * @����ʱ�� Jul 25, 2013 2:26:56 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day05
 * @�ļ���   TestMovable.java
 *
 */
public class TestMovable {

	public static void main(String[] args) {
		//��������
//		Movable r = new Car();
		//���ü򵥹�������
		Movable r = MovableFactory.getInstance();
		//��������� Checked ��ǣ�����ʾ��Ҫ����
		if(r instanceof Checked){
			System.out.println("ע�⣬�벻Ҫ����...");
		}
		r.move(Movable.EAST);
	}
}


