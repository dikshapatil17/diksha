/*********************************************************************************
* Compilation: javac -d bin com/bridgelabz/util/SecondLargest_Smallest.java
* Execution:   java -cp bin com.bridgelabz.util/SecondLargest_Smallest
*
* Purpose: Find Second Largest and second Smallest number without sorting array.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
***********************************************************************************/
  
  /* Package Naming Style*/
     package com.bridgelabz.util;
     import java.util.Scanner;
 
  /* Class declaration */
     public class SecondLargest_Smallest
 {

     /* main declaration */
    public static void main(String[] args) 
    {
        int n, temp; /* n,temp variables are initialized by datatype integer */
           Scanner s = new Scanner(System.in);  /* takes input from from the user */
          System.out.print("Enter no. of elements you want in array:");
          n = s.nextInt();
              
             int a[] = new int[n];
        System.out.println("Enter all the elements:");
        
      for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
         {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];      /* swap the numbers */
                    a[j] = temp;
                }
            }
        }

        /* prints the output */
           System.out.println("Second Largest:"+a[n-2]);
           System.out.println("Second Smallest:"+a[1]);
    }
}