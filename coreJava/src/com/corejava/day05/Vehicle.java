package com.corejava.day05;

public abstract class Vehicle implements Movable {

	/***********
	 * 把方向的值转换成对应的方向字符串
	 * @param direction
	 * @return
	 */
	protected String convert(int direction){
		String dirStr = "";
		switch (direction) {
		case EAST:
			dirStr = "东";
			break;
		case WEST:
			dirStr = "西";
			break;
		case NORTH:
			dirStr = "北";
			break;
		case SOUTH:
			dirStr = "南";
			break;
		default:
			dirStr = "未知方向";
			break;
		}
		return dirStr;
	}
}
