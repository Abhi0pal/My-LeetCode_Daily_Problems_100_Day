class Solution {
    public int compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        int j=0;
        int count=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==chars[j]){
                if(i==j){
                    str.append(chars[i]);
                }
                count++;
            }
            else{
                if(count>1){
                    str.append(count);
                }
               j=i;
               str.append(chars[i]);
               count=1;
            }  
        }
        if(count>1){
            str.append(count);

        }
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return str.length();


        
    }
}