package com.corejava.day02.homework;

public class Screen {
	private String type;
	private int size;
	private String brand;
	public Screen() {
	}
	//set方法和构造方法联用进行参数有效性判断
	public Screen(String type, int size, String brand) {
		this.type = type;
		//1.在构造方法中把需要有效性判断的属性赋值取消
		// this.size = size;
		this.brand = brand;
		//2.并且调用已近做好判断的setXXX()方法
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

	// 做业务判断
	public void setSize(int size) {
		if (size == 17 || size == 19 || size == 23 || size == 25) {
			this.size = size;
		} else {
			System.err.println("输入的尺寸不合法.");
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


