package com.corejava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*************************
 * ���ڹ����࣬�ṩ���ڵĹ��Թ���
 * ���磺�����ꡢ�ꡢ�մ���һ������
 * ��ʽ�����ڵȲ���
 * @author 	jsd1307
 * @����ʱ�� Jul 29, 2013 10:53:47 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     util
 * @�ļ���   DateUtil.java
 *
 */
public class DateUtil {

	/***********
	 * �����ꡢ�¡���������һ������ʵ��
	 * @param y �������
	 * @param m �����·ݣ�ֵ��1~12
	 * @param d ��������
	 * @return ����һ�����ڶ��󣬴����ڶ����е�ʱ���֡���
	 *         ����Ϊ0
	 */
	public static Date build(int y, int m, int d){
		/*//������������
		Calendar cal = Calendar.getInstance();
		//���� set �����������ꡢ�¡���
		cal.set(y, m - 1, d, 0, 0, 0);
		//�ٷ�������
		return cal.getTime();*/
		return build(y,m,d,0,0,0);
	}
	
	/***********
	 * 
	 * @param y ��
	 * @param m �£� 1~12
	 * @param d ��
	 * @param h ʱ
	 * @param mm ��
	 * @param s ��
	 * @return
	 */
	public static Date build(int y, int m, int d, 
							int h,int mm,int s){
		//������������
		Calendar cal = Calendar.getInstance();
		//���� set �����������ꡢ�¡���
		cal.set(y, m - 1, d, h, mm, s);
		//�ٷ�������
		return cal.getTime();
	}
	
	/**************
	 * ��ʽ������
	 * @param d ����
	 * @param pattern ���ڸ�ʽ
	 * @return
	 */
	public static String format(
				Date d,String pattern){
		//����SimpleDateFormat����
		SimpleDateFormat sdf = 
				new SimpleDateFormat(pattern);
		return sdf.format(d);
	}
	
	/****************
	 * ���ù̶��ĸ�ʽ��yyyy-MM-dd ����ʽ������
	 * @param d
	 * @return
	 */
	public static String format(Date d){
		final String PATTERN = "yyyy-MM-dd";
		return format(d,PATTERN);
	}
	
	/****************
	 * ���ַ��������� ���ڶ���,Ҫ����ַ���������ϣ�
	 * yyyy-MM-dd ��ʽ.
	 * ע���˷���������쳣������Ҫ�����쳣
	 * @param dateStr
	 * @return
	 * @throws ParseException 
	 */
	public static Date parse(String dateStr) 
							throws ParseException{
		final String PATTERN = "yyyy-MM-dd";
		//����SimpleDateFormat����
		SimpleDateFormat sdf = 
				new SimpleDateFormat(PATTERN);
		return sdf.parse(dateStr);
	}
}
