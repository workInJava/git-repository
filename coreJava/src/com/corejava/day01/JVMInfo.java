package com.corejava.day01;

import java.util.Map;
import java.util.Set;
/**************
 * <b>本类是演示获取JVM环境变量的案例</b>
 * 
 * @author 	jsd1307
 * @创建时间 Jul 19, 2013 4:18:48 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day01
 * @文件名   JVMInfo.java
 *
 */
public class JVMInfo {

	public static void main(String[] args) {
		//获取JVM的环境
		Map<String, String> map = System.getenv();
		//迭代出来
		Set<String> keys = map.keySet();
		for(String key : keys) {
			String value = map.get(key);
			//输出
			System.out.printf("%s => %s\n", key,value);
		}
	}
}
