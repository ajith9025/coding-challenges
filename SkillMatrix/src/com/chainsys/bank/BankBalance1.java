package com.chainsys.bank;

public class BankBalance1 implements Bank {

	
 private int balance;

 public BankBalance1(int balance) {
     this.balance = balance;
 }

 @Override
 public double getBalance() {
     return balance;
 }
}



