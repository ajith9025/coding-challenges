package com.chainsys.bank;

public class BankBalance3 implements Bank{

	private int balance;

	 public BankBalance3(int balance) {
	     this.balance = balance;
	 }

	 @Override
	 public double getBalance() {
	     return balance;
	 }

}
