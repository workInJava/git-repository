package com.corejava.day04;

/************
 * ����ģʽ(Singleton)
	Ŀ�ģ���֤ĳ�����ʵ�������������ֻ����Ψһ��
	����������Ҫ��֤���ʵ����Ψһ�������¡�
	ʵ��ԭ��
	1.���췽��˽�л���
	2.�ṩһ����̬���������汾���Ψһʵ����
	3.�ṩһ��������̬����������ȡ�����Ψһʵ��
 * @author 	jsd1307
 * @����ʱ�� Jul 24, 2013 3:56:03 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day04
 * @�ļ���   Singleton.java
 *
 */
public class Singleton {

	private static Singleton instance 
						= new Singleton();

	// Ϊ�˱�֤������������ɵش�������ʹ��
	// ���췽��˽�л�
	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}
