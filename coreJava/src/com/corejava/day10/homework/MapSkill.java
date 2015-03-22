
package com.corejava.day10.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.corejava.day06.Book;

//ʹ��Map�ļ���
public class MapSkill {
	
	private static List books ;
	
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
		books = new ArrayList();
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
	public static Map skill_1(){
		//��books�е�����ͼ��ȫ��ת�浽 Map�У�������
		//a.����һ��Map
		Map bookMap = new HashMap();
		//b.ѭ�� books List����
		for(Object o : books){
			Book b = (Book)o;
			//����ӵ� bookMap
			bookMap.put(b.getId(), b);
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
	public static Map getBooksByAuthor(String author){
		Map bookMap = new HashMap();
		//b.ѭ�� books List����
		for(Object o : books){
			Book b = (Book)o;
			if(b.getAuthor().equals(author)){
			//����ӵ� bookMap
				bookMap.put(b.getId(), b);
			}
		}
		//c. ����Map
		return bookMap;
	}
	
	//��������ϵ�����(books)����ͳ�Ƴ��������߷ֱ��ж��ٱ���
	//���ص�Map��key�����ߣ�value���������
	public static Map count(){
		/*Map bookMap1 = new HashMap();
		Map bookMap2 = new HashMap();
		Map bookMap3 = new HashMap();
		Map bookMap4 = new HashMap();
		Map bookMap = new HashMap();
		for(Object ob:books){
			Book b1=(Book)ob;
			if(b1.getAuthor().equals("��ӹ")){
				bookMap1.put(b1.getId(), b1);
			}else if
			(b1.getAuthor().equals("����")){
				bookMap2.put(b1.getId(), b1);
			}else if
			(b1.getAuthor().equals("����")){
				bookMap3.put(b1.getId(), b1);
			}else{
				bookMap4.put(b1.getId(), b1);
			}
		}
		bookMap.put("��ӹ",bookMap1.size());
		bookMap.put("����",bookMap2.size());
		bookMap.put("����",bookMap3.size());
		bookMap.put("Ī��",bookMap4.size());
		return bookMap;*/
		
		//����һ��Map������Ž��
		Map result = new HashMap();
		for(Object o : books){
			Book b = (Book)o;
			//ͼ�������
			String author = b.getAuthor();
			//�жϵ�ǰ��map���Ƿ��д�author��key
			if(result.containsKey(author)){
				//ȡ��value
				Integer num = (Integer)result.get(author);
				num++;
				result.put(author, num);
			}else{
				//˵����map����û�д�key,����ӵ�map�У�valueΪ1
				Integer num = new Integer(1);
				result.put(author, num);
			}
		}
		return result;
	}
	
	//��������ϵ�����(books),ͳ�Ƴ�ÿ�����ߵ�ͼ����ܼۡ�
	//���ص�Map��key�����ߣ�value������ܼ�
	public static Map countPrice(){
		
		/*Map bookMap1 = new HashMap();
		double s1=0;
		double s2=0;
		double s3=0;
		double s4=0;
		for(Object ob:books){
			Book b1=(Book)ob;
			if(b1.getAuthor().equals("��ӹ")){
				
				s1=s1+b1.getPrice();
			}else if
			(b1.getAuthor().equals("����")){
				
				s2=s2+b1.getPrice();
			}else if
			(b1.getAuthor().equals("����")){
				
				s3=s3+b1.getPrice();
			}else{
				
				s4=s4+b1.getPrice();
			}
		}
		
		bookMap1.put("��ӹ",s1);
		bookMap1.put("����",s2);
		bookMap1.put("����",s3);
		bookMap1.put("Ī��",s4);
		return bookMap1;*/
		
		Map result = new HashMap();
		for(Object o : books){
			Book b = (Book)o;
			String author = b.getAuthor();
			if(result.containsKey(author)){
				Double price = (Double)result.get(author);
				Double total = price + b.getPrice();
				//�������ȥ
				result.put(author, total);
			}else{
				result.put(author, b.getPrice());
			}
		}
		return result;
	}
	//ͳ��ÿ���������������ϸ
	//���ص�Map key�����ߣ� value����һ��Book�ļ���(List)
	public static Map countAuthor(){
		/*List bookList1 = new ArrayList();
		List bookList2 = new ArrayList();
		List bookList3 = new ArrayList();
		List bookList4 = new ArrayList();
		Map bookMap = new HashMap();
		for(Object ob:books){
			Book b1=(Book)ob;
			if(b1.getAuthor().equals("��ӹ")){
				bookList1.add(b1);
			}else if
			(b1.getAuthor().equals("����")){
				bookList2.add(b1);
			}else if
			(b1.getAuthor().equals("����")){
				bookList3.add(b1);
			}else{
				bookList4.add(b1);
			}
		}
		bookMap.put("��ӹ",bookList1);
		bookMap.put("����",bookList2);
		bookMap.put("����",bookList3);
		bookMap.put("Ī��",bookList4);
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
				//������put��map��
				result.put(author, temp);
			}
			temp.add(b);
		}
		return result;
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

