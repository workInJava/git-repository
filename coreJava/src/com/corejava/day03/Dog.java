package com.corejava.day03;

/******************
 * �������� -- С����
 * @author 	jsd1307
 * @����ʱ�� Jul 23, 2013 1:52:17 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03
 * @�ļ���   Dog.java
 *
 */
public class Dog extends Animals {

	//����
	private boolean pet; //�Ƿ��ǳ��ﹷ

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

	//ҵ�񷽷�
	public void play(){
		String name = getName(); //�ֲ�����
		//����ǳ��ﹷ������������˹��
		if(pet){
			System.out.printf(
				"����[%s],��һֻ���ﹷ�����������˹��Ŷ��\n"
				,name == null ? "С��" : name);
		}else{
			System.out.printf(
				"�ҽ�[%s],�ɲ��ǳ��������Ұ�Ե�.\n"
				,name == null ? "Ұ����" : name);
		}
	}
	
	//��д�����eat����
	public void eat(){
		System.out.printf("�Ұ��Թ�ͷ... #$@#$#$#$\n");
	}
	
	@Override
	public void spark() {
		// TODO Auto-generated method stub
//		super.spark();
		System.out.println(getName()+" ������...");
	}
}
