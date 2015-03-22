package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestCookieServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//���PrintWriter
		PrintWriter pw = resp.getWriter();
		
		//���cookie����
		Cookie[] cookies = req.getCookies();
		
		//��ȡ�õ�cookie������б��� �ҵ����Ǵ�ŵ�cookie
		if(null != cookies){
			for(int i=0;i<cookies.length;i++){
				//�ж��Ƿ������Ǵ�ŵ�cookie
				if("mycookie".equals(cookies[i].getName())){
					
					pw.write("my cookie is "+cookies[i].getValue());
				}
				
			}
			
			
		}
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
