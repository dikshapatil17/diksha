

 class CarLoan {

    public static void main(String[] args) {
              
  double principal=Double.parseDouble(args[0]);
  double rate=Double.parseDouble(args[1]);
  double year=Double.parseDouble(args[2]);
  
    System.out.println("the entered principal is" +principal+ " rate is " +rate+ "and year is "+year);
    
     double n=12*rate;
     double r=rate/(12*100);
     double payment=(principal*r)/(1-Math.pow(1+r,(-n)));

   System.out.println("payment is"+payment);
 }
}

    
    


   
    

