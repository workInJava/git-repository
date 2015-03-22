package com.corejava.day08;
/********
 * 异常处理的演示
 * @author 	jsd1307
 * @创建时间 Jul 30, 2013 11:02:17 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day08
 * @文件名   ExceptionHandler.java
 *
 */
public class ExceptionHandler {

	public void method1(String str){
		String result = null;
		try {
			result = str.substring(2,5);
			//...
			//...
		}catch (NullPointerException e){
			//处理空指针
			e.printStackTrace();
			result = "原对象为null";
//			System.exit(0); //退出JVM进程
//			return ;
		}catch(IndexOutOfBoundsException e){
			//处理下标越界
//			e.printStackTrace();
			System.out.println(e.getMessage());
			result = "源字符串长度不够";
		} finally {
			System.out.println("~~finally.");
		}
		System.out.println(result);
	}
	
	public void method2(int count){
		for(int i=0;i<count;i++){
			int r = (int)(Math.random()*100);
			//
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.printf("【%d】\r",r);
		}
	}
	
	public static void main(String[] args){
		ExceptionHandler eh = new ExceptionHandler();
//		eh.method1(null);
		eh.method2(7);
	}
}
