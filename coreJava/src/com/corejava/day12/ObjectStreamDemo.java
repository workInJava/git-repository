package com.corejava.day12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.corejava.day06.Book;

//�������Ĳ�����ʾ
public class ObjectStreamDemo {
	
	private final static String PATH = "datas/books.txt"; 
	/*******
	 * �������־û� Book����ļ���
	 * @param books
	 */
	public boolean writeObject(List<Book> books){
		ObjectOutputStream oos = null;
		boolean b = false;
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(PATH)));
			//д�����
			oos.writeObject(books);
			b = true;
			System.out.println("�־û��ɹ�...");
			
		} catch (IOException e) {
			System.out.println("�־û�ʧ��...");
			e.printStackTrace();
		} finally {
			//�ͷ���Դ
			try {
				if(oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return b;
	}
	
	/*******
	 * ���ļ��м������е�Bookʵ�� 
	 * @return
	 */
	public List<Book> loadBooks(){
		//�ж��ļ��Ƿ����
		File file = new File(PATH);
		if(!file.exists()){
			System.out.println("�ļ�������.");
			return null;
		}
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(file)));
			List<Book> books = (List<Book>)ois.readObject();
			return books;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}



