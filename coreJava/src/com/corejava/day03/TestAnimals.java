package com.corejava.day03;

public class TestAnimals {

	public static void main(String[] args) {
		Cat c1 = new Cat("小花","猫科动物");
		Animals c2 = new Cat("小黑","猫科动物");//ok
		
		Animals d1 = new Dog("旺财","哺乳动物",true);//ok
		Dog d2 = new Dog("藏獒","哺乳动物",false); //ok
		
//		c1.catchMouse();
//		c1.spark();
		c2.eat(); //Animals, Cat
		System.out.println("//--------------");
		d1.eat();
		
		System.out.println("//--------------");
		c2.spark();
		c1.spark();
		System.out.println("//--------------");
		d1.spark();
		d2.spark();
		System.out.println("#################");
		//创建 一个 Animals数组来存放以上4个对象
		Animals[] as = new Animals[4];
		//存放元素
		as[0] = c1;
		as[1] = d1;
		as[2] = c2;
		as[3] = d2;
		//迭代此数组，并依次调用 相关的方法
		for(Animals a : as){
			a.spark(); //多态的体现
			//如果要调用具体子类的方法，只能先做强制类型转换
			if(a instanceof Cat){ //保证不会出现ClassCastException
				Cat c = (Cat)a;
				c.catchMouse();
			}
			//调用Dog类的  play方法
			if(a instanceof Dog){
				Dog d = (Dog)a;
				d.play();
			}
		}
	}
}
