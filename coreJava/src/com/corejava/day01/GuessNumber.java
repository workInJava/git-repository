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
		System.out.println("\t\t==��������Ϸ==");
		int count = 0;
		int start = 0;
		int end = 100;
		Random r = new Random();
		int guess = r.nextInt(end) + 1;
		int input = -1;
		String msg = "";
		do {
			System.out.printf("%s ������[%d~%d]>",msg,start,end);
			input = scan.nextInt();
			count ++;
			if(input > guess){
				msg = "����";
				end = input;
			}else if(input < guess){
				msg = "С��";
				start = input;
			}else{
				msg = "�¶���";
				break;
			}
		} while(true);
		//���
		System.out.printf("%s,���ƣ�%d��.\n",msg,count);
	}
}


