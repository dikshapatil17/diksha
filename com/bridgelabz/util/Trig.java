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

    static double sine,cosine,tangent,result,degree,radian;

  /* main declaration */
  public static void main(String args[]){

  /* parse is a method which takes a string(input) as an argument and convert in double.
     degree,radian variables stores the number entered by the user as input */

    degree=Double.parseDouble(args[0]);
    radian=Double.parseDouble(args[1]);

  /* Perform Trignometric calculation */
      sine=Math.sin(radian);
      System.out.println("sin("+degree+")="+sine);

   
      cosine=Math.cos(radian);
      System.out.println("cos("+degree+")="+cosine);

   
      tangent=Math.tan(radian);
      System.out.println("tan("+degree+")="+tangent);

   
     result=sine*sine+cosine*cosine;
     System.out.println(sine*sine+"+"+cosine*cosine+"="+result);
   }
 }