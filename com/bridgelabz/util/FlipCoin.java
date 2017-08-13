/******************************************************************
* Compilation: javac -d bin com/bridgelabz/util/FlipCoin.java
* Execution:   java -cp bin com.bridgelabz.util.FlipCoin 
*
* Purpose: Prints the percentage of Heads vs Tail.
*
* @author Diksha
* @version 1.0
* @since 10-8-2017
*
********************************************************************/
  
  /* Package Naming Style*/
   package com.bridgelabz.util;

   class FlipCoin{

    static int head,tails,input,ctr,head_percent,tails_percent,total;

    public static void main(String args[]){
      
          head=0;
          tails=0;
         input=Integer.parseInt(args[0]);

          for(ctr=1;ctr<=input;ctr++)
        {
      
          /* Math.random() returns a value between 0.0 and 1.0
           so it is head or tails 50% of the time */

                if(Math.random() < 0.5)

                {
                    head++;
                }
            else 
                 {
                    tails++;
                 }
                      total++;
           }
                    System.out.println("number of heads appeared is " +head+ " where number of tails are "+tails);
                    head_percent=(head*100)/total;
                    tails_percent=(tails*100)/total;
                    System.out.println("percentage of heads appeared is " +head_percent+ " where percentage of tails are "+tails_percent);
         }
  }

