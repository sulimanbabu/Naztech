package com.naztech.sl.databaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.naztech.sl.model.Employee;

public class OperateEmployeeData {
	static JDBCConnection ins=JDBCConnection.getInstance();
	static Connection con = ins.getConnection();
	
	public static boolean insert(Employee employee) throws SQLException {
		 String sql = "INSERT INTO Employee_suliman (emp_id,Name, Country, City, Salary,Zipcode) VALUES (?, ?, ?, ?,?,?)";
		 PreparedStatement statement;
		statement = con.prepareStatement(sql);
		statement.setInt(1, employee.getEmpId());
		statement.setString(2,  employee.getName());
		statement.setString(3, employee.getCountry());
		statement.setString(4, employee.getCity());
		statement.setDouble(5, employee.getSalary());
		statement.setInt(6, employee.getZipcode());
		statement.execute();
		return true;
	}
	public static boolean deleteEmployee(int id) throws SQLException {
		String sql = "DELETE FROM Employee_suliman WHERE emp_id=?";
		 
		PreparedStatement statement;
		statement= con.prepareStatement(sql);
		statement.setInt(1,id);
		statement.executeUpdate();
		return true;
		
	}
   public static boolean updateEmployeeSalary(int id1, int id2) throws SQLException {
	   String sql = "UPDATE Employee_suliman SET Salary = ?  WHERE emp_id = ? ";
	           PreparedStatement statement;
	           statement = con.prepareStatement(sql);
			   statement.setFloat(1, id1);
	           statement.setInt(2,id2);
			    statement.execute();
			    
	   return true;
   }
   public static Employee searcEmployee(int id) throws SQLException {
	   
	   String sql = "SELECT * FROM  Employee_suliman WHERE emp_id = ?";
	   PreparedStatement statement;
       statement = con.prepareStatement(sql);
       statement.setFloat(1, id);
       ResultSet rs = statement.executeQuery();
       rs.next();
       Employee employee= new Employee( rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6));
       return employee;
	   
   }
   public static double getMaxSalary() throws SQLException {
	   String sql="SELECT max( Salary ) as MaxSalary FROM Employee_suliman";
	   PreparedStatement statement;
	   statement = con.prepareStatement(sql);
	   ResultSet rs = statement.executeQuery();
	   rs.next();
	   Double salary = rs.getDouble(1);
	   
	   return salary;
	   
   }
   
   public static double getMinSalary() throws SQLException {
	   String sql="SELECT min( Salary ) as MinSalary FROM Employee_suliman;";
	   PreparedStatement statement;
	   statement = con.prepareStatement(sql);
	   ResultSet rs = statement.executeQuery();
	   rs.next();
	   Double salary = rs.getDouble(1);
	   
	   return salary;
	   
   }
	
   

}
