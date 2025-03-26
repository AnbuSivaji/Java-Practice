public class Reverse2 {//class declaration

    public static void main(String args[]){//main method
           
           String str="Hello";//string to be reversed
            String rev="";//empty string to store the reverse of the string
    int len=str.length();//length of the string
      
    for(int i=len-1;i>=0;i--)                             //loop to traverse the string in reverse order
    {                                                     //start of for loop
        rev=rev+str.charAt(i);                            //concatenating the characters in reverse order

    }                                                    //end of for loop
    System.out.println("The reverse of the string is: "+rev);//printing the reverse of the string

    }                                                   //end of main
    
}                                                      //end of class
