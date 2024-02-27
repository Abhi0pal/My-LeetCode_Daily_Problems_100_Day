class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int k=0;k<=31;k++){
            int temp=1<<k;
            int one=0;
            int zero=0;
            for(int num:nums){
                if((num&temp)==0){
                    zero++;
                }
                else{
                    one++;
                } 
            }
            if(one%3==1){
                result=(result|temp);
            }

        }
        return result;
    }
}