package com.corejava.day11;

import java.io.File;
import java.io.FilenameFilter;

//本例操作 java.io.File 类
public class FileDemo {

	public static void main(String[] args) {
		FileDemo fd = new FileDemo();
		String path = "D:\\";
		fd.dir(path,".png");
	}
	//如果传进来的是一个文件，则直接输出这个文件名
	//如果传进来的是一个目录，则输出此目录下的所有子目录和文件
	public void dir(String path,String filter){
		//1.把path构建成 File实例
		File file = new File(path);
		//2.做判断
		if(!file.exists()){
			System.out.println("文件不存在..");
			return ;
		}
		if(file.isFile()){
			System.out.println(file.getName());
//			System.out.println(file.getAbsolutePath());
			return ;
		}
		//则说明是目录，则操作目录
		dir(file,filter);
	}

	private void dir(File file,String filter) {
		System.out.printf("目录 %s 下的所有内容：\n",file);
		// TODO Auto-generated method stub
		//调用 list方法列举出所有的文件或子目录
		/*String[] files = file.list();
		//迭代此数据
		for(String name : files){
			System.out.println("\t"+name);
		}*/
		//创建一个过滤器
		FilenameFilter fnf = null;
		if(filter == null){
			fnf = new SuffixNameFilter();
		}else{
			fnf = new SuffixNameFilter(filter);
		}
		File[] files = file.listFiles(fnf);
		//保证那些拒绝访问的目录不抛出空指针异常
		if(files == null){
			return ;
		}
		//迭代
		for(File f : files){
			//判断，如果是目录，则递归调用自己
			if(f.isDirectory()){
				dir(f,filter);
			}else{
				System.out.println("\t"+f.getName());
			}
		}
	}
}
