package com.chainsys.test;

import java.util.Arrays;


public class Company {
	private String companyName;
	private Employee[] employees;
	private int numEmployees;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	public Company(String companyName, Employee[] employees, int numEmployees) {
		super();
		this.companyName = companyName;
		this.employees = employees;
		this.numEmployees = numEmployees;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", employees=" + Arrays.toString(employees) + ", numEmployees="
				+ numEmployees + "]";
	}	
	
	public Company() {
		
	}
	

	public double getAverageSalary() {
		double totalSalary = 0;
		for (int i = 0; i < numEmployees; i++) {

			totalSalary += employees[i].getSalary();
		}
		return totalSalary / numEmployees;
	}

	public double getMaxSalary() {
		double maxSalary = Double.MIN_VALUE;
		for (int i = 0; i < numEmployees; i++) {
			if (employees[i].getSalary() > maxSalary) {
				maxSalary = employees[i].getSalary();
			}
		}
		return maxSalary;

	}

	public Employee[] getEmployeesByDesignation(String designation) {
		designation = designation.toLowerCase();
		int count = 0;
		for (int i = 0; i < numEmployees; i++) {
			if (employees[i].getDesignation().toLowerCase().equals(designation)) {
				count++;
			}
		}

		Employee[] result = new Employee[count];
		int index = 0;
		for (int i = 0; i < numEmployees; i++) {
			if (employees[i].getDesignation().toLowerCase().equals(designation)) {
				result[index++] = employees[i];
			}
		}
		return result;

	}	
}