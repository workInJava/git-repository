package com.corejava.day07.zuoye;

import java.util.ArrayList;
import java.util.List;

import com.corejava.day03.homework.Circle;

public class TestNewList {

	public static void main(String args[]){
		Circle s = new Circle("www",32.3);
		List al = new ArrayList<>();
		al.add(s);
		al.add(new Circle("aaa",32.3));
		al.add(s);
		al.add(new Circle("weee",32.3));
		al.add(new Circle("wwfffw",32.3));
		al.add(new Circle("fff",32.3));
		al.add(new Circle("vvv",32.3));
		al.add(new Circle("wvvww",32.3));
		al.add(new Circle("ee",32.3));
		
		/*for(int a=0;a<al.size();a++){
			System.out.println(al.get(a).toString());
		}*/
		System.out.println("--------有序可重复-------");
		List bl = new ArrayList(al);
		/*for(int a=0;a<bl.size();a++){
			System.out.println(bl.get(a));
		}*/
		System.out.println();
		al.remove(s);
		System.out.println("remove之后的al");
		/*for(int a=0;a<al.size();a++){
			System.out.println(al.get(a));
		}*/
		System.out.println("remove al 之后的bl");
		/*for(int a=0;a<bl.size();a++){
			System.out.println(bl.get(a));
		}*/
	}
}
