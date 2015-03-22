/**
 * 
 */
package com.corejava.day06.homework;

import java.util.Arrays;

/**
 * @author   周 麒
 * @创建时间 Jul 26, 2013 3:17:03 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day06.homework
 * @文件名   MyArrayList.java
 *
 */
public class MyArrayList implements MyList {

	//属性
	private static int[] datas;
	private int size;
	/* (non-Javadoc)
	 * @see com.corejava.day06.homework.MyList#add(int)
	 */
	static{
		datas = new int[BASIC_SIZE];
	}
	
	@Override
	public void add(int data) {
		// 
		if(datas.length == size){
			datas = Arrays.copyOf
				(datas,datas.length * 2);
		}
		datas[size] = data;
		size ++;
	}

	/* (non-Javadoc)
	 * @see com.corejava.day06.homework.MyList#get(int)
	 */
	@Override
	public int get(int index) {
		// 
		if(index > (size -1) && index < 0){
			System.err.println("下标越界！");
			return 0;
		}
		return datas[index];
	}

	/* (non-Javadoc)
	 * @see com.corejava.day06.homework.MyList#out()
	 */
	@Override
	public void output() {
		// 
		datas = Arrays.copyOf(datas, size);
		System.out.println(Arrays.toString(datas));
	}

	/* (non-Javadoc)
	 * @see com.corejava.day06.homework.MyList#remove(int)
	 */
	@Override
	public void remove(int data) {
		// 
		int count = 1;
		int sample = 0;
		int n = 1;
		int length = datas.length;
		int[] temp = new int[datas.length]; 
		for (int num : datas) {
			if(num == data){
				System.arraycopy
					(datas, sample, temp,
							sample - n +1, 
							count - sample - 1);
//				System.arraycopy
//					(datas, count, datas, count -n, length - count);
				sample = count;//保存上一个删除元素的下标+1
				n++;//保存删除的个数
				size --;
			}
			count ++;
		}
		if(sample < (datas.length -1)){
			System.arraycopy
			(datas, sample, temp,
					sample - n+1, length - sample);	
		}
		//System.out.println(Arrays.toString(temp));
		System.arraycopy(temp, 
				0, datas, 0, datas.length);		
	}

	
	/* (non-Javadoc)
	 * @see com.corejava.day06.homework.MyList#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public static int[] getDatas() {
		return datas;
	}

}
