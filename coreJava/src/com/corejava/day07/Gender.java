/**
 * 
 */
package com.corejava.day07;

/**
 * @author 	jsd1307
 * @����ʱ�� Jul 29, 2013 5:13:07 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day07
 * @�ļ���   Gender.java
 *
 */
public enum Gender {

	//��������
	MALE("��")
	//�൱�ڣ�public static final Gender MALE = new Gender("��");
	,FEMALE("Ů");
	
	//���췽����һ����˽�е�, Ĭ�Ϲ���Ŀ���ʡ��
	private Gender(String value){
		this.value = value;
	}
	//�����ͨ����
	private String value;
	
	@Override
	public String toString() {
		return value;
	}
	
}
