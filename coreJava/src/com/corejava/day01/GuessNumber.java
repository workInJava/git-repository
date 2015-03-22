package com.corejava.day01;

import java.util.Scanner;
import java.util.Random;

/***********************
 * 
 * @author jsd1307
 *
 */
public class GuessNumber{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\t==猜数字游戏==");
		int count = 0;
		int start = 0;
		int end = 100;
		Random r = new Random();
		int guess = r.nextInt(end) + 1;
		int input = -1;
		String msg = "";
		do {
			System.out.printf("%s 请输入[%d~%d]>",msg,start,end);
			input = scan.nextInt();
			count ++;
			if(input > guess){
				msg = "大了";
				end = input;
			}else if(input < guess){
				msg = "小了";
				start = input;
			}else{
				msg = "猜对了";
				break;
			}
		} while(true);
		//输出
		System.out.printf("%s,共计：%d次.\n",msg,count);
	}
}


