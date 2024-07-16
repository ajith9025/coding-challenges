
package com.chainsys.skill;

import java.util.Scanner;

public class Swap {
	      
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter  the a number:");
		a=sc.nextInt();
		System.out.println("Enter the b number:");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping,a is "+a+" and b is "+b+"");
		
		
		
	}

}
