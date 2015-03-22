package com.Design.pattern.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool;
	
	private int poolSize = 100;
	private Connection conn = null;
	
	
	private String user ="sys";
	private String pwd = "test";
	private String url="http://127.0.0.1:1521/orcl";
	private String driverClassName = "oracle.jdbc.driver.OracleDriver";
	
	public ConnectionPool(){
		pool = new Vector<Connection>(poolSize);
		
		for(int i = 0;i<poolSize;i++){
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, user, pwd);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			pool.add(conn);
		}
	}
	
	//释放链接
	public synchronized void relese(){
		pool.add(conn);
	}
	
	//获取链接
	public synchronized Connection getConnection(){
		if(pool.size()>0){
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		}
			return null;
		
	}
}
