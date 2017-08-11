/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/DaysOfWeek.java
* Execution:   java -cp bin com.bridgelabz.util.DaysOfWeek m n r
*
* Purpose: calculate days of week.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
 /* Package Naming Style*/
 package com.bridgelabz.util;
 
/* Class declaration */
 class DaysOfWeek {

    /* main declaration */
    public static void main(String[] args) {
    
  /* parse is a method which takes a string(input) as an argument and convert in integer.
     day,month,year variables stores the number entered by the user as input */    
  
  int day = Integer.parseInt(args[0]);
  int month = Integer.parseInt(args[1]);
  int year = Integer.parseInt(args[2]);
  
    System.out.println("the entered day is" +day+ " month is " +month+ " and year is" +year);

     /* Performs the following operations */
      int y = year-(14-month)/12;  /* calculate year */

      int x = y+(y/4)-(y/100)+(y/400); /* calculate leap year */

      int m = month+12*((14-month)/12)-2; /* calculate month */

      int d = (day+x+(31*m)/12)%7; /* calculate day */

     /* prints the output */
   System.out.println("day is " +d);
 }
}

    
    

