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
		//����PrintWriter
		PrintWriter pw = null;
		try {
			//���Զ�ˢ��
			pw = new PrintWriter(
					new FileWriter(file),true);
			while(true){
				//��ʾ�û�����
				System.out.print("������>");
				String line = br.readLine();
				//�ж�
				if(line.equals("exit")){
					System.out.println(":)лл");
					break;
				}
				//��ӡ��ͬʱ���ټ�¼���ļ���
				System.out.println("Reply>"+line);
				//��¼���ļ�
				pw.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ͷ���Դ
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			pw.close();
		}
	}
}
