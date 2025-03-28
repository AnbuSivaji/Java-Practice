
import java.util.Scanner;

public class switch1 {

    public static void main(String args[]){
        Scanner Vowel=new Scanner (System.in);
        System.out.println("Enter a character : ");
        char ch=Vowel.next().charAt(0);
        switch(ch){
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
              case 'A':  
              case 'E':
              case 'I':  
              case 'O':
              case 'U': 
              System.out.println("The character is a vowel");
             break;

             default:
             System.out.println("The vhracter is a constant");
          
        }



    }
    
}
