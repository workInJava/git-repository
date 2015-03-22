package com.corejava.day08;
//������
public class Scene {

	private int year; //��ǰ���
	private Season current; //��ǰ����
	
	public Scene(){
		this.year = 247;
		this.current = Season.SUMMER;
	}
	
	public Scene(int year, Season s){
		this.year = year;
		this.current = s;
	}
	//��������
	public void start(){
		Season s = current;
//		System.out.printf("��Ԫ:%d �� %s\n",year,s);
		while(true){
			System.out.printf("��Ԫ:%d �� %s\r",year,s);
			//ģ��sleep
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(s.equals(Season.WINTER)){
				this.year ++;
			}
			//��������
			s = s.next();
			if(year == 2012){
				System.out.println("ĩ�����٣��޼��ڸ���.");
				break;
			}
		}
	}
}
