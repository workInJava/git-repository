package com.corejava.day02;

import java.util.Calendar;
import java.util.Date;

/*************************
 * ����
 * @author 	jsd1307
 * @����ʱ�� Jul 22, 2013 1:59:27 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day02
 * @�ļ���   Person.java
 *
 */
public class Person {

	//����
	private String name; //����
	private char gender; //�Ա�
	private Date birth; //����
	private String shengxiao; //��Ф
	
	//���Ե��������Զ������ͣ����磬���������
	private Person couple; //��һ��
	
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
		//�Զ�ע���� һ��
//		couple.setCouple(this); ������
		couple.couple = this;
	}
	//���췽��
	public Person(){
		System.out.println("....�ղι���");
	}
	public Person(String name){
		System.out.println("...1�ι���.");
		this.name = name;
	}
	public Person(String name,char gender,Date birth){
//		this.name = name;
		this(name); //�����������췽��
		System.out.println("...3�ι���.");
//		this.gender = gender;
		setGender(gender);
		this.birth = birth;
	}
	
	//get/set����
	public void setName(String name){
		this.name = name;
	}
	/****
	 * �Ա�ķ�Χ���� �� Ů
	 * @param gender
	 */
	public void setGender(char gender){
		//�ж�
		if(gender != '��' && gender != 'Ů'){
			System.err.println("�Ա𲻺Ϸ�.");
			
		}else{
			this.gender = gender;
		}
	}
	
	public void setBirth(Date birth){
		this.birth = birth;
		//�趨һ���㷨������ȡ��Ф
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
	
	//ҵ�񷽷�
	public void sayHello(){
		//���к�
		System.out.println("�ҽ�,"+name);
		System.out.printf("����%d����.\n",getAge());
	}
	
	//��ȡ����
	private int getAge() {
		//��ȡ��ǰ�������ڵ�����
		Calendar c1 = Calendar.getInstance();
		//��ȡ���� ���
		int y1 = c1.get(Calendar.YEAR);
		//�ٰ�c1�������е����ڸ�Ϊ�������ڵ�����
		c1.setTime(birth);
		//�ٻ�ȡ���
		int y2 = c1.get(Calendar.YEAR);
		
		return y1 - y2; //�������������Ϳ��Եõ����� 
	}
}

