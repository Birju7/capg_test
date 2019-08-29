package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
	//delete update find
//	public boolean deleteEmployee(Long id);
//	public Employee updateEmployee(Long id);
//	public Employee findEmployee(Long id);
//	

}
