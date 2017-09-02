/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Sqri.java
* Execution:   java -cp bin com.bridgelabz/util/Sqrt c
*
* Purpose: Compute square root of non negative number.
*
* @author Diksha
* @version 1.0
* @since 11-8-2017
*
********************************************************************/
  
 /* Package Naming Style*/
    package com.bridgelabz.util;
 
  /* Class declaration */
     public class Sqrt {

       static double c,epsilon,t;

   /* main declaration */
       public static void main(String[] args) { 

   /* read in the command-line argument*/

   /* parse is a method which takes a string(input) as an argument and convert in double.
      c variables stores the number entered by the user as input */

      c = Double.parseDouble(args[0]);


     epsilon = 1e-15;    /*relative error tolerance */
       
     t = c;              /* estimate of the square root of c*/       
 
   
    /* repeatedly apply Newton update step until desired precision is achieved */
       
         while (Math.abs(t - c/t) > epsilon*t)
    {
            
            t = (c/t + t) / 2.0;
    
    }

        
     /* print out the estimate of the square root of c */
      
  
       System.out.println(t);
   
   }


 }

