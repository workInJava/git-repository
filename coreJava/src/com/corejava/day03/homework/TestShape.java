/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   �� ��
 * @����ʱ�� Jul 23, 2013 7:27:31 PM
 * @version  v1.0
 * @since    JDK6.0
 * @��Ŀ��   CoreJava
 * @����     com.corejava.day03.homework
 * @�ļ���   TestShape.java
 *
 */
public class TestShape {

	public static void main(String[] args) {
		Rect re = new Rect("����",15,18);
		Square sq = new Square("������",16);
		Circle ci = new Circle("Բ��",5);
		
		/*System.out.printf("��Ϊ��%.2f����Ϊ��%.2f�ľ��ε��ܳ��ǣ�%.2f,�����:%.2f\n",
				re.getLength(),re.getWidth(),re.CalGirth(),re.CalArea());
		System.out.printf("��Ϊ��%.2f�������ε��ܳ��ǣ�%.2f,�����:%.2f\n"
				,sq.getLength(),sq.CalGirth(),sq.CalArea());
		System.out.printf("�뾶Ϊ��%.2f��Բ���ܳ��ǣ�%.2f,�����:%.2f\n"
				,ci.getR(),ci.CalGirth(),ci.CalArea());*/
		
		Shape[] shape = new Shape[3];
		shape[0] = re;
		shape[1] = sq;
		shape[2] = ci;
		for(Shape s : shape){
//			if(s instanceof Rect){
//				((Rect)s).getArea();
//				((Rect)s).getGirth();
//			}
//			if(s if (  instanceof Circle) {
//				Circle new_name = (Circle)  ;
//				
//			})
			System.out.printf("[%s]����ǣ�%.2f, �ܳ�ʱ��%.2f\n"
						,s.getShape(),s.CalArea(), s.CalGirth());
		}
	}
}
