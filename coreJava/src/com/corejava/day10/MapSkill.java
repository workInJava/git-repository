package com.corejava.day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.corejava.day06.Book;

//ʹ��Map�ļ���
public class MapSkill {
	
	private static List<Book> books ;
	
	static {
		Book b2 = new Book(1002,"��ӹ","ѩɽ�ɺ�",29.5);
		Book b3 = new Book(1003,"��ӹ","�������",28.0);
		Book b4 = new Book(1004,"����","С��ɵ�",31.8);
		Book b5 = new Book(1005,"����","һ������",19.2);
		Book b6 = new Book(1006,"Ī��","����ƣ��",29.8);
		Book b1 = new Book(1001,"��ӹ","���Ǿ�",5.5);
		Book b7 = new Book(1007,"Ī��","��",21.8);
		Book b8 = new Book(1008,"Ī��","�������",45.2);
		Book b9 = new Book(1009,"����","������",5.8);
		Book b10 = new Book(1010,"��ӹ","¹����",39.5);
		Book b11 = new Book(1011,"��ӹ","Ц������",11.9);
		//��ʼ������
		books = new ArrayList<Book>();
		//�������
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

	//1.keyֵ����ʹ���Զ�������е�Ψһ�����ԡ��磺id
	public static Map<Long,Book> skill_1(){
		//��books�е�����ͼ��ȫ��ת�浽 Map�У�������
		//a.����һ��Map
		Map<Long,Book> bookMap = new HashMap<Long,Book>();
		//b.ѭ�� books List����
		for(Book o : books){
//			Book b = (Book)o;
			//����ӵ� bookMap
			bookMap.put(o.getId(), o);
		}
		//c. ����Map
		return bookMap;
	}
	
	/*********
	 * ������������ѯͼ����Ϣ����������������ͼ������
	 * Map,����
	 * @param author ����
	 * @return 
	 */
	public static Map<Long,Book> getBooksByAuthor(String author){
		Map<Long,Book> bookMap = new HashMap<Long,Book>();
		//b.ѭ�� books List����
		for(Book o : books){
//			Book b = (Book)o;
			if(o.getAuthor().equals(author)){
			//����ӵ� bookMap
				bookMap.put(o.getId(), o);
			}
		}
		//c. ����Map
		return bookMap;
	}
	
	//��������ϵ�����(books)����ͳ�Ƴ��������߷ֱ��ж��ٱ���
	//���ص�Map��key�����ߣ�value���������
	public static Map count(){
		
		return null;
	}
	
	//��������ϵ�����(books),ͳ�Ƴ�ÿ�����ߵ�ͼ����ܼۡ�
	//���ص�Map��key�����ߣ�value������ܼ�
	public static Map countPrice(){
		
		return null;
	}
	//ͳ��ÿ���������������ϸ
	//���ص�Map key�����ߣ� value����һ��Book�ļ���(List)
	public static Map countAuthor(){
		
		return null;
	}
	
	
	//��ӡ���
	public static void print(Map map){
		Set set = map.keySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			Long key = (Long)iter.next();
			Book value = (Book)map.get(key);
			//���
			System.out.printf("[%s]->%s\n",key,value);
		}
	}
	
}


