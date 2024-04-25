class Solution {
public:
    int singleNumber(vector<int>& nums) {
        map<int,int>mpp;
        for(int i=0;i<nums.size();i++){
            mpp[nums[i]]++;
        }
        for(auto num:nums){
            if(mpp[num]!=3){
                return num;
            }
        }
        return 0;
        
    }
};