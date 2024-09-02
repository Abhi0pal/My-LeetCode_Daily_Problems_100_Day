class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer,Integer>mpp=new HashMap<>();
        int left=0;
        int right=0;
        int maxi=0;
        for(right=0;right<fruits.length;right++){
            // int ele=fruits[0];
            mpp.put(fruits[right],mpp.getOrDefault(fruits[right],0)+1);
            while(mpp.size()>2){
                int ele=mpp.get(fruits[left]); //here we store Value of our key 
                if(ele==1){
                    mpp.remove(fruits[left]);
                }
                else{
                    mpp.put(fruits[left],ele-1);

                }
                left++;

            }
            maxi=Math.max(maxi,right-left+1);
           
        }
        return maxi;
        
    }
}