package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestRequst2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//处理编码方式
		resp.setContentType("text/html;charset=GBK");
		
		//获得一个输出流
		PrintWriter pw = resp.getWriter();
		
		//向客户端输出信息
		pw.write("<html>");
		pw.write("<title>用户管理系统</title>");
		pw.write("<body background='./images/1.jpg'>");

		
		pw.write("<form action='req3' method='post'>");
		pw.write("用户名:<input type='text' name='username' value='' /><br>");
		pw.write("昵称:<input type='text' name='username' value='' /><br>");
		pw.write("密码:<input type='password' name='password' value='' /><br>");
		pw.write("<input type='submit' name='button1' value='登录' />");
		pw.write("</form>");
		pw.write("</body>");
		pw.write("</html>");
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
