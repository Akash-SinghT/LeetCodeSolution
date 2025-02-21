class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> has = new HashSet<>();
        List<Integer> hah = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            has.add(nums[i]);
        }
        for(int i=1;i<nums.length+1;i++){
            if(!has.contains(i)){
            hah.add(i); }
        }
        return hah;

    }
}