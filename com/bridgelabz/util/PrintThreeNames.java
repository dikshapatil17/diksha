/*Package Declaration*/

import java.util.Scanner;
/*Class Declaration*/

 class PrintThreeNames{

  public static void main(String args[]){
  /*Takes input from user*/
   
     Scanner scan=new Scanner(System.in);

       System.out.println("enter three names");
     
        String mName1 = scan.next(); 
         String mName2 = scan.next();
          String mName3 = scan.next();
     
      /*prints the output*/

       System.out.println(" hi " +mName3);
  
       System.out.println(" hi " +mName2);
           
        System.out.println(" hi " +mName1);
  }
    }


