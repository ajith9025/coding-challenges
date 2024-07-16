package com.chainsys.employee;

public class Employee extends Member {

	
	private String specialization;
	private String department;
	
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", department=" + department + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getPhoneNumber()=" + getPhoneNumber() + ", getAddress()=" + getAddress()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
	
}