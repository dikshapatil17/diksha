/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/CarLoan.java
* Execution:   java -cp bin com.bridgelabz.util/CarLoan m n r
*
* Purpose: Performs operation to calculate payment.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;
 
 /* Class declaration */
 class CarLoan {
 
    /* main declaration */
    public static void main(String[] args) {
      
  /* parse is a method which takes a string(input) as an argument and convert in double.
     principle,rate,year variables stores the number entered by the user as input */
        
  double principal=Double.parseDouble(args[0]);
  double rate=Double.parseDouble(args[1]);
  double year=Double.parseDouble(args[2]);
  
    System.out.println("the entered principal is" +principal+ " rate is " +rate+ "and year is "+year);

    /* Performs the following operations */
     double n=12*rate;
     double r=rate/(12*100);
     double payment=(principal*r)/(1-Math.pow(1+r,(-n)));

 /* prints the output */
   System.out.println("payment is"+payment);
 }
}

    
    


   
    

