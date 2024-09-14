package com.nit;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nit.DAO.EmployeeDAO;
import com.nit.model.Employee;

@SpringBootTest
class SpringBootEmployeeSep13ApplicationTests {

	@Autowired
	private EmployeeDAO dao;
	@Test
	void testSaveEmployee() {
		Employee emp=new Employee(108, "venkatesh", "Hyderabad", 50000d);
		dao.saveEmployee(emp);
	}
	@Test
	void testUpdateEmployee() {
		Employee emp=dao.getEmployee(106);
		emp.setEmpName("srihan");
		dao.updateEmployee(emp);
		Employee emp1 = dao.getEmployee(106);
		Assertions.assertEquals("srihan", emp1.getEmpName());
	}
	@Test
	void testDeleteEmployee() {
		dao.deleteEmployee(105);
		Employee employee = dao.getEmployee(105);
	Assertions.assertNull(employee);
		
	}
	@Test
	void testGetOneEmployee() {
		Employee employee = dao.getEmployee(101);
		Assertions.assertTrue(employee!=null);
}
	@Test
	void testGetAllEmployee() {
		List<Employee> allEmployee = dao.getAllEmployee();
		Assertions.assertTrue(!allEmployee.isEmpty());
	}
	}

