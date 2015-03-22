package com.corejava.day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopy {

	public static void main(String[] args) {
		String src = "D:\\安装文件\\Oracle10g第2版(10.2.0.3-10.2.0.4)_10203_vista_w2k8_x86_production_db.ZIP";
		String dir = "E:\\test";
		FileCopy.copy(src, dir);
	}
	
	/**********
	 * 文件拷贝, 本方法暂不支持目录的拷贝
	 * @param src 原文件
	 * @param dest 目标目录
	 */
	public static void copy(String src,String dir){
		//判断
		File srcFile = new File(src);
		if(!srcFile.exists()){
			System.out.println(src+" 不存在...");
			return ;
		}
		if(srcFile.isDirectory()){
			System.out.println("本方法暂不支持目录的拷贝");
			return;
		}
		//建立目标的文件对象
		File target = new File(dir);
		if(!target.exists()){
			target.mkdirs();
		}
		File targetFile = new File(target,srcFile.getName());
		//初始化文件流
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
		BufferedInputStream fis = null;
		BufferedOutputStream fos = null;
		try {
			fis = new BufferedInputStream(
						new FileInputStream(srcFile));
			int size = fis.available();
			//再创建文件输出流
			fos = new BufferedOutputStream(
						new FileOutputStream(targetFile));
			//定义变量，来操作流
			int len = -1; //用来记录实际读到的字节数
			//大小：1M
			byte[] buf = new byte[1024*1204];//存放数据的数组
			//定义一个变量，保存读到的进度
			double total = 0.0;
			//循环 读
			while((len = fis.read(buf)) != -1){
				// 写
				fos.write(buf, 0, len);//写入实际读到的字节数
				total += len;
				//输出一句话：
				System.out.printf
					("\r已完成【%.2f%%】",total/size * 100);
			}
			//
			System.out.println("\ncopy over");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//释放资源
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
