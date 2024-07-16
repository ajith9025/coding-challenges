package com.chainsys.bank;

public class BalanceDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new BankBalance1(1000);
		Bank bank2 = new BankBalance2(1500);
		Bank bank3 = new BankBalance3(2000);
		System.out.println("BankBalance1:"+ bank1.getBalance());
		System.out.println("BankBalance2:"+ bank2.getBalance());
		System.out.println("BankBalance3:"+ bank3.getBalance());

	}

}
