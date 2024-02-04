class Solution {
        public int findDays(int[] weights, int cap) {
            int day=1;
            int load=0;
            for(int i=0;i<weights.length;i++){
                if(load+weights[i]>cap){
                    day=day+1;
                    load=weights[i];
                }
                else{
                    load=load+weights[i];
                }
            }
            return day;
        }

    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i:weights){
            max=Math.max(i,max);
            sum=sum+i;
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int NoDays=findDays(weights,mid);
            if(NoDays<=days){
                high=mid-1;
            }
            else{
                    low=mid+1;
            }
        }
        return low;
        
    }
}