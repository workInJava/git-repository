package com.corejava.day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopy {

	public static void main(String[] args) {
		String src = "D:\\��װ�ļ�\\Oracle10g��2��(10.2.0.3-10.2.0.4)_10203_vista_w2k8_x86_production_db.ZIP";
		String dir = "E:\\test";
		FileCopy.copy(src, dir);
	}
	
	/**********
	 * �ļ�����, �������ݲ�֧��Ŀ¼�Ŀ���
	 * @param src ԭ�ļ�
	 * @param dest Ŀ��Ŀ¼
	 */
	public static void copy(String src,String dir){
		//�ж�
		File srcFile = new File(src);
		if(!srcFile.exists()){
			System.out.println(src+" ������...");
			return ;
		}
		if(srcFile.isDirectory()){
			System.out.println("�������ݲ�֧��Ŀ¼�Ŀ���");
			return;
		}
		//����Ŀ����ļ�����
		File target = new File(dir);
		if(!target.exists()){
			target.mkdirs();
		}
		File targetFile = new File(target,srcFile.getName());
		//��ʼ���ļ���
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
		BufferedInputStream fis = null;
		BufferedOutputStream fos = null;
		try {
			fis = new BufferedInputStream(
						new FileInputStream(srcFile));
			int size = fis.available();
			//�ٴ����ļ������
			fos = new BufferedOutputStream(
						new FileOutputStream(targetFile));
			//�����������������
			int len = -1; //������¼ʵ�ʶ������ֽ���
			//��С��1M
			byte[] buf = new byte[1024*1204];//������ݵ�����
			//����һ����������������Ľ���
			double total = 0.0;
			//ѭ�� ��
			while((len = fis.read(buf)) != -1){
				// д
				fos.write(buf, 0, len);//д��ʵ�ʶ������ֽ���
				total += len;
				//���һ�仰��
				System.out.printf
					("\r����ɡ�%.2f%%��",total/size * 100);
			}
			//
			System.out.println("\ncopy over");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ͷ���Դ
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
