import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] x=s.toCharArray();
        char[] y=t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x,y);


        
    }
}