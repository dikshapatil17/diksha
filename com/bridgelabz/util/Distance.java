/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Distance.java
* Execution:   java -cp bin com/bridgelabz/util/Distance  
*
* Purpose: calculate the Distance.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;

 /* Class declaration */
 public class Distance {

        static int input1,input2;
        static double dist;

    /* main declaration */
    public static void main(String[] args) {
      
 /* parse is a method which takes a string(input) as an argument and convert in double.
     principle,rate,year variables stores the number entered by the user as input */
 
     input1=Integer.parseInt(args[0]);
     input2=Integer.parseInt(args[1]);

    /* compute distance to (0,0) */
    dist=Math.sqrt(input1*input1 + input2*input2);
  
    /* Prints the output */
    System.out.println("Distance from(" +input1+ "," +input2+ ") to (0,0)=" +dist);

}

  }


    

