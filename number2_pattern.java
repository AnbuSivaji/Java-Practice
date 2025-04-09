public class number2_pattern {
    public static void main(String[] args) {
        
       int n = 5; // Number of rows
        int num = 1; // Starting number

        for (int i = 1; i <= n; i++) {
              
            for (int j = 1; j <= i; j++) {
                System.out.print( " " + num + "     ");
                     
                num++;
                //   System.out.println(" ");
            }
            System.out.println(); // Move to the next line after each row   
            
        }  
        
      
    }
}
