package com.corejava.day01;

import java.util.Map;
import java.util.Set;
/**************
 * <b>��������ʾ��ȡJVM���������İ���</b>
 * 
 * @author 	jsd1307
 * @����ʱ�� Jul 19, 2013 4:18:48 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day01
 * @�ļ���   JVMInfo.java
 *
 */
public class JVMInfo {

	public static void main(String[] args) {
		//��ȡJVM�Ļ���
		Map<String, String> map = System.getenv();
		//��������
		Set<String> keys = map.keySet();
		for(String key : keys) {
			String value = map.get(key);
			//���
			System.out.printf("%s => %s\n", key,value);
		}
	}
}
