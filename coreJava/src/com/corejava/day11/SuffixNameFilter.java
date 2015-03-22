package com.corejava.day11;

import java.io.File;
import java.io.FilenameFilter;
//�ļ�����׺������
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
		//���ж�
		//��� name��Ŀ¼���򷵻�true
		File file = new File(dir,name);
		if(file.isDirectory()){
			return true;
		}else{
			//������ļ������ж� name �Ƿ��� .txt��β
			if(name.endsWith(suffix)){
				return true;
			}
		}
		
		return false;
	}

}
