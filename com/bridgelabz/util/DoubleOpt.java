


class DoubleOpt {

     public static void main(String[] args) {
   double input1=Double.parseDouble(args[0]);
   double input2=Double.parseDouble(args[1]);
   double input3=Double.parseDouble(args[2]);
 
        double result1 = (input1 + input2 * input3);

         double result2 = (input1 * input2 + input3);

          double result3 = (input1 % input2 + input3); 

    System.out.println("result of" +input1+ "+" +input2+ "*" +input3+ "=" +result1);

     System.out.println("result of" +input1+ "*" +input2+ "+" +input3+ "=" +result2);
   
      System.out.println("result of"+input1+"%"+input2+"+"+input3+"="+result3);     
  
    }
  }


    


    
    

