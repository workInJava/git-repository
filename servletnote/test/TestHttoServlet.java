package com.tz.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��httpЭ����н��պͷ�����Ϣ
 * @author 	jsd1307
 * @����ʱ�� Aug 22, 2013 3:50:50 PM
 * @version v1.0
 * @since   JDK6.0
 * @��Ŀ��   ServletDemo
 * @����     com.tz.test
 * @�ļ���   TestHttoServlet.java
 *
 */
public class TestHttoServlet extends HttpServlet {

	/*
	 * ����form����get�ύ������
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html;charset=GBK");
		PrintWriter pw = res.getWriter();
		
		
		pw.write("<font color='red'>��ӭ����HttpServlet������</font>");
		
		
	}
	
	/*
	 * ����form����post�����ύ������
	 * (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}
}
