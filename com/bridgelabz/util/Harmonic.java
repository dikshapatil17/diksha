/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Harmonic.java
* Execution:   java -cp bin com.bridgelabz/util/Harmonic
*
* Purpose: Performs operation to calculate payment.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
    package com.bridgelabz.util;
 
 /* Class declaration */   
    public class Harmonic   {   /* returns 1/1 + 1/2 + 1/3 + ... + 1/n */ 

     static int InputNumber;
     
      public static void main(String args[])
  {
	 InputNumber=Integer.parseInt(args[0]);
    
      	for( int i=1; i<=InputNumber; i++)
       	{
         System.out.print("1/"+i);
   
       		if(i < InputNumber)
      		{
      		System.out.print(" + ");
      		}
       	}
   }
 }
