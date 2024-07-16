package com.chainsys.skill;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankDetails {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		String accountNumber;
		String IFSC;
		int existingBalance = 5000;
		int withdrawal;
		ArrayList<String> al=new ArrayList<String>();
	
		System.out.println("Enter the Name:");
		name = sc.next();
		if (isValidName(name)) {
			System.out.println("Valid name.");
		} else {
			System.out.println("Invalid name.Please enter again name...");
			name = sc.next();
		}
		
		System.out.println("Enter the accountNumber:");
		accountNumber = sc.next();
		if (isValidNumber(accountNumber)) {
			System.out.println("Valid Account Number.");
		} else {
			System.out.println("Invalid Account Number.Please enter again  Account Number...");
			name = sc.next();
		}
		
		System.out.println("Enter the IFSC code:");
		IFSC = sc.next();
		if (isValidCode(IFSC)) {
			System.out.println("Valid IFSC Code.");
		} else {
			System.out.println("Invalid IFSC Code.Please enter again IFSC Code...");
			name = sc.next();
		}
		
		System.out.println("Enter the Amount to withdrawal");
		withdrawal = sc.nextInt();
		int balance = existingBalance - withdrawal;
		System.out.println("balance:" + balance);
		int deposit;
		System.out.println("Enter the deposit amount");
		deposit = sc.nextInt();
		int currentBalance = balance + deposit;
		System.out.println("currentBalance:" + currentBalance);
	}

	public static boolean isValidName(String name) {
		
		String regex = "^[A-Za-z]{5}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}

	public static boolean isValidNumber(String accountNumber) {

		String regex = "^[1-9]{1}[0-9]{11}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(accountNumber);
		return matcher.matches();
	}

	public static boolean isValidCode(String IFSC) {

		String regex = "^[A-Z]{4}0{1}[0-9]{6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(IFSC);
		return matcher.matches();
	}
}
