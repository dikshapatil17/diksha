/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Sin.java
* Execution:   java -cp bin com.bridgelabz.util/Sin x
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
      public class Sin {

     /* main declaration */
       public static void main(String[] args) { 
        
    /* parse is a method which takes a string(input) as an argument and convert in double.
       x variables stores the number entered by the user as input */

       double x = Double.parseDouble(args[0]);

        /* convert x to an angle between -2 PI and 2 PI */
        x = x % (2 * Math.PI);

        /* compute the Taylor series approximation */
           double term = 1.0;      /* ith term = x^i / i! */
           double sum  = 0.0;      /* sum of first i terms in taylor series */

              for (int i = 1; term != 0.0; i++)
               {
                 term *= (x / i);
                   if (i % 4 == 1) sum += term;
                    if (i % 4 == 3) sum -= term;
                }
                    /* prints the output */
                  System.out.println(sum);
       }
   }
