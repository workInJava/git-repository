package com.corejava.day05.homework;

public class TestEmp {
	
	public static void main(String[] args) {

		Emp a = new Boss();
		Emp b = new HourEmp(15.0,150.0);
		Emp c = new FullTimeEmp(3000.0,0.1,1.8);
		
		Emp[] e = new Emp[3];
		e[0] = a;
		e[1] = b;
		e[2] = c;
		for(int i=0;i<e.length;i++){
			System.out.printf("%.1f\n",e[i].calcSalary());
		}
		
/*		Emp a = new Boss();
		Emp b = new HourEmp(15.0,150.0);
		Emp c = new FullTimeEmp(3000.0,0.1,1.8);
		
		System.out.println("�ϰ������룺"+a.calcSalary());
		System.out.println("Сʱ�������룺"+b.calcSalary());
		System.out.println("ȫְԱ�������룺"+c.calcSalary());
*/
	}

}
