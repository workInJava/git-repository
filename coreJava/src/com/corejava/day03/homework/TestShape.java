/**
 * 
 */
package com.corejava.day03.homework;

/**
 * @author   周 麒
 * @创建时间 Jul 23, 2013 7:27:31 PM
 * @version  v1.0
 * @since    JDK6.0
 * @项目名   CoreJava
 * @包名     com.corejava.day03.homework
 * @文件名   TestShape.java
 *
 */
public class TestShape {

	public static void main(String[] args) {
		Rect re = new Rect("矩形",15,18);
		Square sq = new Square("正方形",16);
		Circle ci = new Circle("圆形",5);
		
		/*System.out.printf("长为：%.2f，宽为：%.2f的矩形的周长是：%.2f,面积是:%.2f\n",
				re.getLength(),re.getWidth(),re.CalGirth(),re.CalArea());
		System.out.printf("长为：%.2f的正方形的周长是：%.2f,面积是:%.2f\n"
				,sq.getLength(),sq.CalGirth(),sq.CalArea());
		System.out.printf("半径为：%.2f的圆的周长是：%.2f,面积是:%.2f\n"
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
			System.out.printf("[%s]面积是：%.2f, 周长时：%.2f\n"
						,s.getShape(),s.CalArea(), s.CalGirth());
		}
	}
}
