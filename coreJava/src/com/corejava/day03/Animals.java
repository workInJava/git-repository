package com.corejava.day03;
/************
 * ������
 * @author 	jsd1307
 * @����ʱ�� Jul 23, 2013 1:41:24 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03
 * @�ļ���   Animals.java
 *
 */
public class Animals {

	//����
	private String name; //����
	private String category; //����
	
	//���췽��
	public Animals() {
		super();
	}
	public Animals(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	
	//getter/setter ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	//ҵ�񷽷�
	public void spark(){
		System.out.println("�����...");
	}
	
	public void eat(){
		System.out.println("�����....");
	}
	
}

