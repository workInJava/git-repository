package com.Design.pattern.proxy;

import java.util.Arrays;

import jdk.nashorn.internal.ir.LiteralNode.ArrayLiteralNode.ArrayUnit;

public class TestProxy {
	
	public static void main(String[] args){
		Proxy p = new Proxy();
		p.method();
		
		String s = "whmljl";
		char[] r = s.toCharArray();
		for(char w : r){
			System.out.println(w);
		}
		System.out.println(substring("dhushu",2));
	}
	
	public static String substring(String str,int index){
		if(str == null || "".equals(str)){
			return "";
		}
		char[] s = str.toCharArray();
		return new String(s,index,s.length-index);
	}

}
