import java.util.Scanner;

public class Bitwise {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Bitwise AND : "+ (a&b));
        System.out.println("Bitwise OR : "+ (a|b));
        System.out.println("Bitwise XOR : "+ (a^b));
        System.out.println("Bitwise NOT : "+ (~a) +"\n\n");
  
      /*
        Bitwise AND : 1&1=1,//  1=true
                      1&0=0,//  0=false
                      0&1=0,//  0=false
                      0&0=0 //  0=false
                      
                      
        Bitwise OR  : 1|1=1,//  1=true
                      1|0=1,//  1=true
                      0|1=1,//  1=true
                      0|0=0//   0=false

        Bitwise XOR : 1^1=0,//  0=false
                      1^0=1,//  1=true
                      0^1=1,//  1=true
                      0^0=0//   0=false
         
        Bitwise NOT : ~1=0,//   0=false
                      ~0=1//    1=true
                                                                 
       */
      
      
        boolean c =true ,d=false;//true=1,false=0
        System.out.println("Bitwise AND : "+ (c&d));
        System.out.println("Bitwise OR : "+ (c|d));
        System.out.println("Bitwise XOR : "+ (c^d));
        System.out.println("Bitwise NOT : "+ (!c));




    }

}
