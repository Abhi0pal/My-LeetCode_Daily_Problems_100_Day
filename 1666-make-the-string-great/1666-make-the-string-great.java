import java.util.*;
class Solution {
    public String makeGood(String s) {
        StringBuilder str=new StringBuilder();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&&Math.abs(st.peek()-s.charAt(i))==32){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        return str.reverse().toString();


    }
}