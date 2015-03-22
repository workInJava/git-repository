
package com.corejava.day10.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.corejava.day06.Book;

//使用Map的技巧
public class MapSkill {
	
	private static List books ;
	
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
		books = new ArrayList();
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
	public static Map skill_1(){
		//把books中的所有图书全部转存到 Map中，并返回
		//a.创建一个Map
		Map bookMap = new HashMap();
		//b.循环 books List集合
		for(Object o : books){
			Book b = (Book)o;
			//再添加到 bookMap
			bookMap.put(b.getId(), b);
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
	public static Map getBooksByAuthor(String author){
		Map bookMap = new HashMap();
		//b.循环 books List集合
		for(Object o : books){
			Book b = (Book)o;
			if(b.getAuthor().equals(author)){
			//再添加到 bookMap
				bookMap.put(b.getId(), b);
			}
		}
		//c. 返回Map
		return bookMap;
	}
	
	//请根据以上的数据(books)，请统计出各个作者分别有多少本书
	//返回的Map的key是作者，value是书的数量
	public static Map count(){
		/*Map bookMap1 = new HashMap();
		Map bookMap2 = new HashMap();
		Map bookMap3 = new HashMap();
		Map bookMap4 = new HashMap();
		Map bookMap = new HashMap();
		for(Object ob:books){
			Book b1=(Book)ob;
			if(b1.getAuthor().equals("金庸")){
				bookMap1.put(b1.getId(), b1);
			}else if
			(b1.getAuthor().equals("古龙")){
				bookMap2.put(b1.getId(), b1);
			}else if
			(b1.getAuthor().equals("琼瑶")){
				bookMap3.put(b1.getId(), b1);
			}else{
				bookMap4.put(b1.getId(), b1);
			}
		}
		bookMap.put("金庸",bookMap1.size());
		bookMap.put("古龙",bookMap2.size());
		bookMap.put("琼瑶",bookMap3.size());
		bookMap.put("莫言",bookMap4.size());
		return bookMap;*/
		
		//创建一个Map，来存放结果
		Map result = new HashMap();
		for(Object o : books){
			Book b = (Book)o;
			//图书的作者
			String author = b.getAuthor();
			//判断当前的map中是否含有此author的key
			if(result.containsKey(author)){
				//取出value
				Integer num = (Integer)result.get(author);
				num++;
				result.put(author, num);
			}else{
				//说明此map中暂没有此key,就添加到map中，value为1
				Integer num = new Integer(1);
				result.put(author, num);
			}
		}
		return result;
	}
	
	//请根据以上的数据(books),统计出每个作者的图书的总价。
	//返回的Map的key是作者，value是书的总价
	public static Map countPrice(){
		
		/*Map bookMap1 = new HashMap();
		double s1=0;
		double s2=0;
		double s3=0;
		double s4=0;
		for(Object ob:books){
			Book b1=(Book)ob;
			if(b1.getAuthor().equals("金庸")){
				
				s1=s1+b1.getPrice();
			}else if
			(b1.getAuthor().equals("古龙")){
				
				s2=s2+b1.getPrice();
			}else if
			(b1.getAuthor().equals("琼瑶")){
				
				s3=s3+b1.getPrice();
			}else{
				
				s4=s4+b1.getPrice();
			}
		}
		
		bookMap1.put("金庸",s1);
		bookMap1.put("古龙",s2);
		bookMap1.put("琼瑶",s3);
		bookMap1.put("莫言",s4);
		return bookMap1;*/
		
		Map result = new HashMap();
		for(Object o : books){
			Book b = (Book)o;
			String author = b.getAuthor();
			if(result.containsKey(author)){
				Double price = (Double)result.get(author);
				Double total = price + b.getPrice();
				//重新设回去
				result.put(author, total);
			}else{
				result.put(author, b.getPrice());
			}
		}
		return result;
	}
	//统计每个作者所著书的明细
	//返回的Map key是作者， value又是一个Book的集合(List)
	public static Map countAuthor(){
		/*List bookList1 = new ArrayList();
		List bookList2 = new ArrayList();
		List bookList3 = new ArrayList();
		List bookList4 = new ArrayList();
		Map bookMap = new HashMap();
		for(Object ob:books){
			Book b1=(Book)ob;
			if(b1.getAuthor().equals("金庸")){
				bookList1.add(b1);
			}else if
			(b1.getAuthor().equals("古龙")){
				bookList2.add(b1);
			}else if
			(b1.getAuthor().equals("琼瑶")){
				bookList3.add(b1);
			}else{
				bookList4.add(b1);
			}
		}
		bookMap.put("金庸",bookList1);
		bookMap.put("古龙",bookList2);
		bookMap.put("琼瑶",bookList3);
		bookMap.put("莫言",bookList4);
		return bookMap;
		*/
		Map result = new HashMap();
		List temp = null;
		for(Object o : books){
			Book b = (Book)o;
			String author = b.getAuthor();
			if(result.containsKey(author)){
				//...
				temp = (List)result.get(author);
			} else {
				//...
				temp = new ArrayList();
				//把数据put到map中
				result.put(author, temp);
			}
			temp.add(b);
		}
		return result;
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

