package com.corejava.day06.homework;

public class MyArrayList2 implements MyList {

	//����
	private int[] datas; //�ײ�洢��������
	private int size; //�����ЧԪ�ظ���
	private int capacity = 16; // Ĭ������ĳ�ʼ����
	
	//���췽��
	public MyArrayList2(){
		//��ʼ�� datas
		this.datas = new int[capacity];
	}
	public MyArrayList2(int capacity){
		this.capacity = capacity;
		//��ʼ�� datas
		this.datas = new int[capacity];
	}

	//ҵ�񷽷�
	@Override
	public void add(int data) {
		// TODO Auto-generated method stub
		//���жϣ����� �Ƿ�Ҫ��������
		if(size >= datas.length){
			//Ҫ����
			expand();
		}
		datas[size++] = data;
	}
	//�Զ��������������
	private void expand() {
		System.out.println("~��ʼ����...");
		int[] _datas = new int[datas.length * 2];
		//��ԭ�����е����ݴ�ŵ���������
		System.arraycopy(datas, 0, _datas, 0, datas.length);
		//�������鸳�� datas����
		datas = _datas;
		//�ı� capacity�Ĵ�С
		this.capacity = datas.length;
	}
	
	@Override
	public int get(int index) {
		//����������Ч���ж�
		if(index < 0 || index >= size){
			throw new ArrayIndexOutOfBoundsException("�±�Խ��:"+index);
		}
		return datas[index];
	}

	@Override
	public void output() {
		System.out.println("��ǰ�����е������У�");
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
		//�ҵ�Ԫ�����ڵ�λ��
		int idx = -1;
		for(int i=0;i<size;i++){
			if(data == datas[i]){
				idx = i;
				break;
			}
		}
		//�ж��Ƿ��ҵ�
		if(idx != -1){
			for(int i=idx;i<size-1;i++){
				datas[i] = datas[i+1];
			}
			this.size --; //һ��Ҫ��
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

}
