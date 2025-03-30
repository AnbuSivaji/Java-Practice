import java.util.Scanner;

public class  SwitchCase {
     public static void main(String args[]){
        Scanner Vowel=new Scanner (System.in);
        System.out.println("Enter a character : ");
        char ch=Vowel.next().charAt(0);
        switch(ch){
              case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println("The character is a vowel");
              default -> System.out.println("The vhracter is a constant");
          
        }



    }
}
