class Solution {
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int ele=nums[i];
            if(nums[i]!=nums[ele-1]){
                swap(nums,i,ele-1);
            }
            else{
                i++;
            }

        }
        
       for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            temp.add(j+1);
        }
       }

       
        return temp;


        
    }
}