package com.corejava.day06;

import java.io.Serializable;

import com.corejava.day05.Rect;

/****************
 * 图书实体类
 * @author 	jsd1307
 * @创建时间 Jul 26, 2013 9:55:20 AM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day06
 * @文件名   Book.java
 *
 */
public class Book implements Serializable{

	/**
	 * 
	 */
	//private static final long serialVersionUID = -721346080276995476L;
	
	//属性
	private long id; //
	private String author; //作者
	private String name; //书名
	private double price; //单价
	private Rect rect;
	
	
	public Book() {
		super();
	}
	public Book(long id, String author, String name, double price) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
		this.price = price;
	}
	public Book(String author, String name, double price) {
		super();
		this.author = author;
		this.name = name;
		this.price = price;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Rect getRect() {
		return rect;
	}
	public void setRect(Rect rect) {
		this.rect = rect;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("~~~~ "+result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("~~~equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		//生成[属性名=值,属性名=值] 这种格式
		StringBuilder builder = new StringBuilder();
		builder.append("[书名=").append(name)
				.append(",作者=").append(author)
				.append(",单价=").append(price)
				.append("]");
		return builder.toString();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("我要被销毁了....");
		System.out.println(
				Thread.currentThread().getName()
				+" 运行结束...");
		super.finalize();
	}
	
	
//	@Override
	public int compareTo(Object o) {
		System.out.println("~~~~~");
		//此处按价格来排
		Book b = (Book)o;
		if(this.price > b.price){
			return 1;
		}else if(this.price < b.price){
			return -1;
		}else{
			return 0;
		}
		
		//按书名排序
//		return this.name.compareTo(b.name);
//		return 0;
	}
	
	
}
