package com.corejava.day08;

import com.corejava.day05.Movable;
import com.corejava.day05.Vehicle;

//�ֲ��ڲ����������ڲ��� ��ʾ
public class LocalInner {

	//����
	private String name;
	
	public LocalInner(String name){
		this.name = name;
	}
	
	public void goHome(int d,final String target){
		
		System.out.println("��Ҫ�ؼ�...");
		//��Ҫһ�����ƶ��Ľ�ͨ����
		//����һ���ڲ�����ʵ�� ���ƶ��� �ӿ�
		/*class UFO extends Vehicle{
			@Override
			public int getSpeed() {
				// TODO Auto-generated method stub
				return 300000000;
			}
			@Override
			public void move(int direction) {
				// TODO Auto-generated method stub
				System.out.printf
				("UFO����[%d km/s]���ٶ���[%s]�ƶ�,�ء�%s���ء�%s����\n"
				,getSpeed()/1000
				,convert(direction),name,target);
			}
		}
		//����һ��UFO ����
		Vehicle v = new UFO();
		v.move(d);
		System.out.println("������...");*/
		//�����ڲ���
		Vehicle v = new Vehicle(){
			@Override
			public int getSpeed() {
				// TODO Auto-generated method stub
				return 300000000;
			}
			@Override
			public void move(int direction) {
				// TODO Auto-generated method stub
				System.out.printf
				("UFO����[%d km/s]���ٶ���[%s]�ƶ�,�ء�%s���ء�%s����\n"
				,getSpeed()/1000
				,convert(direction),name,target);
			}
		};
		v.move(d);
		System.out.println("������...");
	}
	
	public static void main(String[] args) {
		//��������
		LocalInner li = new LocalInner("����");
		li.goHome(Movable.EAST,"����");
	}
}
