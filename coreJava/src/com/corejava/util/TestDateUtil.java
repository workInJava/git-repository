package com.corejava.util;

import java.text.ParseException;
import java.util.Date;


public class TestDateUtil {

	public static void main(String[] args) {
		Date d1 = DateUtil.build(2008, 8, 8);
		System.out.println(d1);//d1.toString()
		
		Date d2 = DateUtil.build(2012, 7, 18, 8, 8, 8);
		System.out.println(d2);
		
		//格式化日期
		System.out.println(DateUtil.format(d1));
		System.out.println(DateUtil.format(d2));
		System.out.println(DateUtil.format(d2, "yyyy/MM/dd"));
		System.out.println(DateUtil.format(d2, "MM,dd,yyyy E zzz"));
		
		//
		String str = "1990-12-18";
		try {
			Date d3 = DateUtil.parse(str);
			System.out.println(d3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
