class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> temp=new ArrayList<>();
        if(nums.length==1){
            return temp;

        }
        int i=0;
        Arrays.sort(nums);
        
        while(i<nums.length-1){
            int j=i+1;
            if(nums[i]!=nums[j]){
                // something somethin
                i++;

            }
            else{
                temp.add(nums[i]);
                i++;
            }

        }
        return temp;
        
    }
}