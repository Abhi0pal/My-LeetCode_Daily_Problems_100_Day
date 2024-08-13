class Solution {
    public boolean checkIfPangram(String sentence) {
        String str="zxcvbnmlkjhgfdsaqwertyuiop";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
        
    }
}