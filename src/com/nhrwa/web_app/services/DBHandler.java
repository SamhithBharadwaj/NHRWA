package com.nhrwa.web_app.services;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.nhrwa.web_app.annotations.Entity;
import com.nhrwa.web_app.entity.Audit;

public class DBHandler {

	// private static final String url = "jdbc:mysql://localhost:3306/mysql";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String user = "nhrwa";
	private static final String password = "nhrwa";
	private static final String AUDIT_TABLENAME = Audit.class.getAnnotation(Entity.class).tableName();
	private static final Field[] AUDIT_FIELDS = Audit.class.getDeclaredFields();
	// private static final String Database_Driver="com.mysql.jdbc.Driver";
	private static final String Database_Driver = "oracle.jdbc.driver.OracleDriver";

	public static ResultSet readFromDB(String tableName, String query, Connection con) {
		Statement st = null;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			String sql = "SELECT * FROM " + tableName + " " + query;
			if (st != null) {
				rs = st.executeQuery(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(Database_Driver).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(url, user, password);
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
				String sql = ("INSERT into " + tableName + " " + fields + " VALUES " + values);
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

	public static boolean updateToDB(String tableName, String updateQuery, String id) {
		Statement st = null;
		boolean rs = false;
		try {
			Class.forName(Database_Driver).newInstance();
			Connection con;
			try {
				con = DriverManager.getConnection(url, user, password);
				st = con.createStatement();
				String sql = ("UPDATE " + tableName + " SET " + updateQuery+ " WHERE ID='"+id+"");
				if (st != null) {
					rs = st.execute(sql);
				}
//				TODO: Add logic to insert into audit tables
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
