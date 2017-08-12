/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/ReapetedNumber.java
* Execution:   java -cp bin com.bridgelabz/util/ReapetedNumber
*
* Purpose: Find the Repeated numbers from array.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
    package com.bridgelabz.util;
 
   /* Class declaration */
   class ReapetedNumber
 {
    /* main declaration */
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,2,6,5,8};
 
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if( (arr[i]==(arr[j])) )   /* checks the value of i and j are equal or not */
                {
                    System.out.println("Repeated Element is : "+arr[j]);
                }
            }
        }
    }    
}
  