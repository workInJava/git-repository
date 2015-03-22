package com.xml.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParser {

	public static void parse(String xmlpath){
		File file = new File(xmlpath);
		if(!file.exists()||file.isDirectory()){
			System.out.println("�ļ������ڻ����ļ�:"+xmlpath);
			return ;
		}
		//1.
		DocumentBuilderFactory factory = 
			DocumentBuilderFactory.newInstance();
		//2.
		try {
			DocumentBuilder builder = 
					factory.newDocumentBuilder();
			//3.����
			Document doc = builder.parse(file);
			
			//4.����� Document
			handlerDoc(doc);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	private static void handlerDoc(Document doc) {
		//1.�Ȼ�ȡ ���ڵ�
		Element root = doc.getDocumentElement();
		//���
		System.out.println("���ڵ�����ƣ�"
					+root.getTagName());
		//2.ͨ�����ڵ㣬ȡ�����к��ӽڵ�(����student�ڵ�)
		NodeList childs = 
			root.getElementsByTagName("student");
		//3.����
		for(int i=0;i<childs.getLength();i++){
			Element stuElement = (Element)childs.item(i);
			//����ѧԱ Ԫ��
			handlerStudent(stuElement);
		}
	}

	private static void handlerStudent(Element e) {
		//a.���Ȼ�ȡ����
		int id = 
			Integer.parseInt(e.getAttribute("id"));
		//b.��ȡ��������
		String name = getValue(e, "name");
		int age = Integer.parseInt(getValue(e, "age"));
		String gender = getValue(e, "gender");
		String desc = getValue(e, "description");
		//���
		System.out.printf("%d,%s,%d,%s,%s\n"
				,id,name,age,gender,desc);
	}
	
	private static String getValue(Element e,String tagName){
		Element e1 = 
			(Element)e.getElementsByTagName(tagName)
						.item(0);
		String nValue = e1.getFirstChild().getNodeValue();
		return nValue;
	}
	
	public static void main(String[] args) {
		parse("src/com/xml/students.xml");
	}
}


