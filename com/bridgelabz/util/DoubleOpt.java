/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/DoubleOpt.java
* Execution:   java -cp bin com.bridgelabz/util/DoubleOpt 
*
* Purpose: Performs Aritmatic operation on double.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;

 /* Class declaration */
 class DoubleOpt {

     static double input1,input2,input3;
     static double result1,result2,result3;

     /* main declaration */
     public static void main(String[] args) {
  
    /* parse is a method which takes a string(input) as an argument and convert in double.
     input1,input2,input3 variables stores the number entered by the user as input */

    input1=Double.parseDouble(args[0]);
    input2=Double.parseDouble(args[1]);
    input3=Double.parseDouble(args[2]);
 
      /* Performs the following operations */

         result1 = (input1 + input2 * input3);

          result2 = (input1 * input2 + input3);

           result3 = (input1 % input2 + input3); 

    /* prints the output */

    System.out.println("result of" +input1+ "+" +input2+ "*" +input3+ "=" +result1);

     System.out.println("result of" +input1+ "*" +input2+ "+" +input3+ "=" +result2);
   
      System.out.println("result of"+input1+"%"+input2+"+"+input3+"="+result3);     
  
    }
  }


    


    
    

