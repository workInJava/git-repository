package com.corejava.day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/********
 * 本例演示 List接口的使用
 * @author 	jsd1307
 * @创建时间 Jul 31, 2013 2:33:26 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day09
 * @文件名   ListDemo.java
 *
 */
public class ListDemo {

	public static void main(String[] args) {
		//1.创建集合对象
		List strList = new ArrayList();
		System.out.println(strList.isEmpty());//true
		//2.添加元素到集合中
		strList.add("jack");
		strList.add("李雷");
		strList.add("ann");
		strList.add("韩梅梅");
		strList.add("smith");
		strList.add("solo");
		strList.add("steven");
		strList.add("tim");
		strList.add("jack");
		strList.add("韩梅梅");
		System.out.println(strList.isEmpty());//false
		//有序、可重复
		System.out.println("此集合的元素个数："
				+strList.size());
		//判断此集合中是否包含 smith 这个对象
		boolean b = strList.contains("smith");
		System.out.println(b);
		//迭代输出
		Iterator iter = strList.iterator();
		while(iter.hasNext()){
			//取出下一个元素
			String str = (String)iter.next();
			System.out.println(str);
		}
		
		//打乱顺序
		Collections.shuffle(strList);
		//再次输出
		System.out.println("//--打乱顺序后：");
		for(Object o : strList){
			System.out.println(o);
		}
	}
}
