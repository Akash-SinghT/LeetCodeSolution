class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int candidate=0;
        for(int i=0 ;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
         if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int num : nums){
            if(num==candidate){
                count++;
            }
        }
        int z=0;
          if (count > nums.length / 2) {
            z=candidate;
          }
          return z;
    }
}