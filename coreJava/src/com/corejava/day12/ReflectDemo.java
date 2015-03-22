package com.corejava.day12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

//���� ������
public class ReflectDemo {

	public static void introspect(String className){
		//1.���� forName����ȡ ������ Classʵ��
		try {
			Class<?> c = Class.forName(className);
			introspect(c);
		} catch (ClassNotFoundException e) {
			System.out.println("����������:"+className);
//			e.printStackTrace();
		}
	}
	
	private static void introspect(Class<?> c) {
		//���������÷��� ��API���鿴�ֽ����е�һЩ��Ϣ
		//1.��ȡ�������̳еĸ���
		Class<?> superC = c.getSuperclass();
		if(superC != null){
			System.out.println("�̳еĸ����ǣ�");
			System.out.println("\t"+superC.getName());
		}
		//2.��ȡ������ʵ�ֵĽӿ�
		Class<?>[] interfaces = c.getInterfaces();
		//����
		System.out.println(c.getName()+" ʵ�ֵĽӿڣ�");
		for(Class<?> ci : interfaces){
			System.out.println("\t"+ci.getName());
		}
		
		//3.��ȡ��������η�
		int ci = c.getModifiers();
		System.out.println("��������η��ǣ�"
				+Modifier.toString(ci));
		//4.��ȡ�����µ���������
		Field[] fields = c.getDeclaredFields();
		//���
		System.out.println("���๲�ƣ�"
					+fields.length+"������");
		for(Field f : fields){
			//��ȡ�����Ե����η�����������
			int fi = f.getModifiers();
			Class<?> fc = f.getType();
			System.out.println("\t"+Modifier.toString(fi)
					+" "+fc.getSimpleName()+" "+f.getName());
		}
		
		//5.��ȡ�����µ����з���
		Method[] methods = c.getDeclaredMethods();
		//���
		System.out.println("���๲�ƣ�"
					+methods.length+" ������");
		StringBuilder builder = new StringBuilder();
		for(Method m : methods){
			//a.��ȡ���������η�
			int mi = m.getModifiers();
			//b.��ȡ��������
			Class<?> mc = m.getReturnType();
			//c.��ȡ������
			String mName = m.getName();
			//d.��ȡ�����б�
			Class<?>[] pts = m.getParameterTypes();
			//e.�쳣����
			Class<?>[] exceptions = m.getExceptionTypes();
			//��ӡ���
			builder.append("\t")
					.append(Modifier.toString(mi))
					.append(" ").append(mc.getSimpleName())
					.append(" ").append(mName)
					.append("(");
			for(int i=0;i<pts.length;i++){
				//����
				builder.append(pts[i].getSimpleName())
						.append(" ").append("arg")
						.append(i);
				//�ж��Ƿ�ƴ����
				if(i < pts.length - 1){
					builder.append(",");
				}
			}
			//ƴ�� )
			builder.append(")");
			//�����쳣
			if(exceptions.length > 0){
				builder.append("throws ");
				//��ƴ���쳣����
				for(int i=0;i<exceptions.length;i++){
					builder.append(exceptions[i].getSimpleName());
					if(i < exceptions.length - 1){
						builder.append(",");
					}
				}
			}
			//�ٽ���һ�Դ�����
			builder.append("{ ... }");
			//���
			System.out.println(builder.toString());
			//��� builder
			builder.delete(0, builder.capacity());
		}
	}
	
	public static <S,T> Set<String> compare(S source,T target){
		Set<String> set = new HashSet<>(); 
		Class<?> sourceClass = source.getClass();
		Field[] fields = sourceClass.getDeclaredFields();
		for(Field f:fields){
			
			
			
			
		}
		
		return set;
	}
}
