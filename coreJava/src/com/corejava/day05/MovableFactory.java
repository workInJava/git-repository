package com.corejava.day05;
/***********
 * �򵥹�����
 * @author 	jsd1307
 * @����ʱ�� Jul 25, 2013 3:06:41 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day05
 * @�ļ���   MovableFactory.java
 *
 */
public class MovableFactory {

	/***********
	 * �򵥹�������
	 * @return
	 */
	public static Movable getInstance(){
//		return new Car();
		return new Rocket();
	}
}
