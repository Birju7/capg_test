package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	Employee emp[] = new Employee[2];
	int c=0;
	
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		this.emp[c] = emp;
		c = c+1;
		return emp;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return this.emp;
	}

//	public boolean deleteEmployee(Long id) {
//		// TODO Auto-generated method stub
//		for (int i =0; i<emp.length;++i ) {
//			if((long)emp[i].getEmpId() == id) {
//				for (int j=i;j<c-1; ++j) {
//					emp[j] = emp[j+1];
//					return true;
//					
//				
//				
//				
//			}
//			 
//		}
//		
//	}
//		return false;}
//
//	public Employee updateEmployee(Long id) {
//		// TODO Auto-generated method stub
////		this.emp = emp[0];
//		return emp;
//	}

//	public Employee findEmployee(Long id) {
//		// TODO Auto-generated method stub
//		for (int i =0; i<emp.length;i++) {
//			if((long)emp[i].getEmpId() == id) {
//				return emp[i];
//				
//			}
//			
//		}
//		return emp[0];
//		
//	}

	}
