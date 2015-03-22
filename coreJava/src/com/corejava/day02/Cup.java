package com.corejava.day02;

import java.util.Date;

/********************
 * OO�Ļ�����ʾ
 * @author 	jsd1307
 * @����ʱ�� Jul 22, 2013 10:34:46 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day02
 * @�ļ���   Cup.java
 *
 */
public class Cup {

	//����
	private double price; //����
	private String color; //��ɫ
	private double capacity; //����,ҵ��涨��С�� 0.2��5.0֮��
	private Date produceDate; //��������
	private String brand = "�ֿ�"; //Ʒ��
	
	//���췽��
	public Cup(){ //�ղι���
		System.out.println("�ղι���..");
	}
	
	public Cup(String b, String c, double cap){
		this(b,cap); //����2�ι���
		System.out.println("���ι���....");
		//���������Ը�ֵ
//		brand = b;
		color = c;
		//�жϴ������Ƿ񸽺�Ҫ��
		/*if(cap < 0.2 || cap > 5.0){
			System.out.println("�����������Ϸ�");
			capacity = 1;
		}else{
			capacity = cap;
		}*/
//		setCapacity(cap);
	}
	
	public Cup(String b, double cap){
		System.out.println("2�ι���");
		brand = b;
		//�жϴ������Ƿ񸽺�Ҫ��
		/*if(cap < 0.2 || cap > 5.0){
			System.out.println("�����������Ϸ�");
			capacity = 1;
		}else{
			capacity = cap;
		}*/
		setCapacity(cap);
	}
	
	//����
	//setϵ�з���
	public void setBrand(String b){
		brand = b; //�����Ը�ֵ
	}
	public void setCapacity(double c){
		//����Ч���ж�
		if(c < 0.2 || c > 5.0){
			System.out.println("�����������Ϸ�");
			capacity = 1;
		}else{
			capacity = c;
		}
	}
	
	//...
	
	//getϵ�з���
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
	 * չʾˮ���Ļ�����Ϣ
	 */
	public void show(){
		System.out.println("��ˮ����Ʒ���ǣ�"+this.brand);
		System.out.println("������ɫ�ǣ�"+color);
		System.out.println("�����ǣ�"+capacity);
	}
	
}

