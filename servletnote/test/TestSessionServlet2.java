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
		//��ȡ�����
		PrintWriter pw = resp.getWriter();
		//�õ�session
		HttpSession hs = req.getSession();
		//ȡ��sessionֵ
		String value = (String)hs.getAttribute("mysession");
		//��ҳ�����
		pw.write("�ҵ�session��======="+value+"<br>");
		
		pw.write("�ҵ�sessionID��======="+hs.getId()+"<br>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
