/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/RollDie.java
* Execution:   java -cp bin com.bridgelabz/util/RollDie
*
* Purpose:  This program simulates rolling a pair of dice.
*           The number that comes up on each die is output,
*           followed by the total of the two dice..
*
* @author Diksha
* @version 1.0
* @since 11-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;
 
 /* Class declaration */
    public class RollDie {
   
    /* main declaration */
       public static void main(String[] args) {
    
        int die1;   /* The number on the first die. */
        int die2;   /* The number on the second die.*/
        int roll;   /* The total roll (sum of the two dice). */
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);

    }  // end main()
 
}  // end class
