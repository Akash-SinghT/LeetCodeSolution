class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> hash = new HashSet<>();
        for(int num : nums){
            hash.add(num);
        }
    return nums.length>hash.size() ? true : false;
    }
}