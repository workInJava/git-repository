package com.corejava.day07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**************
 * 本类演示字符串处理
 * @author 	jsd1307
 * @创建时间 Jul 29, 2013 2:45:01 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day07
 * @文件名   StringDeal.java
 *
 */
public class StringDeal {

	//属性
	private String content = "There was a file that "+
		"store at \"d:/program file/dict\" directory,"+
		"the format of content as fellow:\n"+
		"1:Document:文档#档案#文案";
	
	//方法
	public void deal(){
		int length = content.length();
		System.out.println("字符串总长度："+length);
//		1.取出str字符串中的双引号之间的路径
		//a.找到第一个双引号所处的位置 
		int pos_1 = content.indexOf("\"");
		//b.找到第二个双引号所处的位置
		int pos_2 = content.indexOf("\"",pos_1+1);
		//c.截取子串
		String path = content.substring(pos_1+1, pos_2);
		//输出
		System.out.println("路径是："+path);
//		2.请把所有的空白字符替换成^，除了路径中的空白以外
		StringBuilder builder = new StringBuilder();
		builder.append(content.substring(0,pos_1+1)
							.replace(" ", "^"));
		builder.append(path);
		builder.append(content.substring(pos_2)
							.replace(" ", "^"));
		//输出
		System.out.println("替换后：\n"+builder.toString());
		
//		3.把最后一行的内容取出来。
		int pos = content.lastIndexOf("\n");
		String line = content.substring(pos+1);
		System.out.println("最后一行："+line);
		
//		4.请按:号拆分，最后一部份请使用#再次拆分。
		String[] arr1 = line.split(":");
		//输出
		for(String str : arr1){
			System.out.println(str);
			//把最后的一部分再次使用 #拆分
			if(str.contains("#")){
				String[] arr2 = str.split("#");
				//再输出
				for(String s : arr2){
					System.out.println(s);
				}
			}
		}
		
	}
	
	//本方法演示正则表达式的代码
	public void regex(String regex){
		//把外界传进来的正则表达式编译成 Pattern对象
		Pattern p = Pattern.compile(regex);
		//进行匹配字符序列
		Matcher m = p.matcher(content);
		//开始搜索
		int count=0;
		System.out.println("开始搜索....");
		while(m.find()){
			System.out.printf(
					"找到[%s]在[%d至%d]位置处.\n"
					,m.group(),m.start(),m.end());
			count++;
		}
		System.out.println("共找到 "+count+" 个.");
	}
	
	public static void main(String[] args) {
		StringDeal sd = new StringDeal();
//		sd.deal();
		String regex = "\\w+";
		sd.regex(regex);
		
		//如果仅仅要匹配单次：
		String input = "12457212124";
		String r = "[1-9][0-9]{4,}";//正则表达式
		boolean b = input.matches(r);
		System.out.println(b);
	}
}
