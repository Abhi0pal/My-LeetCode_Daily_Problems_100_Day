#include<vector>
using namespace std;
class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int>pos;
        vector<int>neg;
        vector<int>ans;
        for(auto i:nums){
            if(i<0){
                neg.push_back(i);
            }
            else{
                pos.push_back(i);
            }
        }
        int i=0,j=0;
        while(j<nums.size()/2){
            ans.push_back(pos[i]);
            i++;
            ans.push_back(neg[j]);
            j++;
        }
        return ans;
    }
};