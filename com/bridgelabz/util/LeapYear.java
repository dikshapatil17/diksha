/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/LeapYear.java
* Execution:   java -cp bin com.bridgelabz./util/LeapYear m 
*
* Purpose: Calculate LeapYear.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;
 
  /* Class declaration */
  public class LeapYear{
    
     static int year;

 /* main declaration */  
 public static void main(String args[]){

    /* parse is a method which takes a string(input) as an argument and convert in double.
       year variables stores the number entered by the user as input */

      year=Integer.parseInt(args[0]);

  /* boolean value to return true or false */
   boolean isLeapYear;

    /*divisible by 4 */
      isLeapYear=(year % 4 == 0);

    /*divisible by 4 and not 100 */
      isLeapYear=isLeapYear && (year % 4 != 0);

    /*divisible by 4 and not 100 unless divisible by 400 */
      isLeapYear =isLeapYear || (year % 400 == 0);

      /* prints the output */
        System.out.println(isLeapYear);
      }

   }