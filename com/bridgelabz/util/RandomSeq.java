/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/RandomSeq.java
* Execution:   java -cp bin com/bridgelabz/util/RandomSeq
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
  public class RandomSeq {

     static int inputNo;

   /* main declaration */
  public static void main(String args[]){

   /* parse is a method which takes a string(input) as an argument and convert in integer.
     inputNo variables stores the number entered by the user as input */
 
     inputNo=Integer.parseInt(args[0]);

      for(int i=0;i<inputNo;i++)
       
        {
               
        /* prints the random value */
           System.out.println(Math.random());
             
        }

      }
   }