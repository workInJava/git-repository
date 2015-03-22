package com.corejava.day02;

import java.util.Date;

/********************
 * OO的基本演示
 * @author 	jsd1307
 * @创建时间 Jul 22, 2013 10:34:46 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day02
 * @文件名   Cup.java
 *
 */
public class Cup {

	//属性
	private double price; //单价
	private String color; //颜色
	private double capacity; //容量,业务规定大小在 0.2至5.0之间
	private Date produceDate; //出厂日期
	private String brand = "乐扣"; //品牌
	
	//构造方法
	public Cup(){ //空参构造
		System.out.println("空参构造..");
	}
	
	public Cup(String b, String c, double cap){
		this(b,cap); //调用2参构造
		System.out.println("三参构造....");
		//用来给属性赋值
//		brand = b;
		color = c;
		//判断此容量是否附合要求
		/*if(cap < 0.2 || cap > 5.0){
			System.out.println("容器参数不合法");
			capacity = 1;
		}else{
			capacity = cap;
		}*/
//		setCapacity(cap);
	}
	
	public Cup(String b, double cap){
		System.out.println("2参构造");
		brand = b;
		//判断此容量是否附合要求
		/*if(cap < 0.2 || cap > 5.0){
			System.out.println("容器参数不合法");
			capacity = 1;
		}else{
			capacity = cap;
		}*/
		setCapacity(cap);
	}
	
	//方法
	//set系列方法
	public void setBrand(String b){
		brand = b; //给属性赋值
	}
	public void setCapacity(double c){
		//做有效性判断
		if(c < 0.2 || c > 5.0){
			System.out.println("容器参数不合法");
			capacity = 1;
		}else{
			capacity = c;
		}
	}
	
	//...
	
	//get系列方法
	public double getPrice(){
		return price;
	}
	
	public String getColor(){
		return color;
	}
	public String getBrand(){
		return brand;
	}
	//...
	
	/*******
	 * 展示水杯的基本信息
	 */
	public void show(){
		System.out.println("此水杯的品牌是："+this.brand);
		System.out.println("它的颜色是："+color);
		System.out.println("容量是："+capacity);
	}
	
}

