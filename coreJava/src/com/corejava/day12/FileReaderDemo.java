package com.corejava.day12;

import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		String file = "src/com/corejava/day11/FileCopy.java";
		print(file, 500);
	}

	/*********
	 * 
	 * @param filepath
	 *            待打印的文件路径
	 * @param second
	 *            模拟快慢 毫秒
	 */
	public static void print(String filepath, long second) {
		// 判断
		File file = new File(filepath);
		if (!file.exists() || file.isDirectory()) {
			System.out.println("不是文件或文件不存在:" + filepath);
			return;
		}
		// 读取数据
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			int len = -1;
			while ((len = fr.read()) != -1) {
				// 把实际读到的字符强制转换成 字符
				char c = (char) len;
				// 输出
				System.out.print(c);
				// 模拟 sleep
				try {
					Thread.sleep((int) (Math.random() * second));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
