package com.tz.test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TestServletContext2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//»ñµÃServletContext
		
		PrintWriter pw = resp.getWriter();
		
		ServletContext context =this.getServletConfig().getServletContext();
		
		String value = (String)context.getAttribute("myContext");
		
		pw.write("aaaaaaaa");
		
		System.out.println(value);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	
	}
	
}
