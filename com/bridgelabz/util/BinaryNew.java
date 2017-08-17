/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/BinaryNew.java
* Execution:   java -cp bin com.bridgelabz/util/Binary 
*
* Purpose: print Binary representation of decimal numbers.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  package com.bridgelabz.util;
import java.util.Scanner;
public class BinaryNew {

    public static void main(String[] args) 
    {
        int a[];
int n,i;    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
       {  
   

for(i=0;n>0;i++)  
{  
a[i]=n%2;  
n=n/2;  
}  
System.out.println("\nBinary of Given Number is=");  
for(i=i-1;i>=0;i--)  
{  
System.out.println(a[i]);  
}  
        
    }
} 
}
