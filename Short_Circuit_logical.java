import java.util.Scanner;

public class Short_Circuit_logical {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Logical AND : "+ (a>5 && b>5));
        System.out.println("Logical OR : "+ (a>5 || b>5));
        System.out.println("Logical NOT : "+ !(a>5) +"\n\n");
  
      /*
        Logical AND : 1&&1=1,//  1=true
                      1&&0=0,//  0=false
                      0&&1=0,//  0=false
                      0&&0=0 //  0=false
                      
                      
        Logical OR  : 1||1=1,//  1=true
                      1||0=1,//  1=true
                      0||1=1,//  1=true
                      0||0=0//   0=false

        Logical NOT : !1=0,//   0=false
                      !0=1//    1=true
                                                              
       */
       
       
        boolean c =true ,d=false;//true=1,false=0
        System.out.println("Logical AND : "+ (c && d));
        System.out.println("Logical OR : "+ (c || d));
        System.out.println("Logical NOT : "+ (!c));
}
}