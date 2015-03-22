package com.corejava.day03;

public class TestAnimals {

	public static void main(String[] args) {
		Cat c1 = new Cat("С��","è�ƶ���");
		Animals c2 = new Cat("С��","è�ƶ���");//ok
		
		Animals d1 = new Dog("����","���鶯��",true);//ok
		Dog d2 = new Dog("����","���鶯��",false); //ok
		
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
		//���� һ�� Animals�������������4������
		Animals[] as = new Animals[4];
		//���Ԫ��
		as[0] = c1;
		as[1] = d1;
		as[2] = c2;
		as[3] = d2;
		//���������飬�����ε��� ��صķ���
		for(Animals a : as){
			a.spark(); //��̬������
			//���Ҫ���þ�������ķ�����ֻ������ǿ������ת��
			if(a instanceof Cat){ //��֤�������ClassCastException
				Cat c = (Cat)a;
				c.catchMouse();
			}
			//����Dog���  play����
			if(a instanceof Dog){
				Dog d = (Dog)a;
				d.play();
			}
		}
	}
}
