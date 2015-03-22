package com.corejava.day05;
/*************
 * ���ƶ��� �ӿ�
 * @author 	jsd1307
 * @����ʱ�� Jul 25, 2013 2:07:45 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day05
 * @�ļ���   Movable.java
 *
 */
public interface Movable {
	//���峣������
	int EAST = 1; //��
	//�൱��:public static final int EAST = 1;
	int WEST = 2; //��
	
	int SOUTH = 3; //��
	
	int NORTH = 4; //��
	
	/****************
	 * �ƶ�����
	 * @param direction ����, 
	 * ����ֵӦ���� EAST, WEST,SOUTH,NORTH �ĸ�����֮һ
	 */
	void move(int direction);
	//�൱�ڣ�public abstract void move(int direction);
	/********
	 * ��ȡ�ƶ����ٶ�
	 * @return
	 */
	int getSpeed();
	
}
