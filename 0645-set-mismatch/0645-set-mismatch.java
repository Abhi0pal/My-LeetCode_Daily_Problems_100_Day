class Solution {
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] findErrorNums(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int curr=nums[i]-1;
            if(nums[i]!=nums[curr]){
                swap(nums,i,curr);
            }
            else{
                i++;
            }
        }

        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                temp.add(nums[index]); // Add the duplicate number
                temp.add(index + 1);
            }
        }
        return temp.stream().mapToInt(Integer::intValue).toArray();
        
    }
}