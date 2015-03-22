package com.corejava.day12;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		String file = "datas/out.txt";
		BufferedReader br = 
			new BufferedReader(
					new InputStreamReader(System.in));
		//构建PrintWriter
		PrintWriter pw = null;
		try {
			//带自动刷新
			pw = new PrintWriter(
					new FileWriter(file),true);
			while(true){
				//提示用户输入
				System.out.print("请输入>");
				String line = br.readLine();
				//判断
				if(line.equals("exit")){
					System.out.println(":)谢谢");
					break;
				}
				//打印的同时，再记录到文件中
				System.out.println("Reply>"+line);
				//记录到文件
				pw.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//释放资源
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}
	}
}
