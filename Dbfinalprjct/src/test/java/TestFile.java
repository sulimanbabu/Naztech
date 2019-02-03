import static org.junit.Assert.*;

import org.junit.Test;

import com.naztech.sl.model.Employee;
import com.naztech.sl.service.EmployeeService;

public class TestFile {

	@Test
	public void testAddEmployee() {
		EmployeeService ob=new EmployeeService();
		
		//assertEquals(true,ob.addEmployee(new Employee(9,"Mahbub","Bangladeh","Khulna",6000,1316)));
		

	}
	
	@Test
	public void testDeleteEmployee() {
		EmployeeService ob=new EmployeeService();
		//assertEquals(true,ob.deleteEmployee(9));
	}
	
	@Test
	public void testUpdateEmployeeSalary() {
		EmployeeService ob=new EmployeeService();
		//assertEquals(true,ob.updateEmployeeSalary(16000, 9));
	}
	
	@Test
	public void testSearcEmployee() {
		EmployeeService ob=new EmployeeService();
		//assertEquals(new Employee(9,"Mahbub","Bangladeh","Khulna",6000,1316),ob.searcEmployee(9));
	}
	
	@Test
	public void tesGetMaximumSalary() {
		EmployeeService ob=new EmployeeService();
		//assertEquals(82000,ob.getMaximumSalary(),0);
	}
	
	@Test
	public void tesGetMinSalary() {
		EmployeeService ob=new EmployeeService();
	
	assertEquals(16000,ob.getMinimumSalary(),0);
	}
	
	
	

}

