package com.corejava.day04;

/****************
 * ͳ�ƶ���ĸ�����ÿ�����󴴽���˳��
 * @author 	jsd1307
 * @����ʱ�� Jul 24, 2013 11:13:43 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day04
 * @�ļ���   CountObject.java
 *
 */
public class CountObject {

	//����
	private String name; //��������
	private int i;  //���󴴽���˳��
	
	private static int count; //��¼����Ĵ�������
	
	//���췽��
	public CountObject(String name){
		this.name = name;
		//ִ��ҵ��
		count ++; //ÿ����һ������count��+1;
		this.i = count; //��i��ֵΪ��ǰ��count��
						//Ҳ���Ǵ�����˳��
//		this.i = ++count;
	}
	
	//����
	public int getI(){
		return this.i;
	}
	//��̬����
	public static int count(){
//		System.out.println(i); ����ֱ�ӷ��ʷǾ�̬��Ա
//		System.out.println(getI());ͬ��
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

