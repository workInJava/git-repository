package com.corejava.day10.homework;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestMapSkill {

	public static void main(String[] args) {
		String author = "��ӹ";
		Map m1 = MapSkill.getBooksByAuthor(author);
		System.out.println(author+"���鹲�ƣ�"+m1.size()+"��");
		MapSkill.print(m1);
		System.out.println("=====�yԇCOUNT");
		Map m2=MapSkill.count();
		Set set=m2.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Entry en=(Entry)it.next();
			String i1=(String)en.getKey();
			Integer s1=(Integer)en.getValue();
			System.out.println(i1+","+s1);
		}
		
		System.out.println("=======�yԇcountprice");
		Map m3=MapSkill.countPrice();
		Set set1=m3.entrySet();
		Iterator it1=set1.iterator();
		while(it1.hasNext()){
			Entry en=(Entry)it1.next();
			String i1=(String)en.getKey();
			Double s1=(Double)en.getValue();
			System.out.printf("%s,%.2f\n",i1,s1.doubleValue());
		}
		
		System.out.println("=======�����ϸ");
		Map m4=MapSkill.countAuthor();
		Set set2=m4.entrySet();
		Iterator it2=set2.iterator();
		while(it2.hasNext()){
			Entry en=(Entry)it2.next();
			String i1=(String)en.getKey();
			List s1=(List)en.getValue();
			System.out.printf("--���ߣ���%s����ͼ���У�\n",i1);
			for(Object lis:s1){
				System.out.println(lis);
			}
		}

	}
}
