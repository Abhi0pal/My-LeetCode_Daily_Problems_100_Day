class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        map<int,int>mpp;
        vector<int>vc;
        for(auto i:nums){
            mpp[i]++;            
        }
        
        for(auto i:mpp){
            
            if(i.second==1){
                vc.push_back(i.first);
            }
        }
        return vc;
        
    }
};