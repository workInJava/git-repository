package com.corejava.day05;

public abstract class Vehicle implements Movable {

	/***********
	 * �ѷ����ֵת���ɶ�Ӧ�ķ����ַ���
	 * @param direction
	 * @return
	 */
	protected String convert(int direction){
		String dirStr = "";
		switch (direction) {
		case EAST:
			dirStr = "��";
			break;
		case WEST:
			dirStr = "��";
			break;
		case NORTH:
			dirStr = "��";
			break;
		case SOUTH:
			dirStr = "��";
			break;
		default:
			dirStr = "δ֪����";
			break;
		}
		return dirStr;
	}
}
