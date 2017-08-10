package com.bridgelabz.util;

public class WindChill {

    public static void main(String[] args) {
        
  int temp=Integer.parseInt(args[0]);
  int velocity=Integer.parseInt(args[1]);

    System.out.println("the entered value of temperature is " +temp+ " and velocity is " +velocity);

      double result = 35.74+0.6215*temp+(0.4275*temp-35.75)*Math.pow(velocity,0.16);

   System.out.println("entered value of wind chill is " +result);
 }
}

    
    

