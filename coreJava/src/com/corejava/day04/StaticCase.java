package com.corejava.day04;
/********************
 * 本类演示 static 代码块的作用
 * @author 	jsd1307
 * @创建时间 Jul 24, 2013 1:57:55 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day04
 * @文件名   StaticCase.java
 *
 */
public class StaticCase {

	//定义属性
	private static int[] datas;
	private int size; //数组中有效数据个数
	//定义常量属性
	public static final int DEFAULT_LENGTH = 10;
	
	//构造方法
	public StaticCase(){
		System.out.println("空参构造...");
		this.size = datas.length;
	}
	
	//普通代码块
	{
		System.out.println("普通代码块...");
	}
	
	//静态代码块
	static {
		System.out.println("静态代码块...");
//		System.out.println("不与你玩了...");
//		System.exit(0); //退出JVM进程.
		//初始化数组
		datas = new int[DEFAULT_LENGTH];
		//随机生成10个整数
		for(int i=0;i<datas.length;i++){
			datas[i] = (int)(Math.random() * 1000);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main 方法.....");
	}
}


