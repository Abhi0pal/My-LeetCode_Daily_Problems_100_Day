class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int totalXor=0;
        for(auto& i:nums){
            totalXor=totalXor^i;
        }
        int diff=totalXor^k;
        return __builtin_popcount(diff);
        
    }
};