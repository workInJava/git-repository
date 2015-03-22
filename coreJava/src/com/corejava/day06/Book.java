package com.corejava.day06;

import java.io.Serializable;

import com.corejava.day05.Rect;

/****************
 * ͼ��ʵ����
 * @author 	jsd1307
 * @����ʱ�� Jul 26, 2013 9:55:20 AM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day06
 * @�ļ���   Book.java
 *
 */
public class Book implements Serializable{

	/**
	 * 
	 */
	//private static final long serialVersionUID = -721346080276995476L;
	
	//����
	private long id; //
	private String author; //����
	private String name; //����
	private double price; //����
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
		//����[������=ֵ,������=ֵ] ���ָ�ʽ
		StringBuilder builder = new StringBuilder();
		builder.append("[����=").append(name)
				.append(",����=").append(author)
				.append(",����=").append(price)
				.append("]");
		return builder.toString();
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��Ҫ��������....");
		System.out.println(
				Thread.currentThread().getName()
				+" ���н���...");
		super.finalize();
	}
	
	
//	@Override
	public int compareTo(Object o) {
		System.out.println("~~~~~");
		//�˴����۸�����
		Book b = (Book)o;
		if(this.price > b.price){
			return 1;
		}else if(this.price < b.price){
			return -1;
		}else{
			return 0;
		}
		
		//����������
//		return this.name.compareTo(b.name);
//		return 0;
	}
	
	
}
