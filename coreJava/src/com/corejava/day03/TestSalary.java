/**
 * 
 */
package com.corejava.day03;

import java.sql.Date;



/**
 * @author    ������
 * @date      Jul 23, 2013 6:27:46 PM
 * @version   v1.0
 * @since     JDK6.0
 * @��Ŀ��    CoreJava
 * @����      com.corejava.day03
 * @�ļ���    TestSalary.java
 */
public class TestSalary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*SalariedEmployee se = 
			new SalariedEmployee("С��",
			Date.valueOf("1989-11-23"),3000);
		Employee e1 = new
			SalariedEmployee("����",
			Date.valueOf("1899-03-05"));
		//e1.setWage(2000);
		e1.getSalary(03);
		se.getSalary(03);
		System.out.println("//------------------------------------------------");
		HourlyEmployee he = 
			new HourlyEmployee(30,100);
		he.setName("����");
		he.setBirthDate(Date.valueOf
			("1999-01-13"));
		System.out.println(he.getSalary(1));
		Employee e2 = new
			HourlyEmployee
			("С��",Date.valueOf("1992-07-11")
			,50,200);
		e2.getSalary(8);
		System.out.println("//------------------------------------------------");
		BasePlusSalesEmployee be = 
			new BasePlusSalesEmployee
			(50000,0.2,"С��",
			Date.valueOf("1892-05-30"));
		Employee e3 = new 
			BasePlusSalesEmployee
			("�ƺ�",Date.valueOf("1991-08-11"));
		be.setSalary(3000);
		be.getSalary(6);
		e3.getSalary(5);
		System.out.println("//------------------------------------------------");
		Employee[] ee = new Employee[6]; 
		ee[0] = e1;
		ee[1] = se;
		ee[2] = e2;
		ee[3] = he;
		ee[4] = e3;
		ee[5] = be;
		for(Employee a : ee){
			a.getSalary(5);
			if(a instanceof
				BasePlusSalesEmployee ){
				BasePlusSalesEmployee c
					=(BasePlusSalesEmployee) a;
				c.setName("����");
				double salary = c.getSalary(10);
				System.out.println(salary);
			}
		}*/
		
		Employee[] emps = new Employee[4];
		SalariedEmployee se = 
			new SalariedEmployee("����",Date.valueOf("1992-07-15"),1500);
		SalesEmployee se2 =
			new SalesEmployee("����",Date.valueOf("1989-04-12"),1000000,0.002);
		HourlyEmployee he = 
			new HourlyEmployee("�Ű���",Date.valueOf("1975-07-25"),15,180);
		BasePlusSalesEmployee bpse = 
			new BasePlusSalesEmployee("����",Date.valueOf("1992-02-16"),500000,0.003,1200);
		emps[0] = se;
		emps[1] = se2;
		emps[2] = he;
		emps[3] = bpse;
		
		System.out.println("//---------------------");
		for(Employee e : emps){
			//���� getSalary��ȡָ���·ݵĹ���
			double sal = e.getSalary(7);
			System.out.printf("Ա��[%s] 7�µĹ����ǣ�%.2f\n",
					e.getName(),sal);
		}
	}
	
}
