class Solution {
    public int findDuplicate(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
           int index=Math.abs(nums[i]);
            if(nums[index]<0){
                c=Math.abs(nums[i]);
            }
                nums[index]=-nums[index];
            
        }
        return c;
    }
}