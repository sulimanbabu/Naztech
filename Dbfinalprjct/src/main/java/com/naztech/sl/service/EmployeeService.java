package com.naztech.sl.service;

import java.sql.SQLException;

import com.naztech.sl.Dao.EmployeeDao;
import com.naztech.sl.databaseUtil.OperateEmployeeData;
import com.naztech.sl.model.Employee;

public class EmployeeService implements  EmployeeDao{

	public boolean addEmployee(Employee employee) {
		try {
			return OperateEmployeeData.insert(employee);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteEmployee(int id) {
		try {
			return OperateEmployeeData.deleteEmployee( id);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean updateEmployeeSalary(int id1, int id2) {
		try {
			return OperateEmployeeData.updateEmployeeSalary(id1, id2);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
	}

	public double getMaximumSalary() {
		
		 try {
			return OperateEmployeeData.getMaxSalary();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return 0;
		}
	}

	public double getMinimumSalary() {
		try {
			return OperateEmployeeData.getMinSalary();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public Employee searcEmployee(int id) {
		try {
			return OperateEmployeeData.searcEmployee(id);
		} catch (SQLException e) {
			
	    e.printStackTrace();
		return null;
	}

}
}
