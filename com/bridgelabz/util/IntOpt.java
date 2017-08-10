


class IntOpt {

     public static void main(String[] args) {
    int input1=Integer.parseInt(args[0]);
    int input2=Integer.parseInt(args[1]);
    int input3=Integer.parseInt(args[2]);
 
        double result1 = (input1 + input2 * input3);

         double result2 = (input1 * input2 + input3);

          double result3 = (input1 % input2 + input3); 

    System.out.println("result of" +input1+ "+" +input2+ "*" +input3+ "=" +result1);

     System.out.println("result of" +input1+ "*" +input2+ "+" +input3+ "=" +result2);
   
      System.out.println("result of"+input1+"%"+input2+"+"+input3+"="+result3);     
  
    }
  }


    


    
    

