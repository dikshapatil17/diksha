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

     static int day,month,year;

    /* main declaration */
    public static void main(String[] args) {
    
  /* parse is a method which takes a string(input) as an argument and convert in integer.
     day,month,year variables stores the number entered by the user as input */    
  
      day = Integer.parseInt(args[0]);
      month = Integer.parseInt(args[1]);
      year = Integer.parseInt(args[2]);
  
    System.out.println("the entered day is " +day+ " month is " +month+ " and year is " +year);

     /* Performs the following operations */
      int y0 = year-(14-month)/12;  /* calculate year */

      int x0 = y0+(y0/4)-(y0/100)+(y0/400); /* calculate leap year */

      int m0 = month+12*((14-month)/12)-2; /* calculate month */

      int d0 = (day+x0+(31*m0)/12)%7; /* calculate day */

     /* prints the output */
	if(d0 == 1)
        {
       System.out.println("The Day of week is " +d0+ " and it is Monday");
        }
        else if(d0 == 2)
      {
       System.out.println("The Day of week is " +d0+ " and it is Tuesday");
       } 
       else if(d0 == 3)
        {
       System.out.println("The Day of week is " +d0+ " and it is Wednesday");
       } 
          else if(d0 == 4)
       {
        System.out.println("The Day of week is " +d0+ " and it is Thrusday");
       }
        else if(d0 == 5)       
       {
       System.out.println("The Day of week is " +d0+ " and it is Friday");
       }
        else if(d0 == 6)
       {
       System.out.println("The Day of week is " +d0+ " and it is Saturday");
       }
        else {
       System.out.println("The Day of week is " +d0+ " and it is sunday");
       }
 }
}

    
    

