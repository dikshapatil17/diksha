/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/PrintThreeNames.java
* Execution:   java -cp bin com.bridgelabz.util.PrintThreeNames 
*
* Purpose: prints the name in reverse order.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
   package com.bridgelabz.util;
   import java.util.Scanner;

  /*Class Declaration*/
  class PrintThreeNames{

 /* Class declaration */ 
 public static void main(String args[]){
  
  /*Takes input from user*/
   Scanner scan=new Scanner(System.in);

       System.out.println("enter three names");
     
         String mName1 = scan.next(); 
         String mName2 = scan.next();
         String mName3 = scan.next();
     
      /*prints the output*/

       System.out.println(" hi " +mName3);
  
       System.out.println(" hi " +mName2);
           
        System.out.println(" hi " +mName1);
  }
    }


