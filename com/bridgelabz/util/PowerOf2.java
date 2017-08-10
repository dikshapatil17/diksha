public class PowerOf2 {

  public static void main(String args[]){

    int inputNo=Integer.parseInt(args[0]);
    
/* inputNo>31 will overflow an int */

       if(inputNo>=0 && inputNo<31)
          {

      for(int i=0;i<=inputNo;i++)
         {
                  
     System.out.println("the table is " +i+ " " +Math.pow(2,i));
             
}

  }
}
}