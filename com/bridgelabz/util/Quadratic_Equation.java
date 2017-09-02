/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Quadratic_Equation.java
* Execution:   java -cp bin com/bridgelabz/util/Quadratic_Equation
*
* Purpose: Performs Quadratic Equation.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;
 import java.util.Scanner;

  /* Class declaration */ 
  public class Quadratic_Equation {

    static int mInput1,mInput2,mInput3;
    static double root1,root2,d;

    /* main declaration */
    public static void main(String[] args) {
   
   /* mInput1,mInput2,mInput3 are variables initialized to integer datatype */    
     int mInput1,mInput2,mInput3;

     /* root1,root2,d are variables initialized to double datatype */
     double root1,root2,d;

   /* Scanner takes an input as a object */
    Scanner scan=new Scanner(System.in);
   
  /* accept an integer and stores in a variable */
    
    System.out.println("enter input1");
     mInput1=scan.nextInt();

     System.out.println("enter input2");
      mInput2=scan.nextInt();

      System.out.println("enter input3");
       mInput3=scan.nextInt();

     System.out.println("given quadratic equation is" +mInput1+"x^2+"+mInput2+"x+"+mInput3);
   
  /* performs the formula b^2-4ac */  
  d=mInput2*mInput2-4*mInput1*mInput3;
     
     if(d>0)
{

   System.out.println("Roots are real and unequal");
 
      /* Perform following the operation */
       root1=(-mInput2+Math.sqrt(d))/(2*mInput1);
       root2=(-mInput2-Math.sqrt(d))/(2*mInput1);
       System.out.println("first root is"+root1);
       System.out.println("second root is"+root2);

  }

   else if(d==0)
 {
         System.out.println("Roots are real and equal");
         root1=(-mInput2+Math.sqrt(d))/(2*mInput1);
         System.out.println("root is"+root1);
    }
     else
     {
        System.out.println("roots are imaginary");
      }
    }
 }



    
    

