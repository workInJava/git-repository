package com.corejava.day11;

import java.io.File;
import java.io.FilenameFilter;

//�������� java.io.File ��
public class FileDemo {

	public static void main(String[] args) {
		FileDemo fd = new FileDemo();
		String path = "D:\\";
		fd.dir(path,".png");
	}
	//�������������һ���ļ�����ֱ���������ļ���
	//�������������һ��Ŀ¼���������Ŀ¼�µ�������Ŀ¼���ļ�
	public void dir(String path,String filter){
		//1.��path������ Fileʵ��
		File file = new File(path);
		//2.���ж�
		if(!file.exists()){
			System.out.println("�ļ�������..");
			return ;
		}
		if(file.isFile()){
			System.out.println(file.getName());
//			System.out.println(file.getAbsolutePath());
			return ;
		}
		//��˵����Ŀ¼�������Ŀ¼
		dir(file,filter);
	}

	private void dir(File file,String filter) {
		System.out.printf("Ŀ¼ %s �µ��������ݣ�\n",file);
		// TODO Auto-generated method stub
		//���� list�����оٳ����е��ļ�����Ŀ¼
		/*String[] files = file.list();
		//����������
		for(String name : files){
			System.out.println("\t"+name);
		}*/
		//����һ��������
		FilenameFilter fnf = null;
		if(filter == null){
			fnf = new SuffixNameFilter();
		}else{
			fnf = new SuffixNameFilter(filter);
		}
		File[] files = file.listFiles(fnf);
		//��֤��Щ�ܾ����ʵ�Ŀ¼���׳���ָ���쳣
		if(files == null){
			return ;
		}
		//����
		for(File f : files){
			//�жϣ������Ŀ¼����ݹ�����Լ�
			if(f.isDirectory()){
				dir(f,filter);
			}else{
				System.out.println("\t"+f.getName());
			}
		}
	}
}
