package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 以http协议进行接收和返回信息
 * @author 	jsd1307
 * @创建时间 Aug 22, 2013 3:50:50 PM
 * @version v1.0
 * @since   JDK6.0
 * @项目名   ServletDemo
 * @包名     com.tz.test
 * @文件名   TestHttoServlet.java
 *
 */
public class TestHttoServlet extends HttpServlet {

	/*
	 * 接收form表单里get提交的请求
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html;charset=GBK");
		PrintWriter pw = res.getWriter();
		
		
		pw.write("<font color='red'>欢迎来到HttpServlet的世界</font>");
		
		
	}
	
	/*
	 * 接收form表单里post方法提交的请求
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}
}
