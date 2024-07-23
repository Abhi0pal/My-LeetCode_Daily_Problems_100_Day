class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>=nums[i]){
                continue; 
            }
            else{
                count++;
                if(count>=2){
                    return false;

                }
            }
        }
        if(nums[nums.length-1]>nums[0]){
            count++;
            if(count>=2){
                    return false;

            }

        }
        return true;
        
    }
}