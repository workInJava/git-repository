package com.corejava.day01.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String arg[]){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======��������Ϸ======");
		int count = 0;
		int start = 0;
		int end = 100;
		Random ra = new Random();
		int create = ra.nextInt(end) + 1;
		String msg = "";
		do{
			System.out.printf("%s�����롾%d--%d��->",msg,start,end);
			count++;
			int input = sc.nextInt();
			if(input>create){
				end = input;
				msg="����";
			}else if(input<create){
				start = input;
				msg = "С��";
			}else{
				sc.close();
				msg="��¶��ˣ�";
				break;
			}
			
		}while(true);
		
		System.out.printf("%s �����%d��",count);
	}
}
