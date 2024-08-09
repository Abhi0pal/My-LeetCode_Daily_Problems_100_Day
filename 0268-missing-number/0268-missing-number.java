class Solution {
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void cyclic(int[] arr){
    int start=0;
    while(start<arr.length){
        int curr=arr[start];
        if(arr[start]<arr.length&&arr[start]!=arr[curr]){
            swap(arr,start,curr);
        }
        else{
            start++;
        }
    }

    }
    public int missingNumber(int[] nums) {
        cyclic(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;

        
    }
}