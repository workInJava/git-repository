package com.corejava.day11;

import java.io.File;
import java.io.FilenameFilter;
//文件名后缀过滤器
public class SuffixNameFilter implements FilenameFilter {

	private String suffix;
	public SuffixNameFilter(){
		this.suffix = ".txt";
	}
	public SuffixNameFilter(String suffix){
		this.suffix = suffix;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		//做判断
		//如果 name是目录，则返回true
		File file = new File(dir,name);
		if(file.isDirectory()){
			return true;
		}else{
			//如果是文件，则判断 name 是否以 .txt结尾
			if(name.endsWith(suffix)){
				return true;
			}
		}
		
		return false;
	}

}
