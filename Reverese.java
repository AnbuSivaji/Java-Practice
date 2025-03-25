
import java.util.Scanner;
 public class Reverese {
    
    
    public static  void main(String args[]){
        
        Scanner scan=new Scanner (System.in);

        System.out.println("Enter a Words");
        String Word=scan.next();
      
        
        StringBuffer sb=new StringBuffer(String.valueOf(Word));
         StringBuffer rev=sb.reverse();
        System.out.println("Reverse of the number is:"+rev);
        
      scan.close();
           
    }

}
