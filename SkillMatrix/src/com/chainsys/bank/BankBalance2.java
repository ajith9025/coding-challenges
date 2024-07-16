package com.chainsys.bank;

public class BankBalance2 implements Bank {

	private int balance;

	 public BankBalance2(int balance) {
	     this.balance = balance;
	 }

	 @Override
	 public double getBalance() {
	     return balance;
	 }
}
