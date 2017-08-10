

import java.util.Scanner;
public class Quadratic_Equation {
    public static void main(String[] args) {
       
   int mInput1,mInput2,mInput3;
   double root1,root2,d;

    Scanner scan=new Scanner(System.in);
   
    System.out.println("enter input1");
     mInput1=scan.nextInt();

     System.out.println("enter input2");
      mInput2=scan.nextInt();

      System.out.println("enter input3");
       mInput3=scan.nextInt();

     System.out.println("given quadratic equation is" +mInput1+"x^2+"+mInput2+"x+"+mInput3);
   d=mInput2*mInput2-4*mInput1*mInput3;
     if(d>0)
{

   System.out.println("Roots are real and unequal");
 root1=(-mInput2+Math.sqrt(d))/(2*mInput1);
 root2=(-mInput2-Math.sqrt(d))/(2*mInput1);
System.out.println("first root is"+root1);
System.out.println("second root is"+root2);

}

else if(d==0)
{
System.out.println("Roots are real and equal");
root1=(-mInput2+Math.sqrt(d))/(2*mInput1);
System.out.println("root is"+root1);
}
else
{
System.out.println("roots are imaginary");
}
}
}



    
    

