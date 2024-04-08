class Solution {
public:
    int majorityElement(vector<int>& nums) {

        // int element=0;
        
        // for(int i=0;i<nums.size();i++){
        //     int count=0;
        //     for(int j=0;j<nums.size();j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.size()/2){
        //             return nums[i];
        //         }
           
        // }  
        // return -1;


        map<int,int>mpp;
        for(int i=0;i<nums.size();i++){
            mpp[nums[i]]++;
        }
        for(auto i:mpp){
            if(i.second>(nums.size()/2)){
                return i.first;
            }
        }
        return -1;
    }
};