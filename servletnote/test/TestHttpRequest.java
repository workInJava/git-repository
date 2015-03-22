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
		
		//��ȡЭ��
		String protocol = req.getProtocol();
		pw.write(protocol+"<br>");
		
		//��ȡ������
		String name = req.getServerName();
		pw.write(name+"<br>");
		
		//��ȡ�˿ں�
		int port = req.getServerPort();
		pw.write(port+"<br>");
		
		//��ȡwebӦ��·��
		String path = req.getServletPath();
		pw.write(path+"<br>");
		
		//��ȡ·����Ϣ
		String pathInfo = req.getPathInfo();
		System.out.println(pathInfo);
		
		
		
		
		
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
