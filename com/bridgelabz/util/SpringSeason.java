/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/SpringSeason.java
* Execution:   java -cp bin com/bridgelabz/util/SpringSeason
*
* Purpose: check whether the entered value is spring or not.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;

 /* Class declaration */
 public class SpringSeason{
   
    static int month,day;
  
  /* main declaration */   
  public static void main(String args[]) {
  
  /* parse is a method which takes a string(input) as an argument and convert in integer.
     month,day variables stores the number entered by the user as input */
  
    month=Integer.parseInt(args[0]);
    day=Integer.parseInt(args[1]);
 

           if (month==3 && day>=20 && day<=31)
   {
     System.out.println("it is spring");
    }
  
       else if (month==4 && day>=1 && day<=30)
    {
      System.out.println("it is spring");
     }
    
        else if (month==5 && day>=1 && day<=31)
    {
      System.out.println("it is spring");
     }
        
        else if (month==6 && day>=1 && day<=20)
    {
      System.out.println("it is spring");
     }

        else
     {
    
       System.out.println("not a spring");
     }
   }
 }