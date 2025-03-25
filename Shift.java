public class Shift {

    public static void main(String[] args){
        int a=-5;

        /*
              because the left shift operator shifts the bits of the number to the left and fills 0 on the right side. 
              The left shifts by pushing zeros in from the right and let the leftmost bits fall off.
              
              eg: 10<<2 means 10 is shifted to the left by 2 bits.
                10 is 0000 1010
                10<<2 is 0010 1000 which is 40
             
             eg: 10<<1 means 10 is shifted to the left by 1 bit.
                10 is 0000 1010
                10<<1 is 0001 0100 which is 20
            
            eg: -10<<1 means -10 is shifted to the left by 1 bit.      
                -10 is 1111 0110
                -10<<1 is 1110 1100 which is -20

    
      
         */

        System.out.println("Left shift : "+ (a<<2));//-20
          
        /*
                because the right shift operator shifts the bits of the number to the right and fills 0 on the left side. 
                The right shifts by pushing copies of the leftmost bit in from the left, and let the rightmost bits

                eg: 10>>2 means 10 is shifted to the right by 2 bits.
                10 is 0000 1010
                10>>2 is 0000 0010 which is 2

                eg: 10>>1 means 10 is shifted to the right by 1 bit.
                10 is 0000 1010
                10>>1 is 0000 0101 which is 5

                eg: -10>>1 means -10 is shifted to the right by 1 bit.
                -10 is 1111 0110
                -10>>1 is 1111 1011 which is -5
         */
          System.out.println("Right Shift : " +(a>>1) );//-3

          /*
                because the right shift operator shifts the bits of the number to the right and fills 0 on the left side. 
                The right shifts by pushing copies of the leftmost bit in from the left, and let the rightmost bits

                eg: 10>>>2 means 10 is shifted to the right by 2 bits.
                10 is 0000 1010
                10>>>2 is 0000 0010 which is 2

                eg: 10>>>1 means 10 is shifted to the right by 1 bit.
                10 is 0000 1010
                10>>>1 is 0000 0101 which is 5

                eg: -10>>>1 means -10 is shifted to the right by 1 bit.
                -10 is 1111 0110
                -10>>>1 is 0111 1011 which is 2147483643
           */




        System.out.println("Right shift zero fill : "+(a>>>1));//2147483643

    }
    
}
