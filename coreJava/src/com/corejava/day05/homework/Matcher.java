/**
 * 
 */
package com.corejava.day05.homework;

/**
 * @author   jsd1307 cl
 * @date     Jul 25, 2013 6:41:33 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day05.homework
 * @文件名    Matcher.java
 *
 */
public class Matcher {
	/******
	 *本方法完成的业务是:
	 * 模拟两个玩家互相猜拳, 调用show方法分别获取玩家的出拳,决定谁负谁赢.
	 */
	public static void match(Player p1, Player p2){
		//请自行实现
		
		/*String str1=p1.show();
		System.out.println(p1.getName()+"出的是"+str1);
		String str2=p2.show();
		System.out.println(p2.getName()+"出的是"+str2);	
		
		Player Victory=new CalPlayer("");
		if (str1==str2) {
			System.out.println("平局！");
		}else{
			if (str1=="布") {
				if (str2=="剪刀") {
					Victory=p2;
				}else{
					Victory=p1;
				}
			}
			if (str1=="剪刀") {
				if (str2=="石头") {
					Victory=p2;
				}else{
					Victory=p1;
				}
			}
			if (str1=="石头") {
				if (str2=="布") {
					Victory=p2;
				}else{
					Victory=p1;
				}
			}
			System.out.println("胜利者是："+Victory.getName());
		}*/
		
		String p1Show = p1.show();
		String p2Show = p2.show();
		String result = "";
		if(p1Show == Player.BU){
			if(p2Show == Player.BU){
				result = "平局";
			}else if(p2Show == Player.SHITOU){
				result = "胜利";
			} else{
				result = "失败";
			}
			
		}else if(p1Show == Player.JIANDAO){
			if(p2Show == Player.JIANDAO){
				result = "平局";
			}else if(p2Show == Player.BU){
				result = "胜利";
			} else{
				result = "失败";
			}
			
		}else if(p1Show == Player.SHITOU){
			if(p2Show == Player.SHITOU){
				result = "平局";
			}else if(p2Show == Player.JIANDAO){
				result = "胜利";
			} else{
				result = "失败";
			}
			
		}
		//输出结果
		System.out.printf("[%s] -> %s VS [%s] -> %s, [%s] %s\n"
				,p1.getName(),p1Show,p2.getName(),p2Show,p1.getName(),result);
	}
}
