package com.chainsys.skilltest;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] employees = new Employee[4];

		for (int i = 0; i < 4; i++) {

			int employeeId = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String branch = sc.nextLine();
			double rating = sc.nextDouble();
			boolean companyTransport = sc.nextBoolean();
			employees[i] = new Employee(employeeId, name, branch, rating, companyTransport);
		}

		sc.nextLine();
		String branch = sc.nextLine();

		int count = findCountOfEmployeesUsingCompTransport(employees, branch);
		if (count > 0) {
			System.out.println(count);
		} else {
			System.out.println("No such Employees");
		}

		Employee secondHighestRatingEmployee = findEmployeeWithSecondHighestRating(employees);
		if (secondHighestRatingEmployee != null) {
			System.out.println(secondHighestRatingEmployee.getEmployeeId());
			System.out.println(secondHighestRatingEmployee.getName());
		} else {
			System.out.println("All Employees using company transport");
		}

		sc.close();
	}

	public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
		int count = 0;
		for (Employee emp : employees) {
			if (emp.getBranch().equals(branch) && emp.isCompanyTransport()) {
				count++;
			}
		}
		return count;
	}

	public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
		Employee highest = null;
		Employee secondHighest = null;

		for (Employee emp : employees) {
			if (!emp.isCompanyTransport()) {
				if (highest == null || emp.getRating() > highest.getRating()) {
					secondHighest = highest;
					highest = emp;
				} else if (secondHighest == null || emp.getRating() > secondHighest.getRating()) {
					secondHighest = emp;
				}
			}
		}
		return secondHighest;
	}
}
