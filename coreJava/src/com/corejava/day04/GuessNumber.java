package com.corejava.day04;

import java.util.Scanner;

/******************
 * ����OO��˼������װ��������Ϸ
 * @author 	jsd1307
 * @����ʱ�� Jul 24, 2013 4:13:50 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day04
 * @�ļ���   GuessNumber.java
 *
 */
public class GuessNumber {

	//��������
	private int random; //�����
	private int start; //��ʼ��Χ
	private int end; //���շ�Χ
	private int count; //��¼����Ĵ���
	private int[] guessCount; //��¼���µĴ���
	private boolean over; //��¼��Ϸ�Ƿ����
	
	//���췽��
	public GuessNumber(){
		//�ղΣ�Ĭ�Ͼ��ǲ� 1~100֮�������
		this.start = 1;
		this.end = 100;
	}
	public GuessNumber(int start,int end){
		this.start = start;
		this.end = end;
	}
	
	//����һ��˽��ҵ�񷽷��������ʼ�������
	private void initRandom(){
		this.random = start + 
			(int)(Math.random() * (end-start));
	}
	
	//ҵ�񷽷�
	public void play(){
		long s = System.currentTimeMillis();
		do {
			//����˵�
			printMenu();
			//��ʾ�û�����
			System.out.print("��ѡ��>");
			int input = inputNumber();
			switch (input) {
			case 1:
				//��ʼ���������Ϸ
				initRandom();
				count ++;
				playGame();
				break;
			case 0:
				//�˳�����
				System.out.println(":)ллʹ��");
				over = true;
				break;
			default:
				//�˵�ѡ����ȷ
				System.out.println("��ѡ�񲻶�.");
				break;
			}
		}while(!over);
		long e = System.currentTimeMillis();
		//���һЩ��Ϣ�����û��鿴
		System.out.printf("���ι��桾%d����.\n",count);
		System.out.printf("��Ϸʱ����%d ��",(e-s)/1000);
	}
	
	/**********
	 * ʵ�ֲ����ֵĺ���ҵ��
	 */
	private void playGame() {
		int guessNum = 0;
		String msg = "";
		int min = start;
		int max = end;
		while(true){
			System.out.printf
				("%s,��������Ĳµ�����[%d~%d]:",msg,min,max);
			int input = inputNumber();
			//�ж�
			if(input > random){
				msg = "̫����";
				max = input;
			}else if(input < random){
				msg = "̫С��";
				min = input;
			}else{
				//˵���¶���
				msg = "��ϲ�㣬�¶���";
				guessNum++;
				break;
			}
			guessNum++;
		}
		//���������Ľ��
		System.out.printf
			("%s,�㹲���ˡ�%d����\n",msg,guessNum);
	}
	
	private int inputNumber() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	private void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("****������****");
		System.out.println("*1.��ʼ");
		System.out.println("*0.�˳�");
		System.out.println("����������������������������");
	}
	
	public static void main(String[] args) {
		//��������
		GuessNumber gn = new GuessNumber();
		gn.play();
	}
}



