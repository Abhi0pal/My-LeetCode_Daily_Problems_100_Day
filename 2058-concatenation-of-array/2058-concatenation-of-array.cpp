class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n=nums.size();
        int N=2*n;
        vector<int>finalArray(N);
        for(int i=0;i<N;i++){
            if(i<n){
                finalArray[i]=nums[i];
            }
            else{
                finalArray[i]=nums[i%n];
            }
        }
        return finalArray;
        
    }
};