/**
 * 
 */
package com.corejava.util;

import java.text.NumberFormat;

/**
 * ר�Ŵ������ֵ�һЩ���÷���
 * @author   �� ��
 * @����ʱ�� Jul 26, 2013 5:15:50 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��   CoreJava
 * @����     util
 * @�ļ���   NumberUtil.java
 *
 */
public class NumberUtil {

	
	/**
	 * ͳ��Ŀ������target������ datas�г��ֵĴ���
	 * @param datas
	 * @param target
	 * @return
	 */
	public static int count(int[] datas,int target){
		int count = 0;
		for (int data : datas) {
			if(data == target){
				count ++;
			}
		}
		return count;
	}
	
	/**
	 * �Ѹ���������������ֳ�һ��byte������
	 * ��:1489 => {1,4,8,9}
	 * @param num ����������Ǹ���������ȡ����ֵ
	 * @return
	 */
	public static byte[] split(long num){
		if(num < 0){
			num *= -1;
		}
//		num = Math.abs(num);
		String str = String.valueOf(num);
		byte[] arr = new byte[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = (byte)(str.charAt(i) - 48);
			/*arr[i] = Byte.parseByte(
					String.valueOf(str.charAt(i)));*/
		}
		return arr;
	}
	
	/**
	 * �������е�����ϲ�Ϊһ��������
	 * �磺{4,2,2,3,5,2} => 422352
	 */
	public static long merge(byte[] datas){
		StringBuilder builder = new StringBuilder();
		for (byte b : datas) {
			builder.append(b);
		}
		long n = Long.parseLong(builder.toString());
		return n;
	}
	
	/**
	 * �Ѹ����ĸ���������ʽ��Ϊ  �ٷ���������2λС����
	 * @param d
	 * @return
	 */
	public static String toPercent(double d){
		/*NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMaximumFractionDigits(2);
		return nf.format(d);*/
		return toPercent(d, 2);
	}
	
	/**
	 * �Ѹ����ĸ�������ʽ��Ϊ �ٷ���������bitλС��
	 * @param d ������
	 * @param bit С��λ
	 * @return
	 */
	public static String toPercent(double d,int bit){
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMaximumFractionDigits(bit);
		return nf.format(d);
	}
	
	/*************
	 * �Ѹ����ĸ�������ʽ��Ϊ������ʽ������1λС��
	 * @param d
	 * @return
	 */
	public static String toCurrency(double d){
		/*NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(1);
		return nf.format(d);*/
		return toCurrency(d, 1);
	}
	
	/*************
	 * �Ѹ����ĸ�������ʽ��Ϊ������ʽ������bitλС��
	 * @param d
	 * @param bit С��λ��
	 * @return
	 */
	public static String toCurrency(double d, int bit){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(bit);
		return nf.format(d);
	}
}
