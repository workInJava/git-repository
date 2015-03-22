package com.corejava.day02.homework;

public class Computer {

	private String brand;
	private double price;
	private String description;
	private Screen screen;

	//构造方法
	public Computer() {
		System.out.println("空参构造");
	}
	public Computer(String brand,String description,double price){
		System.out.println("三参构造");
		//用来给属性赋值
		this.brand =brand;
		this.description=description;
		//this.price=price;
		/*//判断此容量是否附合要求
		if(price < 1000 || price > 10000){
			System.err.println("价格参数不合法");
			this.price = 2000;
		}else{
			this.price=price;
		}
		*/
		setPrice(price);
	}
	
	//方法
	//set系列方法
	public void setBrand(String brand){
		this.brand=brand;//给属性赋值
		
	}
	public void setPrice(double p){
		//做有效性判断
		if(p < 1000 || p > 20000){
			System.out.println("价格参数不合法");
			price = 2000;
		}else{
			this.price = p;
		}
		
	}
	public void setDescription(String description){
			this.description=description;
		
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	//get系列方法
	public double getPrice(){
		return this.price;
	}
	
	public String getBrand(){
		return this.brand;
	}
	public String getDescription(){
		return this.description;
	}
	public Screen getScreen() {
		return screen;
	}

	/***
	 * 展示电脑的基本信息
	 */
	public void outputComputerInfo() {
		System.out.println("此电脑的品牌是："+(brand == null ? "无品牌":brand));
		System.out.println("它的价格是："+price);
		System.out.println("描述是："+(description == null ? "无描述" : description));
		//System.out.printf("描述是 %s\n",description);
		if(screen != null){
			System.out.println("显示器信息如下：");
			System.out.println("\t"+screen.getBrand());
			System.out.println("\t"+screen.getSize());
			System.out.println("\t"+screen.getType());
		}else{
			System.out.println("此电脑没有配显示器");
		}
	}
}



