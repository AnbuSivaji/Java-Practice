
import java.util.Scanner;

public record Switch() {
     public static void main(String args[]){
      
        Scanner scan=new Scanner (System.in) ;   
        System.out.println("Enter a first number : "); 
        int a=scan.nextInt();
        System.out.println("Enter a second number :");
        int b=scan.nextInt();
        System.out.println("Enter an operator :");
        char operator=scan.next().charAt(0);
     switch(operator){
            case '+':
            System.out.println("The sum of the two numbers is : "+(a+b));
            break;
            case '-':
            System.out.println("The difference of the two numbers is : "+(a-b));
            break;
            case '*':
            System.out.println("The product of the two numbers is : "+(a*b));
            break;
            case '/':
            System.out.println("The division of the two numbers is : "+(a/b));
            break;
            default:
            System.out.println("Invalid operator");
     }
    }
}
