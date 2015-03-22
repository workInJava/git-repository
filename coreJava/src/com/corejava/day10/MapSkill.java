package com.corejava.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.corejava.day06.Book;

//使用Map的技巧
public class MapSkill {
	
	private static List<Book> books ;
	
	static {
		Book b2 = new Book(1002,"金庸","雪山飞狐",29.5);
		Book b3 = new Book(1003,"金庸","神雕侠侣",28.0);
		Book b4 = new Book(1004,"古龙","小李飞刀",31.8);
		Book b5 = new Book(1005,"琼瑶","一帘幽梦",19.2);
		Book b6 = new Book(1006,"莫言","生死疲劳",29.8);
		Book b1 = new Book(1001,"金庸","连城决",5.5);
		Book b7 = new Book(1007,"莫言","蛙",21.8);
		Book b8 = new Book(1008,"莫言","丰乳肥臀",45.2);
		Book b9 = new Book(1009,"琼瑶","还珠格格",5.8);
		Book b10 = new Book(1010,"金庸","鹿鼎记",39.5);
		Book b11 = new Book(1011,"金庸","笑傲江湖",11.9);
		//初始化集合
		books = new ArrayList<Book>();
		//存放数据
		books.add(b1);
		books.add(b4);
		books.add(b6);
		books.add(b3);
		books.add(b11);
		books.add(b7);
		books.add(b9);
		books.add(b5);
		books.add(b10);
		books.add(b8);
		books.add(b2);
	}

	//1.key值尽量使用自定义对象中的唯一性属性。如：id
	public static Map<Long,Book> skill_1(){
		//把books中的所有图书全部转存到 Map中，并返回
		//a.创建一个Map
		Map<Long,Book> bookMap = new HashMap<Long,Book>();
		//b.循环 books List集合
		for(Book o : books){
//			Book b = (Book)o;
			//再添加到 bookMap
			bookMap.put(o.getId(), o);
		}
		//c. 返回Map
		return bookMap;
	}
	
	/*********
	 * 根据作者来查询图书信息，并把满足条件的图书存放在
	 * Map,返回
	 * @param author 作者
	 * @return 
	 */
	public static Map<Long,Book> getBooksByAuthor(String author){
		Map<Long,Book> bookMap = new HashMap<Long,Book>();
		//b.循环 books List集合
		for(Book o : books){
//			Book b = (Book)o;
			if(o.getAuthor().equals(author)){
			//再添加到 bookMap
				bookMap.put(o.getId(), o);
			}
		}
		//c. 返回Map
		return bookMap;
	}
	
	//请根据以上的数据(books)，请统计出各个作者分别有多少本书
	//返回的Map的key是作者，value是书的数量
	public static Map count(){
		
		return null;
	}
	
	//请根据以上的数据(books),统计出每个作者的图书的总价。
	//返回的Map的key是作者，value是书的总价
	public static Map countPrice(){
		
		return null;
	}
	//统计每个作者所著书的明细
	//返回的Map key是作者， value又是一个Book的集合(List)
	public static Map countAuthor(){
		
		return null;
	}
	
	
	//打印输出
	public static void print(Map map){
		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Long key = (Long)iter.next();
			Book value = (Book)map.get(key);
			//输出
			System.out.printf("[%s]->%s\n",key,value);
		}
	}
	
}


