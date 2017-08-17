/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/WindChill.java
* Execution:   java -cp bin com.bridgelabz.util/WindChill  
*
* Purpose: To find WindChill.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
    package com.bridgelabz.util;
  
 /* main declaration */
    public class WindChill {

      static int temp,velocity;
      static double result;   

    public static void main(String[] args) {

  /* parse is a method which takes a string(input) as an argument and convert in integer.
     temp,velocity variables stores the number entered by the user as input */
        
         temp=Integer.parseInt(args[0]);
         velocity=Integer.parseInt(args[1]);

         System.out.println("the entered value of temperature is " +temp+ " and velocity is " +velocity);

           /* Performs the result */
            result = 35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(velocity,0.16);

          /* prints the output */
         System.out.println("entered value of wind chill is " +result);
     }
  }

    
    

