package com.corejava.day07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**************
 * ������ʾ�ַ�������
 * @author 	jsd1307
 * @����ʱ�� Jul 29, 2013 2:45:01 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day07
 * @�ļ���   StringDeal.java
 *
 */
public class StringDeal {

	//����
	private String content = "There was a file that "+
		"store at \"d:/program file/dict\" directory,"+
		"the format of content as fellow:\n"+
		"1:Document:�ĵ�#����#�İ�";
	
	//����
	public void deal(){
		int length = content.length();
		System.out.println("�ַ����ܳ��ȣ�"+length);
//		1.ȡ��str�ַ����е�˫����֮���·��
		//a.�ҵ���һ��˫����������λ�� 
		int pos_1 = content.indexOf("\"");
		//b.�ҵ��ڶ���˫����������λ��
		int pos_2 = content.indexOf("\"",pos_1+1);
		//c.��ȡ�Ӵ�
		String path = content.substring(pos_1+1, pos_2);
		//���
		System.out.println("·���ǣ�"+path);
//		2.������еĿհ��ַ��滻��^������·���еĿհ�����
		StringBuilder builder = new StringBuilder();
		builder.append(content.substring(0,pos_1+1)
							.replace(" ", "^"));
		builder.append(path);
		builder.append(content.substring(pos_2)
							.replace(" ", "^"));
		//���
		System.out.println("�滻��\n"+builder.toString());
		
//		3.�����һ�е�����ȡ������
		int pos = content.lastIndexOf("\n");
		String line = content.substring(pos+1);
		System.out.println("���һ�У�"+line);
		
//		4.�밴:�Ų�֣����һ������ʹ��#�ٴβ�֡�
		String[] arr1 = line.split(":");
		//���
		for(String str : arr1){
			System.out.println(str);
			//������һ�����ٴ�ʹ�� #���
			if(str.contains("#")){
				String[] arr2 = str.split("#");
				//�����
				for(String s : arr2){
					System.out.println(s);
				}
			}
		}
		
	}
	
	//��������ʾ������ʽ�Ĵ���
	public void regex(String regex){
		//����紫������������ʽ����� Pattern����
		Pattern p = Pattern.compile(regex);
		//����ƥ���ַ�����
		Matcher m = p.matcher(content);
		//��ʼ����
		int count=0;
		System.out.println("��ʼ����....");
		while(m.find()){
			System.out.printf(
					"�ҵ�[%s]��[%d��%d]λ�ô�.\n"
					,m.group(),m.start(),m.end());
			count++;
		}
		System.out.println("���ҵ� "+count+" ��.");
	}
	
	public static void main(String[] args) {
		StringDeal sd = new StringDeal();
//		sd.deal();
		String regex = "\\w+";
		sd.regex(regex);
		
		//�������Ҫƥ�䵥�Σ�
		String input = "12457212124";
		String r = "[1-9][0-9]{4,}";//������ʽ
		boolean b = input.matches(r);
		System.out.println(b);
	}
}
