package com.corejava.day01.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String arg[]){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======猜数字游戏======");
		int count = 0;
		int start = 0;
		int end = 100;
		Random ra = new Random();
		int create = ra.nextInt(end) + 1;
		String msg = "";
		do{
			System.out.printf("%s请输入【%d--%d】->",msg,start,end);
			count++;
			int input = sc.nextInt();
			if(input>create){
				end = input;
				msg="大了";
			}else if(input<create){
				start = input;
				msg = "小了";
			}else{
				sc.close();
				msg="你猜对了！";
				break;
			}
			
		}while(true);
		
		System.out.printf("%s 你猜了%d次",count);
	}
}
