class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        // String result="";
        StringBuilder res=new StringBuilder();
        String say=countAndSay(n-1);
        int count=0;
        for(int i=0;i<say.length();i++){
           count++;
           if(i==say.length()-1||say.charAt(i)!=say.charAt(i+1)){
               //Becoz of this this our code or line our runtime comlexity is--> (17ms)
              // result=result+count+say.charAt(i); //result=count+element
              res.append(count).append(say.charAt(i));
               count=0;
           }
        }
        return res.toString();
    }
}