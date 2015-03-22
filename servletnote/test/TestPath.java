package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestPath extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
		
		pw.write("this is demo<br>");
		
		//获取Servlet
		ServletConfig config = this.getServletConfig();
		
		//得到初始化参数
		String email = config.getInitParameter("email");
		
		pw.write(email+"<br>");
		
		//获得初始化参数的属性名称
		Enumeration nums = config.getInitParameterNames();
		
		while(nums.hasMoreElements()){
			pw.write(nums.nextElement().toString()+"<br>");
		}
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		doGet(req, resp);
	}
	
}
