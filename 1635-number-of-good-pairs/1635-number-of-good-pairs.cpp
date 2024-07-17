class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        vector<pair<int,int>>arr;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]==nums[j]){
                    arr.push_back({i,j});
                }
            }
        }
        return arr.size();
    }
};