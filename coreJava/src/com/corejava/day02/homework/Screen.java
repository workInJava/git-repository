package com.corejava.day02.homework;

public class Screen {
	private String type;
	private int size;
	private String brand;
	public Screen() {
	}
	//set�����͹��췽�����ý��в�����Ч���ж�
	public Screen(String type, int size, String brand) {
		this.type = type;
		//1.�ڹ��췽���а���Ҫ��Ч���жϵ����Ը�ֵȡ��
		// this.size = size;
		this.brand = brand;
		//2.���ҵ����ѽ������жϵ�setXXX()����
		setSize(size);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	// ��ҵ���ж�
	public void setSize(int size) {
		if (size == 17 || size == 19 || size == 23 || size == 25) {
			this.size = size;
		} else {
			System.err.println("����ĳߴ粻�Ϸ�.");
			this.size = 17;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}


