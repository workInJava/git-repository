/**
 * 
 */
package com.corejava.util;

import java.text.NumberFormat;

/**
 * 专门处理数字的一些常用方法
 * @author   周 麒
 * @创建时间 Jul 26, 2013 5:15:50 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     util
 * @文件名   NumberUtil.java
 *
 */
public class NumberUtil {

	
	/**
	 * 统计目标数据target在数组 datas中出现的次数
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
	 * 把给定的任意整数拆分成一个byte型数组
	 * 如:1489 => {1,4,8,9}
	 * @param num 整数，如果是负数，则先取绝对值
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
	 * 把数组中的数组合并为一个长整数
	 * 如：{4,2,2,3,5,2} => 422352
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
	 * 把给定的浮点整数格式化为  百分数，保留2位小数。
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
	 * 把给定的浮点数格式化为 百分数，保留bit位小数
	 * @param d 浮点数
	 * @param bit 小数位
	 * @return
	 */
	public static String toPercent(double d,int bit){
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMaximumFractionDigits(bit);
		return nf.format(d);
	}
	
	/*************
	 * 把给定的浮点数格式化为货币形式。保留1位小数
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
	 * 把给定的浮点数格式化为货币形式。保留bit位小数
	 * @param d
	 * @param bit 小数位数
	 * @return
	 */
	public static String toCurrency(double d, int bit){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(bit);
		return nf.format(d);
	}
}
