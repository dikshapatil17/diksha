/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/PowerOf2.java
* Execution:   java -cp bin com.bridgelabz/util/PowerOf2 m
*
* Purpose: Prints the table of the power of 2.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style */
 package com.bridgelabz.util;
 
  /* Class declaration */
  public class PowerOf2 {

  /* main declaration */
  public static void main(String args[]){
  
   /* parse is a method which takes a string(input) as an argument and convert in Integer.
     inputNo variables stores the number entered by the user as input */
    
   int inputNo=Integer.parseInt(args[0]);
    
       /* inputNo>31 will overflow an int */

       if(inputNo>=0 && inputNo<31)
          {

      for(int i=0;i<=inputNo;i++)
         {
           
     /* prints the output */       
     System.out.println("the table is " +i+ " " +Math.pow(2,i));
             
}

  }
}
}