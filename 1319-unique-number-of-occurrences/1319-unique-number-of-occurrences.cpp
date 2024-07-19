class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        vector<int>vc;
        map<int,int>mpp;
        for(auto i:arr){
            mpp[i]++;
        }
        set<int>st;
        for(auto i:mpp){
            st.insert(i.second);

        }
        return st.size()==mpp.size();
        
    }
};