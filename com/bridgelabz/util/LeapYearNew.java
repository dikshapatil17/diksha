/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/LeapYearNew.java
* Execution:   java -cp bin com.bridgelabz.util/LeapYearNew
*
* Purpose: Find whether the year is leap year or not.
*
* @author Diksha
* @version 1.0
* @since 14-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;

   class LeapYearNew {
     static int year; 
   
      public static void main(String args[]){

      /* parse is a method which takes a string(input) as an argument and convert in double.
     principle,rate,year variables stores the number entered by the user as input */

        year=Integer.parseInt(args[0]);

      if(((year%4==0)&&(year%100!=0))||(year%400==0))
	    {
		System.out.println( +year+" is leap year");
	    }
	else
	    {
		System.out.println( +year+" is not leap year");
	     }
      }
  }
