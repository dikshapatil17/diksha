/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/PrimeRange.java
* Execution:   java -cp bin com.bridgelabz.util/PrimeRange 
*
* Purpose: Calculate Prime numbers in given range.
*
* @author Diksha
* @version 1.0
* @since 11-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
  package com.bridgelabz.util;
  import java.util.Scanner;
 
 /* Class declaration */
   public class PrimeInRange{
     
    /* main declaration */
      public static void main(String args[]) {
         
       /* input1,input2,flag variables are initalized by datatype integer */
         int input1, input2, flag = 0, i, j;
         
          Scanner s = new Scanner(System.in); /* Takes input from user */
         
         System.out.println ("Enter the lower limit :"); 
         input1 = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         input2 = s.nextInt();
         System.out.println ("The prime numbers in between the entered limits are :");
         
           for(i = input1; i <= input2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 /* Prints the output */
                 System.out.println(i);
             }
         }
    }
}