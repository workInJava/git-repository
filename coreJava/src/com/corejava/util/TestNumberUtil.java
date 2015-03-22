/**
 * 
 */
package com.corejava.util;

import java.util.Arrays;


/**
 * @author   周 麒
 * @创建时间 Jul 26, 2013 7:24:27 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     util
 * @文件名   TestNumberUtil.java
 *
 */
public class TestNumberUtil {

	public static void main(String[] args) {
		int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,1,2,3,4,4,5,6,7,7};
		System.out.println(NumberUtil.count(arr1, 4));
		System.out.println(Arrays.toString(NumberUtil.split(12580)));
		byte[] arr2 = new byte[]{1,2,5,8,0};
		System.out.println(NumberUtil.merge(arr2));
		System.out.println(NumberUtil.toPercent(0.0998123));
		System.out.println(NumberUtil.toPercent(0.0998123,3));
		System.out.println(NumberUtil.toCurrency(998.998));
		System.out.println(NumberUtil.toCurrency(998.998,3));
		
	}
}
