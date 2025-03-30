class Solution5 {
    
    public static void main(String args[]){
    public double findMaxAverage (int[] nums, int k) {
         double res;
         double max=0;
         double sum =0.0;
         for(int i=0;i<=nums.length-k;i++){
          for(int j=i;j<k+i;j++){

            sum +=nums[j];
          }
          res=sum/k;
          max=Math.max(max,res);

         }

         return max;


    }
}
}