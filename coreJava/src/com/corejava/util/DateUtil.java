package com.corejava.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*************************
 * 日期工具类，提供日期的共性功能
 * 比如：根据年、年、日创建一个日期
 * 格式化日期等操作
 * @author 	jsd1307
 * @创建时间 Jul 29, 2013 10:53:47 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     util
 * @文件名   DateUtil.java
 *
 */
public class DateUtil {

	/***********
	 * 根据年、月、日来构建一个日期实例
	 * @param y 代表年份
	 * @param m 代表月份，值从1~12
	 * @param d 代表月日
	 * @return 返回一个日期对象，此日期对象中的时、分、秒
	 *         被置为0
	 */
	public static Date build(int y, int m, int d){
		/*//创建日历对象
		Calendar cal = Calendar.getInstance();
		//设用 set 方法，重置年、月、日
		cal.set(y, m - 1, d, 0, 0, 0);
		//再返回日期
		return cal.getTime();*/
		return build(y,m,d,0,0,0);
	}
	
	/***********
	 * 
	 * @param y 年
	 * @param m 月， 1~12
	 * @param d 日
	 * @param h 时
	 * @param mm 分
	 * @param s 秒
	 * @return
	 */
	public static Date build(int y, int m, int d, 
							int h,int mm,int s){
		//创建日历对象
		Calendar cal = Calendar.getInstance();
		//设用 set 方法，重置年、月、日
		cal.set(y, m - 1, d, h, mm, s);
		//再返回日期
		return cal.getTime();
	}
	
	/**************
	 * 格式化日期
	 * @param d 日期
	 * @param pattern 日期格式
	 * @return
	 */
	public static String format(
				Date d,String pattern){
		//创建SimpleDateFormat对象
		SimpleDateFormat sdf = 
				new SimpleDateFormat(pattern);
		return sdf.format(d);
	}
	
	/****************
	 * 采用固定的格式：yyyy-MM-dd 来格式化日期
	 * @param d
	 * @return
	 */
	public static String format(Date d){
		final String PATTERN = "yyyy-MM-dd";
		return format(d,PATTERN);
	}
	
	/****************
	 * 把字符串解析成 日期对象,要求此字符串必需符合：
	 * yyyy-MM-dd 格式.
	 * 注：此方法会出现异常，我们要申明异常
	 * @param dateStr
	 * @return
	 * @throws ParseException 
	 */
	public static Date parse(String dateStr) 
							throws ParseException{
		final String PATTERN = "yyyy-MM-dd";
		//创建SimpleDateFormat对象
		SimpleDateFormat sdf = 
				new SimpleDateFormat(PATTERN);
		return sdf.parse(dateStr);
	}
}
