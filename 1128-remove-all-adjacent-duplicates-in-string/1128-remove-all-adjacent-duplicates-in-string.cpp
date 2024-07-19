class Solution {
public:
    string removeDuplicates(string s) {
        stack<int>st;
        for(auto i:s){
            if(!st.empty()&&i==st.top()){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        string str;
        while(!st.empty()){
            str+=st.top();
            st.pop();
        }
        reverse(str.begin(),str.end());
        return str;
      

        
    }
};