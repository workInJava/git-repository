/**
 * 
 */
package com.corejava.day05.homework;

/**
 * @author   jsd1307 cl
 * @date     Jul 25, 2013 6:41:33 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��    CoreJava
 * @����      com.corejava.day05.homework
 * @�ļ���    Matcher.java
 *
 */
public class Matcher {
	/******
	 *��������ɵ�ҵ����:
	 * ģ��������һ����ȭ, ����show�����ֱ��ȡ��ҵĳ�ȭ,����˭��˭Ӯ.
	 */
	public static void match(Player p1, Player p2){
		//������ʵ��
		
		/*String str1=p1.show();
		System.out.println(p1.getName()+"������"+str1);
		String str2=p2.show();
		System.out.println(p2.getName()+"������"+str2);	
		
		Player Victory=new CalPlayer("");
		if (str1==str2) {
			System.out.println("ƽ�֣�");
		}else{
			if (str1=="��") {
				if (str2=="����") {
					Victory=p2;
				}else{
					Victory=p1;
				}
			}
			if (str1=="����") {
				if (str2=="ʯͷ") {
					Victory=p2;
				}else{
					Victory=p1;
				}
			}
			if (str1=="ʯͷ") {
				if (str2=="��") {
					Victory=p2;
				}else{
					Victory=p1;
				}
			}
			System.out.println("ʤ�����ǣ�"+Victory.getName());
		}*/
		
		String p1Show = p1.show();
		String p2Show = p2.show();
		String result = "";
		if(p1Show == Player.BU){
			if(p2Show == Player.BU){
				result = "ƽ��";
			}else if(p2Show == Player.SHITOU){
				result = "ʤ��";
			} else{
				result = "ʧ��";
			}
			
		}else if(p1Show == Player.JIANDAO){
			if(p2Show == Player.JIANDAO){
				result = "ƽ��";
			}else if(p2Show == Player.BU){
				result = "ʤ��";
			} else{
				result = "ʧ��";
			}
			
		}else if(p1Show == Player.SHITOU){
			if(p2Show == Player.SHITOU){
				result = "ƽ��";
			}else if(p2Show == Player.JIANDAO){
				result = "ʤ��";
			} else{
				result = "ʧ��";
			}
			
		}
		//������
		System.out.printf("[%s] -> %s VS [%s] -> %s, [%s] %s\n"
				,p1.getName(),p1Show,p2.getName(),p2Show,p1.getName(),result);
	}
}
