package com.corejava.day12;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.corejava.day05.Rect;
import com.corejava.day06.Book;

public class TestField {

	public static void main(String[] args) {
		Book b1 = new Book("莫言","蛙",18.5);
		b1.setId(100000l);
		Rect rect = new  Rect("常反省", 12.21, 12.3);
		b1.setRect(rect);
		//普通方式
		String name = b1.getName();
//		System.out.println(name);
//		System.out.println(b1.getAuthor());
		//使用反射 的方式来获取 对象属性值
		Class<Book> c = Book.class;
		//获取属性
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
					    Method getMethod = pd.getReadMethod();//获得get方法
					    Object o = getMethod.invoke(b1);
					    System.out.println(o.toString());
			}
			
			
			
			//设置可访问的权限
			f.setAccessible(true);
			//获取 对象b1的 name属性的值
			String n = (String)f.get(b1);
			System.out.println(n);
			//重新设 name 属性的值
			f.set(b1, "生死疲劳");
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
