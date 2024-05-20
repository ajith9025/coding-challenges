package com.chainsys.day8;

import java.util.Scanner;

public class StringReverse 
{

	public static void main(String[] args)
	{
		 
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=new StringBuilder(a).reverse().toString();
        if(a.equals(b))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
	}

}
