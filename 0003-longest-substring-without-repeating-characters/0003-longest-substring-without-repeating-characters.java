class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr=new int[256];
        int maxi=0;
        for(int i=0;i<s.length();i++){
            Arrays.fill(arr,0);
            for(int j=i;j<s.length();j++){
                if(arr[s.charAt(j)]==1){
                    break;
                }
                int len=j-i+1;
                maxi=Math.max(maxi,len);
                arr[s.charAt(j)]++;
            }
        }
        return maxi;

        
    }
}