/**
 * 
 */
package com.corejava.day04.homework;

/**
 * @author  ZhaoPan
 * @date 	Jul 24, 2013 6:38:49 PM
 * @version v1.0
 * @project corejava
 * @package com.train.day04.homework
 * @file 	TestVehicle.java
 * @since	JDK1.6
 */
public class TestVehicle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleMgmt veM = new VehicleMgmt();
		
		Vehicle veh = veM.getVehicle(VehicleMgmt.CAR);
		
		///veh.run();
		
		/*if(veh != null){
			veM.goHome(veh);
		}else{
			System.out.println("û�л�ȡ����ͨ���ߵ�ʵ��");
			System.out.println("�ز��˼���...");
		}*/
		System.out.println("----------------");
	}

}
