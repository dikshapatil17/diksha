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
  

  /*Class Declaration*/
  class PrintThreeNames{
  static String firstName,secondName,thirdName;

 /* Class declaration */ 
 public static void main(String args[]){
  

       firstName=args[0];
       secondName=args[1];
       thirdName=args[2];
     
      /*prints the output*/

       System.out.println(" hi " +thirdName+ " " +secondName+ " " +firstName);
  
       
  }
    }


