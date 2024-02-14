import java.util.*;

class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                stack.push(ch);
            } else if(ch == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Matching opening parenthesis found, pop it from the stack
                } else {
                    stack.push(ch); // No matching opening parenthesis found, add current closing parenthesis to stack
                }
            }
        }
        
        return stack.size(); // Remaining elements in the stack represent unmatched opening parentheses
        
        
        
    }
}




// import java.util.*;
// class Solution {
//     public int minAddToMakeValid(String s) {
//         Stack<Character>sb=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch=='('){
//                 sb.push(ch);
//             }
//             else{
//                 char top=sb.peek();
//                 if(ch==')'){
//                     while(sb.peek()!='('){
//                         if(top=='('){
//                             continue;
//                         }
//                         sb.pop();
//                     }
//                 }

//             }
//         }
        
//         return sb.size();
        
        
//     }
// how to tackle this test case "()"
// }