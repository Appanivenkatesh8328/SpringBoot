package com.nit.model;

public class Employee {
  private Integer id;
  private String EmpName;
  private String EmpAddress;
  private Double EmpSalary;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public String getEmpAddress() {
	return EmpAddress;
}
public void setEmpAddress(String empAddress) {
	EmpAddress = empAddress;
}
public Double getEmpSalary() {
	return EmpSalary;
}
public void setEmpSalary(Double empSalary) {
	EmpSalary = empSalary;
}
public Employee(Integer id, String empName, String empAddress, Double empSalary) {
	super();
	this.id = id;
	EmpName = empName;
	EmpAddress = empAddress;
	EmpSalary = empSalary;
}
public Employee(String empName, String empAddress, Double empSalary) {
	super();
	EmpName = empName;
	EmpAddress = empAddress;
	EmpSalary = empSalary;
}

public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [id=" + id + ", EmpName=" + EmpName + ", EmpAddress=" + EmpAddress + ", EmpSalary=" + EmpSalary
			+ "]";
}
  
}
