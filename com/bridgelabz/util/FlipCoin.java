/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/FlipCoin.java
* Execution:   java -cp bin com.bridgelabz.util.FlipCoin 
*
* Purpose: Prints the percentage of Heads vs Tail.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;

 /* Class declaration */
 class FlipCoin{

  /* main declaration */
  public static void main(String args[]){

/* Math.random() returns a value between 0.0 and 1.0
   so it is head or tails 50% of the time */

   if(Math.random() < 0.5)

     System.out.println("Heads");

  else

     System.out.println("Tails");

  }
 }