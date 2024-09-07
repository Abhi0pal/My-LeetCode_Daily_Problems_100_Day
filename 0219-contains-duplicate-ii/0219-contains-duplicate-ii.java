class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        int j=0;
        Set<Integer>st=new HashSet<>();
        while(j<nums.length){
            if(Math.abs(i-j)>k){
                st.remove(nums[i]);
                i++;
            }
            if(st.contains(nums[j])){
                return true;
            }
            st.add(nums[j]);
            j++;

        }
        return false;
        
    }
}