package com.model;

import java.io.File;

public class TestFile {

	public static void main(String[] args){
		String path = "E:/note/notebook/corejava/day12";
		File file = new File(path);
		if(file.exists()){
			System.out.println("ÎÄ¼þ´æÔÚ");
			String[] file1 = file.list();
			for(int a=0;a<file1.length;a++){
				System.out.println(file1[a]);
			}
			file.delete();
		}else{
			
			System.out.println(file.mkdir());
			
		}
	}
}
