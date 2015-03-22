package com.corejava.day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		//创建一个Map
		Map map = new HashMap();
		//添加元素(键-值对)到集合中
		map.put(1,"one");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(2, "two");
		map.put(7, "seven");
		map.put(1, "first"); //将覆盖原来key值的value
		//验证是否允许重复的 key值 
		System.out.println("map的元素值："+map.size());
		//输出看结果，验证是加不进去还是覆盖？
		//1.先转换成Collection
		Collection c = map.values();
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
		}
		//
		System.out.println("//------------------");
		//2.把 map的key值 转换成 Set集合
		Set set = map.keySet();
		//迭代
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			//从迭代器中取出 key值
			Integer key = (Integer)iter.next();
			//再通过 map的get方法来取出 value
			String value = (String)map.get(key);
			//输出
			System.out.printf("%s -> %s\n",key,value);
		}
		System.out.println("//----entrySet ----------");
		//3.利用 entrySet 方法来迭代 map
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next();
			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();
			System.out.printf("%s -> %s\n",key,value);
		}
		
	}
}
