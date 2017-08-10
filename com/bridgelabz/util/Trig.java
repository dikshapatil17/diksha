class Trig{
 public static void main(String args[]){

   double degree=Double.parseDouble(args[0]);
   double radian=Double.parseDouble(args[1]);

   double s=Math.sin(radian);
   System.out.println("sin("+degree+")="+s);

   
   double c=Math.cos(radian);
   System.out.println("cos("+degree+")="+c);

   
   double t=Math.tan(radian);
   System.out.println("tan("+degree+")="+t);

   
   double r=s*s+c*c;
   System.out.println(s*s+"+"+c*c+"="+r);
  }
 }