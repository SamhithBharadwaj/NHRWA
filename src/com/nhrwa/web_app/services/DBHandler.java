package com.nhrwa.web_app.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandler {

//	private static final String url = "jdbc:mysql://localhost/t";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "";
	private static final String password = "";
//	private static final String Database_Driver="com.mysql.jdbc.Driver";
	private static final String Database_Driver="oracle.jdbc.driver.OracleDriver";

	public static ResultSet readFromDB(String tableName, String query) {
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(Database_Driver).newInstance();
			Connection con;
			try {
				con = DriverManager.getConnection(url, user, password);
				st = con.createStatement();
				String sql = ("SELECT * FROM " + tableName + " " + query + ";");
				if (st != null) {
					rs = st.executeQuery(sql);
				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return rs;
	}

	public static boolean createToDB(String tableName, String fields, String values) {
		Statement st = null;
		boolean rs = false;
		try {
			Class.forName(Database_Driver).newInstance();
			Connection con;
			try {
				con = DriverManager.getConnection(url, user, password);
				st = con.createStatement();
				String sql = ("INSERT into '" + tableName + "' (" + fields + ") VALUES (" + values + ");");
				if (st != null) {
					rs = st.execute(sql);
				}
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		return rs;
	}

}
