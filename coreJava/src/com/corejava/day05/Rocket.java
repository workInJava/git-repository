/**
 * 
 */
package com.corejava.day05;

/**
 * �����
 * @author 	jsd1307
 * @����ʱ�� Jul 25, 2013 2:17:56 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day05
 * @�ļ���   Rocket.java
 *
 */
public class Rocket extends Vehicle {

	/* (non-Javadoc)
	 * @see com.corejava.day05.Movable#getSpeed()
	 */
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 7900;
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.Movable#move(int)
	 */
	@Override
	public void move(int direction) {
		// TODO Auto-generated method stub
		System.out.printf
		("��������ԡ�%d m/s�����ٶ���%s���ƶ�.\n"
				,getSpeed(),convert(direction));
	}

}
