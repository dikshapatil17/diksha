/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Demo.java
* Execution:   java -cp bin com.bridgelabz.util/Demo
*
* Purpose: simple program to create object
*
* @author Diksha
* @version 1.0
* @since 24-9-2017
*
********************************************************************/

/* Package Naming Style*/
 package com.bridgelabz.util;
 import java.util.Scanner; 
 public class Demo
 {
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}

	public int multiply(int a,int b)
	{
		int c= a*b;
		return c;
	}

	public int substract(int a,int b)
	{	
		int c=0;
		if(a>b)
		{
			c=a-b;
		}
		return c;
	}

	public static void main(String [] args)
	{	
		 int x;int y;
		Demo demo=new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
			x=sc.nextInt();
		System.out.println("Enter Second Number");
			y=sc.nextInt();
		System.out.println("Addition of two Number:"+demo.add(x,y));
			System.out.println("Multiplication of two Number:"+demo.multiply(x,y));
				System.out.println("Substraction of two Number:"+demo.substract(x,y));
	}

}
