package com.corejava.day03;

/******************
 * 动物子类 -- 小狗类
 * @author 	jsd1307
 * @创建时间 Jul 23, 2013 1:52:17 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03
 * @文件名   Dog.java
 *
 */
public class Dog extends Animals {

	//属性
	private boolean pet; //是否是宠物狗

	public Dog(boolean pet) {
		super();
		this.pet = pet;
	}

	public Dog(String name, String category, boolean pet) {
		super(name, category);
		this.pet = pet;
	}

	public boolean isPet() { //getPet()
		return pet;
	}

	public void setPet(boolean pet) {
		this.pet = pet;
	}

	//业务方法
	public void play(){
		String name = getName(); //局部变量
		//如果是宠物狗，则可以陪主人逛街
		if(pet){
			System.out.printf(
				"我是[%s],是一只宠物狗，可以陪主人逛街哦！\n"
				,name == null ? "小狗" : name);
		}else{
			System.out.printf(
				"我叫[%s],可不是宠物，我是有野性的.\n"
				,name == null ? "野狗狗" : name);
		}
	}
	
	//重写父类的eat方法
	public void eat(){
		System.out.printf("我爱吃骨头... #$@#$#$#$\n");
	}
	
	@Override
	public void spark() {
		// TODO Auto-generated method stub
//		super.spark();
		System.out.println(getName()+" 汪汪汪...");
	}
}
