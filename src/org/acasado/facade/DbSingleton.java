package org.acasado.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

	private static volatile DbSingleton instance = null;
	
	private Connection conn = null;
	
	private DbSingleton () {
		try {
			//DriverManager.registerDriver(new org.mysql.jdbc.Driver());
			Class.forName("com.mysql.jdbc.Driver").newInstance();

		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized(DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		if(conn == null || conn.isClosed()) {
			synchronized (DbSingleton.class) {
				if(conn == null || conn.isClosed()) {
					try {
						//String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						//conn = DriverManager.getConnection(dbUrl);
						conn =
								DriverManager.getConnection("jdbc:mysql://localhost/test?" +
										"user=minty&password=greatsqldb");

					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}
}
