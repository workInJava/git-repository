package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestServletDemo implements Servlet {

	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("我走了");

	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * (non-Javadoc)
	 * @see javax.servlet.Servlet#init(javax.servlet.ServletConfig)
	 */
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("我来了");

	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html;charset=GBK");
		PrintWriter pw = res.getWriter();
System.out.println("aaaaaa");
		//res.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		pw.write("<font color='red'>欢迎来到servlet的世界</font>");
		

	}

}
