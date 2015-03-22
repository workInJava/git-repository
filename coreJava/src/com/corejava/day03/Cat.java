package com.corejava.day03;

/**************
 * 动物子类之一： 小猫类
 * @author 	jsd1307
 * @创建时间 Jul 23, 2013 1:45:15 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03
 * @文件名   Cat.java
 *
 */
public class Cat extends Animals {

	//创建构造方法，调用父类构造
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String category) {
		super(name, category);
		// TODO Auto-generated constructor stub
	}

	//业务方法
	public void catchMouse(){
		System.out.printf("【%s】爱抓老鼠.\n"
				,getName() == null ? "小猫" : getName());
		
	}
	
	//重写父类的 eat方法
	@Override
	public void eat() {
//		super.eat();
		System.out.printf("我爱吃鱼...#@$#$##$#@#\n");
	}

	@Override
	public void spark() {
		// TODO Auto-generated method stub
//		super.spark();
		System.out.println(getName()+" 叫:喵喵喵...");
	}
	
}
