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
	
	//���峣��
	public static final int BIKE = 1;
	public static final int PLANE = 2;
	public static final int CAR = 3;
	public static final int TRAIN = 4;
	
	//����
	/*
	 * ��ȡ���ֽ�ͨ����
	 */
	public Vehicle getVehicle(int type) {
		Vehicle veh=null;
//		String str = null;
		switch (type) {
		case BIKE:
			 veh = new Bike("���г�");
//			 str = veh.getKind();
			break;
		case PLANE:
			 veh = new Plane("�ɻ�");
//			 str = veh.getKind();
			break;
		case CAR:
			 veh= new Car("����");
//			 str = veh.getKind();
			break;
		case TRAIN:
			veh = new Train("��");
			break;
//		default:
//			if(veh==null){
//				veh = new Vehicle("���");
//			}
//			break;
		}
		/*if (veh==null) {
			System.out.println("û��ѡ��ͨ����");	
		}else{
			System.out.printf
			("��ѡ����[%s]�ؼ�.\n",veh.getKind());
		}*/
		return veh;
	}
	/*
	 * ʹ��ĳ�ֽ�ͨ���߻ؼ�
	 * 1.�˷����ܰѳ�����ͨ����֮ǰ��ͨ�õ�ҵ�������
	 * ���磺��Ʊ�����졢��
	 * 2.ͬ���ģ����������ͨ���߻ص�Ŀ�ĵ��Ժ�Ҳ�����
	 * һЩͨ�õ�ҵ��
	 * ���磺��վ��Ʊ��������
	 */
	public void goHome(Vehicle veh) {
		System.out.println("׼���ؼ�...");
		//�ص�˼�� callback
		veh.run();
		System.out.println("������...");
	}
	
}

