/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/CarLoan.java
* Execution:   java -cp bin com.bridgelabz/util/CarLoan m n r
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
    public class Harmonic   {   /* returns 1/1 + 1/2 + 1/3 + ... + 1/n
  */ 
     
      public static double harmonic(int n) {
        
      double sum = 0.0;
        
         for (int i = 1; i <= n; i++) 
           {
            
          sum += 1.0 / i;
       
           }
        

            
   
              

 
     
          /* main declaration */   
         public static void main(String[] args)
          { 
       
            for (int i = 0; i < args.length; i++) 
              {
           
                int arg = Integer.parseInt(args[i]);
           
                 double value = harmonic(arg);

                  /* prints the output */
         
                 System.out.println(value);
      
               }
  
          }


     }
