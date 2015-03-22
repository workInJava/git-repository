package com.corejava.day06.homework;

public class MyArrayList2 implements MyList {

	//属性
	private int[] datas; //底层存储数据数组
	private int size; //存放有效元素个数
	private int capacity = 16; // 默认数组的初始容量
	
	//构造方法
	public MyArrayList2(){
		//初始化 datas
		this.datas = new int[capacity];
	}
	public MyArrayList2(int capacity){
		this.capacity = capacity;
		//初始化 datas
		this.datas = new int[capacity];
	}

	//业务方法
	@Override
	public void add(int data) {
		// TODO Auto-generated method stub
		//做判断，决定 是否要扩充容量
		if(size >= datas.length){
			//要扩容
			expand();
		}
		datas[size++] = data;
	}
	//自动扩充数组的容量
	private void expand() {
		System.out.println("~开始扩容...");
		int[] _datas = new int[datas.length * 2];
		//把原数组中的数据存放到新数组中
		System.arraycopy(datas, 0, _datas, 0, datas.length);
		//把新数组赋给 datas属性
		datas = _datas;
		//改变 capacity的大小
		this.capacity = datas.length;
	}
	
	@Override
	public int get(int index) {
		//做参数的有效性判断
		if(index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException("下标越界:"+index);
		}
		return datas[index];
	}

	@Override
	public void output() {
		System.out.println("当前对象中的数据有：");
		for(int i=0;i<size;i++){
			System.out.printf("%d",datas[i]);
			if(i != size - 1){
				System.out.print(",");
			}
		}
		System.out.println();
	}

	@Override
	public void remove(int data) {
		//找到元素所在的位置
		int idx = -1;
		for(int i=0;i<size;i++){
			if(data == datas[i]){
				idx = i;
				break;
			}
		}
		//判断是否找到
		if(idx != -1){
			for(int i=idx;i<size-1;i++){
				datas[i] = datas[i+1];
			}
			this.size --; //一定要减
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

}
