class Solution {
    public static int calculateTotal(int arr[],int div){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans+=Math.ceil((double)arr[i]/div);
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int ele:nums){
            high=Math.max(high,ele);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(calculateTotal(nums,mid)<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}