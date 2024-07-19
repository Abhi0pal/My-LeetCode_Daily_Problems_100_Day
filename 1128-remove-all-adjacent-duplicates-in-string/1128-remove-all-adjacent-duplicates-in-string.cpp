class Solution {
public:
    string removeDuplicates(string s) {
        stack<char>st;
        for(auto i:s){
            if(!st.empty()&&st.top()==i){
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