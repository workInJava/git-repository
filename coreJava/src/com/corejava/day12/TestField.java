package com.corejava.day12;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.corejava.day05.Rect;
import com.corejava.day06.Book;

public class TestField {

	public static void main(String[] args) {
		Book b1 = new Book("Ī��","��",18.5);
		b1.setId(100000l);
		Rect rect = new  Rect("����ʡ", 12.21, 12.3);
		b1.setRect(rect);
		//��ͨ��ʽ
		String name = b1.getName();
//		System.out.println(name);
//		System.out.println(b1.getAuthor());
		//ʹ�÷��� �ķ�ʽ����ȡ ��������ֵ
		Class<Book> c = Book.class;
		//��ȡ����
		try {
			Field f = c.getDeclaredField("name");
			Field[] fs = c.getDeclaredFields();
			for(Field fl:fs){
				System.out.println("-------------------------------");
				System.out.println(fl);
				System.out.println(fl.getName());
				System.out.println(fl.getType());
				System.out.println(fl.getType().getClassLoader());
				if(fl.getType().getClassLoader()!=null){
					main(args);
				}
				int fi = f.getModifiers();
				System.out.println(Modifier.toString(fi));
				PropertyDescriptor pd = new PropertyDescriptor(fl.getName(),c);
					    Method getMethod = pd.getReadMethod();//���get����
					    Object o = getMethod.invoke(b1);
					    System.out.println(o.toString());
			}
			
			
			
			//���ÿɷ��ʵ�Ȩ��
			f.setAccessible(true);
			//��ȡ ����b1�� name���Ե�ֵ
			String n = (String)f.get(b1);
			System.out.println(n);
			//������ name ���Ե�ֵ
			f.set(b1, "����ƣ��");
			System.out.println(b1.getName());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e){
			
		}
	}
}
