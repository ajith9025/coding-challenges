package com.chainsys.employee;
public class MyClassTest {
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member=new Member("Ajith",23,902511978,"kk nager",20000);
		System.out.println("salary of member:"+ member.printSalary());
		Employee employee=new Employee("Vishnu",23,902511978,"kk nager",40000,"DataZap","Developer");
		System.out.println("salary of employee:"+employee.printSalary());
        Manager manager=new Manager("Mani",23,902511978,"kk nager",30000,"DataZen","Testing");
        System.out.println("salary of manager:"+manager.printSalary());
		
	}

}
