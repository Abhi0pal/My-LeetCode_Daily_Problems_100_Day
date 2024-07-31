class Solution {
public:
    vector<int> findArray(vector<int>& pref) {
        vector<int>arr;
        arr.push_back(pref[0]);
        for(int i=1;i<pref.size();i++){
            int e1=pref[i];
            int e2=pref[i-1];
            int e3=e1^e2;
            arr.push_back(e3);
        }
        return arr;
        
    }
};