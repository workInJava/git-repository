/**
 * 
 */
package com.corejava.day05;

/**
 * ������
 * @author 	jsd1307
 * @����ʱ�� Jul 25, 2013 2:24:03 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day05
 * @�ļ���   Car.java
 *
 */
public class Car extends Vehicle implements Checked{

	/* (non-Javadoc)
	 * @see com.corejava.day05.Movable#getSpeed()
	 */
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return (int)(120/3.6);
	}

	/* (non-Javadoc)
	 * @see com.corejava.day05.Movable#move(int)
	 */
	@Override
	public void move(int direction) {
		// TODO Auto-generated method stub
		System.out.printf
		("���������ԡ�%d m/s�����ٶ���%s�����۶�ȥ.\n"
				,getSpeed(),convert(direction));
	}

}
