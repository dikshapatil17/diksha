/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/IntOpt.java
* Execution:   java -cp bin com.bridgelabz.util.IntOpt 
*
* Purpose: Performs Aritmatic operation on integer.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;

 /* Class declaration */
 class IntOpt {

        static int input1,input2,input3;
        static double result1,result2,result3;

       /* main declaration */
      public static void main(String[] args) {
    
   /* parse is a method which takes a string(input) as an argument and convert in double.
     input1.input2,input3 variables stores the number entered by the user as input */    

     input1=Integer.parseInt(args[0]);
     input2=Integer.parseInt(args[1]);
     input3=Integer.parseInt(args[2]);
 
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


    


    
    

