package com.chainsys.day8;
import java.util.*;
import java.text.*;

public class Currency {	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double payment = sc.nextDouble();
	        sc.close();
	        Locale INDIA = new Locale("en", "IN");
	        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
	        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
	        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
	        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
	        
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	}



