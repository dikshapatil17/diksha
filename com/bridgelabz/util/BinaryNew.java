/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/BinaryNew.java
* Execution:   java -cp bin com/bridgelabz/util/BinaryNew 
*
* Purpose: print Binary representation of decimal numbers.
*
* @author Diksha
* @version 1.0
* @since 14-8-2017
*
********************************************************************/
  package com.bridgelabz.util;
import java.util.Scanner;
public class BinaryNew
{
      static int inputNo;
      static String x;
  
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);
        
         System.out.print("Enter any decimal number:");
        inputNo = scan.nextInt();
        
         BinaryNew obj = new BinaryNew();    //Object created
        x = obj.binary(inputNo);
        
          System.out.println("Binary number:"+x);
    }
    String binary(int y)
    {
        int a;
        if(y > 0)
        {
            a = y % 2;
            return (binary(y / 2) + "" +a);
        }
        return "";
    }
}
