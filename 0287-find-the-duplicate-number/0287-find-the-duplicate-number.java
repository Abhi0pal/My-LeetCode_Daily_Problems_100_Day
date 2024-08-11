class Solution {
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int findDuplicate(int[] nums) {
        // int count=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return 0;
int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                // cyclic sort apply
                int curr=nums[i]-1;
                if(nums[i]!=nums[curr]){
                    swap(nums,i,curr);
                }
                else{
                    return nums[curr];
                }

            }
            else{
                i++;
            }
        
        }
        return 0;
    }
}