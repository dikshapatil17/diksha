
/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/Binary.java
* Execution:   java -cp bin com.bridgelabz.util/Binary m 
*
* Purpose: Prints the binary representation of decimal number.
*
* @author Diksha
* @version 1.0
* @since 11-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
 package com.bridgelabz.util;
 
 /* Class declaration */
    public class Binary { 
   
 
  /* main declaration */   
     public static void main(String[] args) { 

        /* read in the command-line argument */
       
 
  /* parse is a method which takes a string(input) as an argument and convert in integer.
     n variables stores the number entered by the user as input */

     int n = Integer.parseInt(args[0]);

        /* set power to the largest power of 2 that is <= n */
      
      int power = 1;
      
        while (power <= n/2)
         {
          
           power *= 2;
        }
  
        /* check for presence of powers of 2 in n, from largest to smallest
 */ 
               while (power > 0) {

            /* power is not present in n 
*/            
            
               if (n < power) 
             {
              
                 System.out.print(0);
           
               }

            /* power is present in n, so subtract power from n */
     
              else {
               
                 System.out.print(1);
                
                     n -= power;
            }

            /* next smallest power of 2
 */  
                     power /= 2;
        }

      
                      System.out.println();

   
   }


}
