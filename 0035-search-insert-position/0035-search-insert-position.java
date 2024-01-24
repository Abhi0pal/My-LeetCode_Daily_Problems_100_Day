class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int flag=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=i;            
            }
            else if(nums[i]<target){
                flag=i+1;
            }
        }
        return flag;}}