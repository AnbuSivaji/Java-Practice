public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 10; // Given input

        int count = 0; // Counter for prime numbers
        int i = 2; // Starting from the first prime number
         while(count<n){
            boolean isPrime = true; // Flag to check if the number is prime
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false; // Not a prime number
                    break;
                }
            }
            if(isPrime){
                System.out.print(i + " "); // Print the prime number
                count++; // Increment the count of prime numbers found
            }
            i++; // Move to the next number
         }

        
    }
}
    
        // Function to check if a number is prime
       