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
		//������뷽ʽ
		resp.setContentType("text/html;charset=GBK");
		
		//���һ�������
		PrintWriter pw = resp.getWriter();
		
		//��ͻ��������Ϣ
		pw.write("<html>");
		pw.write("<title>�û�����ϵͳ</title>");
		pw.write("<body background='./images/1.jpg'>");

		
		pw.write("<form action='req3' method='post'>");
		pw.write("�û���:<input type='text' name='username' value='' /><br>");
		pw.write("�ǳ�:<input type='text' name='username' value='' /><br>");
		pw.write("����:<input type='password' name='password' value='' /><br>");
		pw.write("<input type='submit' name='button1' value='��¼' />");
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
