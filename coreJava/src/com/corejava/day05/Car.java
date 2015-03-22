/**
 * 
 */
package com.corejava.day05;

/**
 * 汽车类
 * @author 	jsd1307
 * @创建时间 Jul 25, 2013 2:24:03 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day05
 * @文件名   Car.java
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
		("汽车正在以【%d m/s】的速度向【%s】奔驰而去.\n"
				,getSpeed(),convert(direction));
	}

}
