/**
 * 
 */
package com.corejava.day06.homework;

/**
 * �˽ӿڹ淶�� ������������ط���
 * @author   �� ��
 * @����ʱ�� Jul 26, 2013 3:11:37 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day06.homework
 * @�ļ���   MyList.java
 *
 */
public interface MyList {

	//����
	int BASIC_SIZE = 4;
	/******************
	 * ������ݵ��ˡ�������
	 * @param data ����
	 */
	void add(int data);

	/***
	 * ���������Ƴ�����
	 * @param data ����
	 */ 
	void remove(int data);

	/*** 
	 * ��ȡ����������ЧԪ�صĸ���
	 * @return ��ЧԪ�ظ���
	 */
	int size();

	/*****
	 * �����±��ȡָ����Ԫ��
	 * @param index �±꣬ 
	 * 	����±�Խ�磬���׳��±�Խ���쳣
	 * @return Ԫ��
	 */
	int get(int index);

	/*******
	 * �������������Ԫ��
	 */
	void output();
}
