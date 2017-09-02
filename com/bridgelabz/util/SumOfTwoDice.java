/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/SumOfTwoDice.java
* Execution:   java -cp bin com/bridgelabz/util/SumOfTwoDice  
*
* Purpose: Calculate Sum of two Dice.
*
* @author Diksha
* @version 1.0
* @since 11-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;

 
 /* Class declaration */
    public class SumOfTwoDice{

     static int die1,die2,rollSum;

    /* main declaration */
    public static void main(String args []){

         
    	die1 = (int)(Math.random()*6) + 1;
    	die2 = (int)(Math.random()*6) + 1;

  
    	System.out.println("Die 1 = "+die1);
    	System.out.println("Die 2 = "+die2);
    
    
    	rollSum = die1+die2;  
    	System.out.println("Sum of 2 dice = "+rollSum);
     }
   }