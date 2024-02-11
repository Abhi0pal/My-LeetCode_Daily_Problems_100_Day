import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> sb=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //If opening baces, stack push;
            //if closing baces, Stack pop;
            if(ch=='(' ||ch=='{'||ch=='['){
                sb.push(ch);
            }
            else{
                if(!sb.empty()){
                    char top=sb.peek();
                    if(ch==')' &&top=='('||
                    ch==']' &&top=='['||
                    ch=='}' &&top=='{'){
                        sb.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            } 
        }
        if(sb.empty()){
            return true;
        }
        return false;
 
    }
        
}