package com.corejava.day02;

import java.util.Calendar;
import java.util.Date;

/*************************
 * 人类
 * @author 	jsd1307
 * @创建时间 Jul 22, 2013 1:59:27 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day02
 * @文件名   Person.java
 *
 */
public class Person {

	//属性
	private String name; //姓名
	private char gender; //性别
	private Date birth; //生日
	private String shengxiao; //生肖
	
	//属性的类型是自定义类型，比如，本身的类型
	private Person couple; //另一半
	
	/**
	 * @return the couple
	 */
	public Person getCouple() {
		return couple;
	}
	/**
	 * @param couple the couple to set
	 */
	public void setCouple(Person couple) {
		this.couple = couple;
		//自动注册另 一边
//		couple.setCouple(this); 死调用
		couple.couple = this;
	}
	//构造方法
	public Person(){
		System.out.println("....空参构造");
	}
	public Person(String name){
		System.out.println("...1参构造.");
		this.name = name;
	}
	public Person(String name,char gender,Date birth){
//		this.name = name;
		this(name); //调用其它构造方法
		System.out.println("...3参构造.");
//		this.gender = gender;
		setGender(gender);
		this.birth = birth;
	}
	
	//get/set方法
	public void setName(String name){
		this.name = name;
	}
	/****
	 * 性别的范围：男 或 女
	 * @param gender
	 */
	public void setGender(char gender){
		//判断
		if(gender != '男' && gender != '女'){
			System.err.println("性别不合法.");
			
		}else{
			this.gender = gender;
		}
	}
	
	public void setBirth(Date birth){
		this.birth = birth;
		//设定一个算法，来获取生肖
//		int year = birth.getYear();
//		this.shengxiao = getShengXiao(year);
	}
	
	public String getName(){
		return this.name;
	}
	public char getGender(){
		return this.gender;
	}
	public Date getBirth(){
		return this.birth;
	}
	public String getShengXiao(){
		return this.shengxiao;
	}
	
	//业务方法
	public void sayHello(){
		//打招呼
		System.out.println("我叫,"+name);
		System.out.printf("今年%d岁了.\n",getAge());
	}
	
	//获取年龄
	private int getAge() {
		//获取当前日期所在的日历
		Calendar c1 = Calendar.getInstance();
		//获取今年 年份
		int y1 = c1.get(Calendar.YEAR);
		//再把c1日历所有的日期改为生日所在的日期
		c1.setTime(birth);
		//再获取年份
		int y2 = c1.get(Calendar.YEAR);
		
		return y1 - y2; //两个年份相减，就可以得到年龄 
	}
}

