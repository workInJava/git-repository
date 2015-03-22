package com.corejava.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadKeyBoard {

	public static void main(String[] args) {
		//
		BufferedReader br = 
			new BufferedReader(
					new InputStreamReader(System.in));
		try {
			//读取数据
			while (true) {
				System.out.print("请输入>");
				String line = br.readLine();
				if (line.equals("exit")) {
					System.out.println(":)谢谢");
					break;
				}
				//直接输出
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
