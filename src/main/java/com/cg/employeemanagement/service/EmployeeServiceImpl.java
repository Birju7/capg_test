package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.EmployeeDao;
import com.cg.employeemanagement.dao.EmployeeDaoImpl;
import com.cg.employeemanagement.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDaoImpl dao = new EmployeeDaoImpl();

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

//	public boolean deleteEmployee(Long id) {
//		// TODO Auto-generated method stub
//		return dao.deleteEmployee(id);
//	}
////
////	public Employee updateEmployee(Long id) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
//	public Employee findEmployee(Long id) {
//		// TODO Auto-generated method stub
//		return dao.findEmployee(id);
//	}
//	

}
