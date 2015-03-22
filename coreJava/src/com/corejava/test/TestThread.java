package com.corejava.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 * 
 * @author think
 * 多线程
 */
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 看这个月有多少天
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scan.nextInt();
		System.out.println("请输入月份：");
		int month = scan.nextInt();
		
		int dayOfMonth = 0;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayOfMonth = 31;
			break;
		case 2:
			if(isRunNian(year)){
				dayOfMonth = 29;
			} else {
				dayOfMonth = 28;
			}
			break;
		default:
			dayOfMonth = 30;
			break;
		}
		System.out.println(year+"年"+month+"月有"+dayOfMonth+"天");
		//2. 看今天是星期几
		final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五","星期六" };
		Calendar rightNow = Calendar.getInstance();
		Date d = new Date();
		rightNow.setTime(d);
		int week = rightNow.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println("今天是"+dayNames[week]);
		System.out.println("今天是星期" + new Date().getDay());
		Run1 run1 = new Run1();
		run1.run();
		Thread t = new Thread(run1);
		t.start();
		/*for(int i=0; i<10; i++){
			System.out.println(""+i);
		}*/
		System.out.println("over...");
		run1.shutDown();
	}

	private static boolean isRunNian(int year) {
		// TODO Auto-generated method stub
		boolean flag = false;
		 if ((year%4 == 0 && year%100 != 0) 
				    || year%400 == 0) {
				   flag = true;
				  }
		return flag;
	}

}

class Run1 implements Runnable {
	private String flag = "true";
	public void run() {
		while(flag == "false") {
			for(int i=0; i<10; i++){
				System.out.println("-------------"+i);
			}
		}
	}
	
	public void shutDown() {
		flag = "false";
	}
}
