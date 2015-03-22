package com.corejava.day04;
/********************
 * ������ʾ static ����������
 * @author 	jsd1307
 * @����ʱ�� Jul 24, 2013 1:57:55 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day04
 * @�ļ���   StaticCase.java
 *
 */
public class StaticCase {

	//��������
	private static int[] datas;
	private int size; //��������Ч���ݸ���
	//���峣������
	public static final int DEFAULT_LENGTH = 10;
	
	//���췽��
	public StaticCase(){
		System.out.println("�ղι���...");
		this.size = datas.length;
	}
	
	//��ͨ�����
	{
		System.out.println("��ͨ�����...");
	}
	
	//��̬�����
	static {
		System.out.println("��̬�����...");
//		System.out.println("����������...");
//		System.exit(0); //�˳�JVM����.
		//��ʼ������
		datas = new int[DEFAULT_LENGTH];
		//�������10������
		for(int i=0;i<datas.length;i++){
			datas[i] = (int)(Math.random() * 1000);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main ����.....");
	}
}


