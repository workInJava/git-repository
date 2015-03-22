package com.corejava.day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		//����һ��Map
		Map map = new HashMap();
		//���Ԫ��(��-ֵ��)��������
		map.put(1,"one");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(2, "two");
		map.put(7, "seven");
		map.put(1, "first"); //������ԭ��keyֵ��value
		//��֤�Ƿ������ظ��� keyֵ 
		System.out.println("map��Ԫ��ֵ��"+map.size());
		//������������֤�ǼӲ���ȥ���Ǹ��ǣ�
		//1.��ת����Collection
		Collection c = map.values();
		for(Object o : c){
			String str = (String)o;
			System.out.println(str);
		}
		//
		System.out.println("//------------------");
		//2.�� map��keyֵ ת���� Set����
		Set set = map.keySet();
		//����
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			//�ӵ�������ȡ�� keyֵ
			Integer key = (Integer)iter.next();
			//��ͨ�� map��get������ȡ�� value
			String value = (String)map.get(key);
			//���
			System.out.printf("%s -> %s\n",key,value);
		}
		System.out.println("//----entrySet ----------");
		//3.���� entrySet ���������� map
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
