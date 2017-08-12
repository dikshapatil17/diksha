/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/SumOfTwoDice.java
* Execution:   java -cp bin com.bridgelabz.util/SumOfTwoDice m n 
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

    /* main declaration */
    public static void main(String args []){

   /* parse is a method which takes a string(input) as an argument and convert in integer.
      dice1,dice2 variables stores the number entered by the user as input */

    int dice1 = Integer.parseInt(args [0]);
    int dice2 = Integer.parseInt(args [1]); 

       System.out.println("The number of values required from dice1 is : " +dice1);
       System.out.println("The number of values required from dice2 is : " +dice2);

            for(int i=0;i<dice1;i++)
             {
                for(int j=0;j<dice2;j++)
                  {

                     /* Calculate the result */
                   double result1 = Math.random()*6+1;
                   double result2 = Math.random()*6+1;

                      System.out.println("Value for dice1 is : " +result1);
                      System.out.println("Value for dice2 is : " +result2);

                           /* add sum of two dice and stores in variable Sum */
                         Double Sum = result1 + result2;
                   
                       /* prints the output */
                     System.out.println("The sum of two dice is : " +Sum);

                  }
            }
     }
}