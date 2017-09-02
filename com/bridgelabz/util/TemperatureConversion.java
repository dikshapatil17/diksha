/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/TemperatureConversion.java
* Execution:   java -cp bin com/bridgelabz/util/TemperatureConversion
*
* Purpose: convert temperature to celcius and fahrenhite .
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
  class TemperatureConversion {

   static int tempCel,tempFar,Result,ResultFar,ResultCel;

  /* main declaration */
 public static void main(String args[]){

  Scanner scan=new Scanner(System.in);

 /* parse is a method which takes a string(input) as an argument and convert in integer.
     tempCel,tempFar variables stores the number entered by the user as input */
   
   tempCel= Integer.parseInt(args[0]);
   tempFar= Integer.parseInt(args[1]);
  
  /* Prints the value of celcius and fahrenhite taken from user */
   System.out.println();
   System.out.println("the entered value of celsius is " +tempCel+ " and fahrenhite is " +tempFar);
   System.out.println();    
 
   System.out.println("MENU:");
   System.out.println("1. Celcius to Fahrenhite");  
   System.out.println("2. Fahrenhite to Celcius");
    System.out.println();

     System.out.println("enter your choice");
      Result=scan.nextInt();

      System.out.println("the entered choice is " +Result);

    switch(Result)  
   {
     case 1:  ResultFar = (tempCel*9/5)+32; /* convert temperature to fahrenhite */
              System.out.println(" The" +tempCel+" in celcius is converted to " +ResultFar+ "in Fahrenhite");
              break;

     case 2:  ResultCel =(tempFar-32)*5/9;  /* convert temperature to celcius */
              System.out.println(" The" +tempFar+ "in Fahrenhite is converted to " +ResultCel+ "in Celcius");
              break;
     
     default: System.out.println("invalid entry");
  }
 }
}

     
    
    
    



     
    