/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/PrimeFactor.java
* Execution:   java -cp bin com.bridgelabz/util/PrimeFactor
*
* Purpose: Performs Prime Factorization.
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
     class PrimeFactors{

    static int number;

   /* main declaration */
    public static void main(String args[]){

    Scanner sc=new Scanner(System.in); /* Takes input from user */
    System.out.println("Enter any Number to find Prime Factors ");   

      number=sc.nextInt();
     System.out.println("Given Number is : " + number);
     System.out.print("Prime Factors are : " );
        
            for (int i = 2; i*i <= number; i++) {
 
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }
          /* Prints the output */
        if (number < 1) System.out.println(number);
    }
 
}