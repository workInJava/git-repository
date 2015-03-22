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
	 *            ����ӡ���ļ�·��
	 * @param second
	 *            ģ����� ����
	 */
	public static void print(String filepath, long second) {
		// �ж�
		File file = new File(filepath);
		if (!file.exists() || file.isDirectory()) {
			System.out.println("�����ļ����ļ�������:" + filepath);
			return;
		}
		// ��ȡ����
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			int len = -1;
			while ((len = fr.read()) != -1) {
				// ��ʵ�ʶ������ַ�ǿ��ת���� �ַ�
				char c = (char) len;
				// ���
				System.out.print(c);
				// ģ�� sleep
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
