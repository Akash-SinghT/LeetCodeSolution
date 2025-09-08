class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer>res = new ArrayList<>();
        for(int i: nums1) set.add(i);
        for(int j: nums2){
            if(set.contains(j)){
                res.add(j);
                set.remove(j);
            }
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++)ans[i]=res.get(i);
        return ans;
    }
}