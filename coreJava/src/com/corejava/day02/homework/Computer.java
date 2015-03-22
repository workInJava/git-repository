package com.corejava.day02.homework;

public class Computer {

	private String brand;
	private double price;
	private String description;
	private Screen screen;

	//���췽��
	public Computer() {
		System.out.println("�ղι���");
	}
	public Computer(String brand,String description,double price){
		System.out.println("���ι���");
		//���������Ը�ֵ
		this.brand =brand;
		this.description=description;
		//this.price=price;
		/*//�жϴ������Ƿ񸽺�Ҫ��
		if(price < 1000 || price > 10000){
			System.err.println("�۸�������Ϸ�");
			this.price = 2000;
		}else{
			this.price=price;
		}
		*/
		setPrice(price);
	}
	
	//����
	//setϵ�з���
	public void setBrand(String brand){
		this.brand=brand;//�����Ը�ֵ
		
	}
	public void setPrice(double p){
		//����Ч���ж�
		if(p < 1000 || p > 20000){
			System.out.println("�۸�������Ϸ�");
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

	//getϵ�з���
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
	 * չʾ���ԵĻ�����Ϣ
	 */
	public void outputComputerInfo() {
		System.out.println("�˵��Ե�Ʒ���ǣ�"+(brand == null ? "��Ʒ��":brand));
		System.out.println("���ļ۸��ǣ�"+price);
		System.out.println("�����ǣ�"+(description == null ? "������" : description));
		//System.out.printf("������ %s\n",description);
		if(screen != null){
			System.out.println("��ʾ����Ϣ���£�");
			System.out.println("\t"+screen.getBrand());
			System.out.println("\t"+screen.getSize());
			System.out.println("\t"+screen.getType());
		}else{
			System.out.println("�˵���û������ʾ��");
		}
	}
}



