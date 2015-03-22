package com.corejava.day08;

import com.corejava.day05.Movable;
import com.corejava.day05.Vehicle;

//局部内部类与匿名内部内 演示
public class LocalInner {

	//属性
	private String name;
	
	public LocalInner(String name){
		this.name = name;
	}
	
	public void goHome(int d,final String target){
		
		System.out.println("我要回家...");
		//需要一个可移动的交通工具
		//定义一个内部类来实现 可移动的 接口
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
				("UFO正以[%d km/s]的速度向[%s]移动,载【%s】回【%s】上\n"
				,getSpeed()/1000
				,convert(direction),name,target);
			}
		}
		//创建一个UFO 对象
		Vehicle v = new UFO();
		v.move(d);
		System.out.println("到家了...");*/
		//匿名内部类
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
				("UFO正以[%d km/s]的速度向[%s]移动,载【%s】回【%s】上\n"
				,getSpeed()/1000
				,convert(direction),name,target);
			}
		};
		v.move(d);
		System.out.println("到家了...");
	}
	
	public static void main(String[] args) {
		//创建对象
		LocalInner li = new LocalInner("王聪");
		li.goHome(Movable.EAST,"火星");
	}
}
