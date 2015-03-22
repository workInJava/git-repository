package com.corejava.day04;

import java.util.Scanner;

/******************
 * 采用OO的思想来封装猜数字游戏
 * @author 	jsd1307
 * @创建时间 Jul 24, 2013 4:13:50 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day04
 * @文件名   GuessNumber.java
 *
 */
public class GuessNumber {

	//定义属性
	private int random; //随机数
	private int start; //起始范围
	private int end; //最终范围
	private int count; //记录所玩的次数
	private int[] guessCount; //记录所猜的次数
	private boolean over; //记录游戏是否结束
	
	//构造方法
	public GuessNumber(){
		//空参：默认就是猜 1~100之间的整数
		this.start = 1;
		this.end = 100;
	}
	public GuessNumber(int start,int end){
		this.start = start;
		this.end = end;
	}
	
	//定义一个私的业务方法，负责初始化随机数
	private void initRandom(){
		this.random = start + 
			(int)(Math.random() * (end-start));
	}
	
	//业务方法
	public void play(){
		long s = System.currentTimeMillis();
		do {
			//输出菜单
			printMenu();
			//提示用户输入
			System.out.print("请选择>");
			int input = inputNumber();
			switch (input) {
			case 1:
				//开始玩猜数字游戏
				initRandom();
				count ++;
				playGame();
				break;
			case 0:
				//退出程序
				System.out.println(":)谢谢使用");
				over = true;
				break;
			default:
				//菜单选择不正确
				System.out.println("你选择不对.");
				break;
			}
		}while(!over);
		long e = System.currentTimeMillis();
		//输出一些信息，给用户查看
		System.out.printf("本次共玩【%d】次.\n",count);
		System.out.printf("游戏时长：%d 秒",(e-s)/1000);
	}
	
	/**********
	 * 实现猜数字的核心业务
	 */
	private void playGame() {
		int guessNum = 0;
		String msg = "";
		int min = start;
		int max = end;
		while(true){
			System.out.printf
				("%s,请输入你的猜的数字[%d~%d]:",msg,min,max);
			int input = inputNumber();
			//判断
			if(input > random){
				msg = "太大了";
				max = input;
			}else if(input < random){
				msg = "太小了";
				min = input;
			}else{
				//说明猜对了
				msg = "恭喜你，猜对了";
				guessNum++;
				break;
			}
			guessNum++;
		}
		//输出本次玩的结果
		System.out.printf
			("%s,你共猜了【%d】次\n",msg,guessNum);
	}
	
	private int inputNumber() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	private void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("****猜数字****");
		System.out.println("*1.开始");
		System.out.println("*0.退出");
		System.out.println("——————————————");
	}
	
	public static void main(String[] args) {
		//创建对象
		GuessNumber gn = new GuessNumber();
		gn.play();
	}
}



