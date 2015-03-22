package com.corejava.day08;
/********
 * �쳣�������ʾ
 * @author 	jsd1307
 * @����ʱ�� Jul 30, 2013 11:02:17 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day08
 * @�ļ���   ExceptionHandler.java
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
			//�����ָ��
			e.printStackTrace();
			result = "ԭ����Ϊnull";
//			System.exit(0); //�˳�JVM����
//			return ;
		}catch(IndexOutOfBoundsException e){
			//�����±�Խ��
//			e.printStackTrace();
			System.out.println(e.getMessage());
			result = "Դ�ַ������Ȳ���";
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
			System.out.printf("��%d��\r",r);
		}
	}
	
	public static void main(String[] args){
		ExceptionHandler eh = new ExceptionHandler();
//		eh.method1(null);
		eh.method2(7);
	}
}
