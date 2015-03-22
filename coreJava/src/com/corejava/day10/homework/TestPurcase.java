package com.corejava.day10.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestPurcase {
	
	private static List list;
	static {
		Purcase p1 = new Purcase("����", "ϴ�ַ�", 18.5);
		Purcase p2 = new Purcase("��������", "����", 4.5);
		Purcase p3 = new Purcase("����", "����", 32.5);
		Purcase p4 = new Purcase("����", "ë��", 14.5);
		Purcase p5 = new Purcase("����", "ϴ����", 26.0);
		Purcase p6 = new Purcase("�õ�", "ϴ��ˮ", 27.5);
		Purcase p7 = new Purcase("���", "��ԡ¶", 38.5);
		Purcase p8 = new Purcase("����", "ϴ�ྫ", 3.4);
		list = new ArrayList();

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);

	}
	//ͳ�Ƹ���Ʒ�Ƶ���Ʒ�ܼ�
	public static Map countPrice(){
		Map result = new HashMap();
		for(Object o : list){
			Purcase p = (Purcase)o;
			String brand = p.getBrand();
			if(result.containsKey(brand)){
				Double price = (Double)result.get(brand);
				result.put(brand, price+p.getCost());
			} else {
				result.put(brand, p.getCost());
			}
		}
		return result;
	}
	
	//�԰�Ʒ��ͳ�Ƴ������ܼ۽��е�������
	public static List<PurcaseView> sortView(){
		List<PurcaseView> pv = new ArrayList<PurcaseView>();
		Map map = countPrice();
		//����map
		Set mapSet = map.entrySet();
		Iterator iter = mapSet.iterator();
		while(iter.hasNext()){
			Entry entry = (Entry)iter.next();
			String key = (String)entry.getKey();
			Double value = (Double)entry.getValue();
			//���� PurcaseView ����
			PurcaseView pvw = new PurcaseView(key,value);
			pv.add(pvw);
		}
		//��һ������
		Collections.sort(pv);
		return pv;
	}
	
	public static void main(String[] args) {
		Map m1=countPrice();
		Set set1=m1.entrySet();
		Iterator it1=set1.iterator();
		while(it1.hasNext()){
			Entry en=(Entry)it1.next();
			String i1=(String)en.getKey();
			Double s1=(Double)en.getValue();
			System.out.println(i1+","+s1);
		}
		//
		System.out.println("//--- �����");
		List list = sortView();
		for(Object o : list){
			PurcaseView pv = (PurcaseView)o;
			System.out.printf("%s, %.2f\n"
					,pv.getBrand(),pv.getTotal());
		}
		
	}

}

