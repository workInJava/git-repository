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

//对象流的操作演示
public class ObjectStreamDemo {
	
	private final static String PATH = "datas/books.txt"; 
	/*******
	 * 本方法持久化 Book对象的集合
	 * @param books
	 */
	public boolean writeObject(List<Book> books){
		ObjectOutputStream oos = null;
		boolean b = false;
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(PATH)));
			//写入对象
			oos.writeObject(books);
			b = true;
			System.out.println("持久化成功...");
			
		} catch (IOException e) {
			System.out.println("持久化失败...");
			e.printStackTrace();
		} finally {
			//释放资源
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
	 * 从文件中加载所有的Book实例 
	 * @return
	 */
	public List<Book> loadBooks(){
		//判断文件是否存在
		File file = new File(PATH);
		if(!file.exists()){
			System.out.println("文件不存在.");
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



