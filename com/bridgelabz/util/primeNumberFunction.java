/**************************************************************************
* Compilation: javac -d bin com/bridgelabz/util/primeNumberFunction.java
* Execution:   java -cp bin com.bridgelabz.util/primeNumberFunction
*
* Purpose: Find Math Functions to find harmonic,sin,cosine angle
              and binary number.
*
* @author Diksha
* @version 1.0
* @since 3-9-2017
*
****************************************************************************/


 package com.bridgelabz.util;


public class primeNumberFunction 
{
	 public static void main (String args[]) 
           { 
	    
            int j = 0;

             for (int i = 0; i < 100; i++)
	       {
                isPrime(i); 
                System.out.println("Prime nums are:" + i);
               }
            }
    	  public static boolean isPrime (int j)
   	   {
             int i=0;  
             for (j = 2; j < i; j++)
              {
               if (i % j == 0) 
                 {
                  return false;
                 }
               if (i == j) 
                 {
                  return true;
                 }
              }
           }
}

