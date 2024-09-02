class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum=0;
        int rSum=0;
        
        int res=0;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        res=lSum;
        int bLen=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lSum=lSum-cardPoints[i];
            rSum=rSum+cardPoints[bLen];
            bLen--;
            res=Math.max(res,lSum+rSum);
        }
        return res;

        
    }
}