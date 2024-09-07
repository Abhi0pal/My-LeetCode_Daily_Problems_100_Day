class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int i=0;
        int j=0;
      int prod=1;
      int maxi=0;

        while(j<nums.length){
            prod=prod*nums[j];
            while(prod>=k){
                prod=prod/nums[i];
                i++;
            }
            maxi=maxi+(j-i+1);
            j++;
        }
        return maxi;
    }
}