/**
 * 
 */
package com.corejava.day03;

import java.sql.Date;



/**
 * @author    王华民
 * @date      Jul 23, 2013 6:27:46 PM
 * @version   v1.0
 * @since     JDK6.0
 * @项目名    CoreJava
 * @包名      com.corejava.day03
 * @文件名    TestSalary.java
 */
public class TestSalary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*SalariedEmployee se = 
			new SalariedEmployee("小李",
			Date.valueOf("1989-11-23"),3000);
		Employee e1 = new
			SalariedEmployee("张三",
			Date.valueOf("1899-03-05"));
		//e1.setWage(2000);
		e1.getSalary(03);
		se.getSalary(03);
		System.out.println("//------------------------------------------------");
		HourlyEmployee he = 
			new HourlyEmployee(30,100);
		he.setName("王五");
		he.setBirthDate(Date.valueOf
			("1999-01-13"));
		System.out.println(he.getSalary(1));
		Employee e2 = new
			HourlyEmployee
			("小红",Date.valueOf("1992-07-11")
			,50,200);
		e2.getSalary(8);
		System.out.println("//------------------------------------------------");
		BasePlusSalesEmployee be = 
			new BasePlusSalesEmployee
			(50000,0.2,"小二",
			Date.valueOf("1892-05-30"));
		Employee e3 = new 
			BasePlusSalesEmployee
			("黄宏",Date.valueOf("1991-08-11"));
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
				c.setName("经理");
				double salary = c.getSalary(10);
				System.out.println(salary);
			}
		}*/
		
		Employee[] emps = new Employee[4];
		SalariedEmployee se = 
			new SalariedEmployee("张三",Date.valueOf("1992-07-15"),1500);
		SalesEmployee se2 =
			new SalesEmployee("李四",Date.valueOf("1989-04-12"),1000000,0.002);
		HourlyEmployee he = 
			new HourlyEmployee("张阿姨",Date.valueOf("1975-07-25"),15,180);
		BasePlusSalesEmployee bpse = 
			new BasePlusSalesEmployee("王五",Date.valueOf("1992-02-16"),500000,0.003,1200);
		emps[0] = se;
		emps[1] = se2;
		emps[2] = he;
		emps[3] = bpse;
		
		System.out.println("//---------------------");
		for(Employee e : emps){
			//调用 getSalary获取指定月份的工资
			double sal = e.getSalary(7);
			System.out.printf("员工[%s] 7月的工资是：%.2f\n",
					e.getName(),sal);
		}
	}
	
}
