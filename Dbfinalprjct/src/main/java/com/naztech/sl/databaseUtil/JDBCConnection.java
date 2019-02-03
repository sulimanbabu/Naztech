package com.naztech.sl.databaseUtil;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {
//	private static final Logger logger=LoggerFactory.getLogger(DBConnection.class);

	private static Connection conn;
	private static JDBCConnection instance = null;

	private JDBCConnection() {
		try {

			conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			System.out.println("connection created.");

		} catch (Exception e) {
			System.out.println("error");

		}
	}

	public static JDBCConnection getInstance() {
		if (instance == null) {
			instance = new JDBCConnection();
			return instance;
		} else {
			return instance;
		}

	}

	public Connection getConnection() {
		return conn;

	}

	public static void closeAll(ResultSet rs, PreparedStatement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();

			} catch (SQLException e) {
				// log.error("The result set cannot be closed.", e);
				System.out.println("The result set cannot be closed.");
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// log.error("The statement cannot be closed.", e);
				System.out.println("The statement cannot be closed.");
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// log.error("The data source connection cannot be closed.", e);
				System.out.println("The data source connection cannot be closed.");
			}
		}
	}

	public static void main(String[] args) {
		// System.out.println("successfull");
		new JDBCConnection();
		// .............creat table.........

//		String sql = "INSERT INTO Employee_suliman (emp_id,Name, Country, City, Salary,Zipcode) VALUES (?, ?, ?, ?,?,?)";
//		 
//		PreparedStatement statement;
//		try {
//			statement = conn.prepareStatement(sql);
//			statement.setString(1, "2002");
//			statement.setString(2, "Kowshik");
//			statement.setString(3, "Bangladesh");
//			statement.setString(4, "Pirojpur");
//			statement.setInt(5, 200);
//			statement.setString(6, "1222");
//			int rowsInserted = statement.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
/*
		String sql = "DELETE FROM Employee_suliman WHERE Name=?";

		PreparedStatement statement;
		try {
			statement = conn.prepareStatement(sql);
			statement.setString(1, "Simpson");
			int rowsDeleted = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}