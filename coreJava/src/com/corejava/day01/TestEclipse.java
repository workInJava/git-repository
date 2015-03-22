package com.corejava.day01;

import java.util.Scanner;

public class TestEclipse {

	public static void main(String[] args) {
		System.out.println("快捷键使用");
		
		Scanner scan = new Scanner(System.in);
		System.out.printf("请输入任意整数>");
		int input = scan.nextInt();
		System.out.printf("你输入了 %d\n",input);
		
	}
}
