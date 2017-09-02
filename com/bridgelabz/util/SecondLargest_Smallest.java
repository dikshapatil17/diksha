/*********************************************************************************
* Compilation: javac -d bin com/bridgelabz/util/SecondLargest_Smallest.java
* Execution:   java -cp bin com/bridgelabz/util/SecondLargest_Smallest
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
    static int inputNo;

     /* main declaration */
    public static void main(String[] args) 
    {
        int inputNo, temp; /* inputNo,temp variables are initialized by datatype integer */
           Scanner scan = new Scanner(System.in);  /* takes input from from the user */
          System.out.print("Enter no. of elements you want in array:");
          inputNo = scan.nextInt();
              
             int a[] = new int[inputNo];
        System.out.println("Enter all the elements:");
        
      for (int i = 0; i < inputNo; i++) 
        {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < inputNo; i++) 
         {
            for (int j = i + 1; j < inputNo; j++) 
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
           System.out.println("Second Largest:"+a[inputNo-2]);
           System.out.println("Second Smallest:"+a[1]);
    }
}