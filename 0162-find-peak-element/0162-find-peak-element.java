class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            // if(nums.length==1) return nums[0];
            if((i==0 || nums[i-1]<nums[i])&&(i==nums.length-1)||nums[i]>nums[i+1]){
                return i;
            }
           

        }
        return -1;
        
    }
}