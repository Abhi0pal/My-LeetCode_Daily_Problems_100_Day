class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        StringBuilder res=new StringBuilder();
        String str=countAndSay(n-1);
        int count=1;

        for(int i=0;i<str.length();i++){
            // String str1=str.charAt(i);
            if(i==str.length()-1||str.charAt(i)!=str.charAt(i+1)){
                res.append(count).append(str.charAt(i));
                count=1;
            }
            else{
                count++;
                
            }
        }
        return res.toString();
    }
}