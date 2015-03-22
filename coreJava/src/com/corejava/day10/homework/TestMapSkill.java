package com.corejava.day10.homework;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMapSkill {

	public static void main(String[] args) {
		String author = "金庸";
		Map m1 = MapSkill.getBooksByAuthor(author);
		System.out.println(author+"的书共计："+m1.size()+"本");
		MapSkill.print(m1);
		System.out.println("=====測試COUNT");
		Map m2=MapSkill.count();
		Set set=m2.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Entry en=(Entry)it.next();
			String i1=(String)en.getKey();
			Integer s1=(Integer)en.getValue();
			System.out.println(i1+","+s1);
		}
		
		System.out.println("=======測試countprice");
		Map m3=MapSkill.countPrice();
		Set set1=m3.entrySet();
		Iterator it1=set1.iterator();
		while(it1.hasNext()){
			Entry en=(Entry)it1.next();
			String i1=(String)en.getKey();
			Double s1=(Double)en.getValue();
			System.out.printf("%s,%.2f\n",i1,s1.doubleValue());
		}
		
		System.out.println("=======打出详细");
		Map m4=MapSkill.countAuthor();
		Set set2=m4.entrySet();
		Iterator it2=set2.iterator();
		while(it2.hasNext()){
			Entry en=(Entry)it2.next();
			String i1=(String)en.getKey();
			List s1=(List)en.getValue();
			System.out.printf("--作者：【%s】的图书有：\n",i1);
			for(Object lis:s1){
				System.out.println(lis);
			}
		}

	}
}
