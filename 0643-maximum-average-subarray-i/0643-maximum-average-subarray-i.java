class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=k;
        int maxi=0;
        int sum=0;
        for(int i=0;i<end;i++){
            sum+=nums[i];
        }
        maxi=sum;
         while(end<nums.length){
            sum-=nums[start++];
            sum+=nums[end++];
            maxi=Math.max(maxi,sum);

         }
         return (double)maxi/k;
        
    }
}