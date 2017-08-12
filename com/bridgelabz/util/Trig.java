/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Trig.java
* Execution:   java -cp bin com.bridgelabz.util/Trig m n 
*
* Purpose: Perform Trignometric calculation.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;
 
 /* Class declaration */
 class Trig{

  /* main declaration */
  public static void main(String args[]){

  /* parse is a method which takes a string(input) as an argument and convert in double.
     degree,radian variables stores the number entered by the user as input */

   double degree=Double.parseDouble(args[0]);
   double radian=Double.parseDouble(args[1]);

  /* Perform Trignometric calculation */
      double s=Math.sin(radian);
      System.out.println("sin("+degree+")="+s);

   
      double c=Math.cos(radian);
      System.out.println("cos("+degree+")="+c);

   
      double t=Math.tan(radian);
      System.out.println("tan("+degree+")="+t);

   
     double r=s*s+c*c;
     System.out.println(s*s+"+"+c*c+"="+r);
   }
 }