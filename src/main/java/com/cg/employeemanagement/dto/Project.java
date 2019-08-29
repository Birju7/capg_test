package com.cg.employeemanagement.dto;

public class Project {
	private Long projectId;
	private String projectName;
	private Double projectCost;
	private Employee[] empList;
	public Project(Long projectId, String projectName, Double projectCost, Employee[] empList) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
		this.empList = empList;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Double getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(Double projectCost) {
		this.projectCost = projectCost;
	}
	public Employee[] getEmpList() {
		return empList;
	}
	public void setEmpList(Employee[] empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectCost=" + projectCost
				+ "]";
	}
	

}
