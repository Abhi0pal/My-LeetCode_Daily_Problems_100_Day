class Solution {
    public String breakPalindrome(String palindrome) {
       char[] chr=palindrome.toCharArray();
       if(chr.length<2){
           return "";
       }
       for(int i=0;i<chr.length/2 ;i++){
           //if any character not an 'a';
           if(chr[i]!='a'){
               chr[i]='a';
               return String.valueOf(chr);
           }
       }
       chr[chr.length-1]='b';//that simpoly means ki all are a
        return String.valueOf(chr);

    }
}