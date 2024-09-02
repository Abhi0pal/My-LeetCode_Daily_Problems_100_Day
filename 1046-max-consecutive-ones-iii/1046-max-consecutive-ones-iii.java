class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int len=0;
        int nZero=0;
        int maxi=0;
        while(right<nums.length){
            if(nums[right]==0){
                nZero++;
            }
            if(nZero>k){
                
                if(nums[left]==0){
                    nZero--;
                }
                left++;
            }
            if(nZero<=k){
                len=right-left+1;
                maxi=Math.max(maxi,len);

            }
            right++;
          
        }
        return maxi;






























    //     int maxi = 0;
    //     int count = 0;
    //     int noZeros = 0;
    
    // for (int i = 0; i < nums.length; i++) {
    //     noZeros=0;
    //     for(int j=i;j<nums.length;j++){
    //         if(nums[j]==0){
    //             noZeros++;
    //          }
    //         if(noZeros<=k){
    //             count=j-i+1;
    //             maxi=Math.max(maxi,count);
    //         } 
    //         else{
    //             break;

    //         }

    //     }
        
    // }
    
    // return maxi;
        
    }
}