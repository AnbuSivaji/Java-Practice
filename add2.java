public class add2 {
    public static void main(String args[]){
        int num=1234;
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("Reverse of the number is:"+rev);
    }
    
}
