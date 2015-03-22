package com.corejava.day08;
//场景类
public class Scene {

	private int year; //当前年份
	private Season current; //当前季节
	
	public Scene(){
		this.year = 247;
		this.current = Season.SUMMER;
	}
	
	public Scene(int year, Season s){
		this.year = year;
		this.current = s;
	}
	//启动场景
	public void start(){
		Season s = current;
//		System.out.printf("公元:%d 年 %s\n",year,s);
		while(true){
			System.out.printf("公元:%d 年 %s\r",year,s);
			//模拟sleep
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(s.equals(Season.WINTER)){
				this.year ++;
			}
			//更换季节
			s = s.next();
			if(year == 2012){
				System.out.println("末日来临，无季节更替.");
				break;
			}
		}
	}
}
