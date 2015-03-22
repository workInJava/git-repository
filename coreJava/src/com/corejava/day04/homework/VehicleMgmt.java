/**
 * 
 */
package com.corejava.day04.homework;

/**
 * @author  ZhaoPan
 * @date 	Jul 24, 2013 6:23:24 PM
 * @version v1.0
 * @project corejava
 * @package com.train.day04.homework
 * @file 	VehicleMgmt.java
 * @since	JDK1.6
 */
public class VehicleMgmt {
	
	//定义常量
	public static final int BIKE = 1;
	public static final int PLANE = 2;
	public static final int CAR = 3;
	public static final int TRAIN = 4;
	
	//方法
	/*
	 * 获取哪种交通工具
	 */
	public Vehicle getVehicle(int type) {
		Vehicle veh=null;
//		String str = null;
		switch (type) {
		case BIKE:
			 veh = new Bike("自行车");
//			 str = veh.getKind();
			break;
		case PLANE:
			 veh = new Plane("飞机");
//			 str = veh.getKind();
			break;
		case CAR:
			 veh= new Car("汽车");
//			 str = veh.getKind();
			break;
		case TRAIN:
			veh = new Train("火车");
			break;
//		default:
//			if(veh==null){
//				veh = new Vehicle("火箭");
//			}
//			break;
		}
		/*if (veh==null) {
			System.out.println("没有选择交通工具");	
		}else{
			System.out.printf
			("你选择了[%s]回家.\n",veh.getKind());
		}*/
		return veh;
	}
	/*
	 * 使用某种交通工具回家
	 * 1.此方法能把乘坐交通工具之前的通用的业务处理掉，
	 * 比如：检票、安检、等
	 * 2.同样的，在你乘坐交通工具回到目的地以后，也处理掉
	 * 一些通用的业务。
	 * 比如：出站检票，。。。
	 */
	public void goHome(Vehicle veh) {
		System.out.println("准备回家...");
		//回调思想 callback
		veh.run();
		System.out.println("到家了...");
	}
	
}

