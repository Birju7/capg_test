package com.cg.employeemanagement.ui;

import java.util.Scanner;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.service.EmployeeService;
import com.cg.employeemanagement.service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		Employee emp = new Employee();
		Employee empArray[] = service.showEmployee();
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<empArray.length;++i)
		{
		System.out.println("Enter Employee id");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Name");
		String name = sc.next();
		System.out.println("Enter Employee Salary");
		double sal = sc.nextDouble();
		
		

		System.out.println("Enter department id");
		int did = sc.nextInt();
		

		System.out.println("Enter Employee Department");
		String dname = sc.next();
		
		Department dep  = new Department();
		dep.setDeptId(did);
		dep.setDeptName(dname);
		
		
		emp.setEmpId(id);
		emp.setEmpName(name);
		emp.setEmpSalary(sal);
		emp.setDepartment(dep);
		service.addEmployee(emp);
		
		
//		for (int i=0; i<empArray.length;++i)
//		{
//			if (i==0)
				System.out.println(empArray[i]);
		}
//		System.out.println("Enter the id tha=t needs to be deleted");
//		int id = sc.nextInt();
//		if(service.deleteEmployee((long)id))
//		System.out.println("Delete succesfull");
//		
//		System.out.println("Enter the id to find the details");
//		System.out.println(empArray[]);
//		id = sc.nextInt();
		
//		System.out.println(service.findEmployee((long)id));
//		System.out.println("Enter the id to update the details ");
//		System.out.println("Enter the deptid to be updated");
//		System.out.println("Enter the deptname to be updated");
//		System.out.println("Enter the empname to be updated");
//		System.out.println("Enter the empsalary to be updated");
//		System.out.println("Enter the empdepartment to be updated");

		
		

	}

}
