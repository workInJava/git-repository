package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestHttpRequest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=GBK");
		
		PrintWriter pw = resp.getWriter();
		
		//获取协议
		String protocol = req.getProtocol();
		pw.write(protocol+"<br>");
		
		//获取主机名
		String name = req.getServerName();
		pw.write(name+"<br>");
		
		//获取端口号
		int port = req.getServerPort();
		pw.write(port+"<br>");
		
		//获取web应用路径
		String path = req.getServletPath();
		pw.write(path+"<br>");
		
		//获取路径信息
		String pathInfo = req.getPathInfo();
		System.out.println(pathInfo);
		
		
		
		
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
