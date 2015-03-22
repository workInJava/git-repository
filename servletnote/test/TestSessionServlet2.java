package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestSessionServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取输出流
		PrintWriter pw = resp.getWriter();
		//拿到session
		HttpSession hs = req.getSession();
		//取得session值
		String value = (String)hs.getAttribute("mysession");
		//向页面输出
		pw.write("我的session是======="+value+"<br>");
		
		pw.write("我的sessionID是======="+hs.getId()+"<br>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
