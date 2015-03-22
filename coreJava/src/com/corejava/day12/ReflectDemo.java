package com.corejava.day12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

//反射 的例子
public class ReflectDemo {

	public static void introspect(String className){
		//1.利用 forName来获取 类名的 Class实例
		try {
			Class<?> c = Class.forName(className);
			introspect(c);
		} catch (ClassNotFoundException e) {
			System.out.println("类名不存在:"+className);
//			e.printStackTrace();
		}
	}
	
	private static void introspect(Class<?> c) {
		//让我们利用反射 的API来查看字节码中的一些信息
		//1.获取此类所继承的父类
		Class<?> superC = c.getSuperclass();
		if(superC != null){
			System.out.println("继承的父类是：");
			System.out.println("\t"+superC.getName());
		}
		//2.获取此类所实现的接口
		Class<?>[] interfaces = c.getInterfaces();
		//迭代
		System.out.println(c.getName()+" 实现的接口：");
		for(Class<?> ci : interfaces){
			System.out.println("\t"+ci.getName());
		}
		
		//3.获取此类的修饰符
		int ci = c.getModifiers();
		System.out.println("此类的修饰符是："
				+Modifier.toString(ci));
		//4.获取此类下的所有属性
		Field[] fields = c.getDeclaredFields();
		//输出
		System.out.println("本类共计："
					+fields.length+"个属性");
		for(Field f : fields){
			//获取此属性的修饰符及参数类型
			int fi = f.getModifiers();
			Class<?> fc = f.getType();
			System.out.println("\t"+Modifier.toString(fi)
					+" "+fc.getSimpleName()+" "+f.getName());
		}
		
		//5.获取此类下的所有方法
		Method[] methods = c.getDeclaredMethods();
		//输出
		System.out.println("本类共计："
					+methods.length+" 个方法");
		StringBuilder builder = new StringBuilder();
		for(Method m : methods){
			//a.获取方法的修饰符
			int mi = m.getModifiers();
			//b.获取返回类型
			Class<?> mc = m.getReturnType();
			//c.获取方法名
			String mName = m.getName();
			//d.获取参数列表
			Class<?>[] pts = m.getParameterTypes();
			//e.异常部份
			Class<?>[] exceptions = m.getExceptionTypes();
			//打印输出
			builder.append("\t")
					.append(Modifier.toString(mi))
					.append(" ").append(mc.getSimpleName())
					.append(" ").append(mName)
					.append("(");
			for(int i=0;i<pts.length;i++){
				//参数
				builder.append(pts[i].getSimpleName())
						.append(" ").append("arg")
						.append(i);
				//判断是否拼逗号
				if(i < pts.length - 1){
					builder.append(",");
				}
			}
			//拼上 )
			builder.append(")");
			//还有异常
			if(exceptions.length > 0){
				builder.append("throws ");
				//再拼上异常类型
				for(int i=0;i<exceptions.length;i++){
					builder.append(exceptions[i].getSimpleName());
					if(i < exceptions.length - 1){
						builder.append(",");
					}
				}
			}
			//再接上一对大括号
			builder.append("{ ... }");
			//输出
			System.out.println(builder.toString());
			//清空 builder
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
