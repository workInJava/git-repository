package com.corejava.day03;
/*************
 * ˮ����
 * @author 	jsd1307
 * @����ʱ�� Jul 23, 2013 10:57:26 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03
 * @�ļ���   Fruits.java
 *
 */
public class Fruits {

	//����
	private String name; //����
	private String category; //����
	private String color; //��ɫ
	
	
	public Fruits() {
//		super();
		System.out.println("Fruits: �ղι���...");
	}

	public Fruits(String name, String category, String color) {
//		super();
		System.out.println("Fruits: 3�ι���...");
		this.name = name;
		this.category = category;
		this.color = color;
	}
	
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	//����
	/**********
	 * ����ˮ����Ϣ�ķ���
	 */
	public void desc(){
		System.out.printf("ˮ�����ƣ���%s��\n"
				,name == null ? "����ˮ��" : name);
		System.out.printf("ˮ�����ࣺ��%s��\n"
				,category == null ? "������" : category);
		System.out.printf("ˮ����ɫ����%s��\n"
				,color == null ? "��ɫ" : color);
	}
}
