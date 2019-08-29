package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeDao {
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
//	public boolean deleteEmployee(Long id);
//	public Employee updateEmployee(Long id);
//	public Employee findEmployee(Long id);

}
