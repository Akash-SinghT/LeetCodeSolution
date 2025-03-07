class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(0,nums,ans,res);
        return res;
    }
    void solve(int start,int nums[],List<Integer> ans,List<List<Integer>> res){
        if(start>=nums.length){
            res.add(new ArrayList(ans));
            return;
        }
        for(int i=start;i<nums.length;i++ ){
            swap(nums,i,start);
            ans.add(nums[start]);
            solve(start+1,nums,ans,res);
            ans.remove(ans.size()-1);
            swap(nums,i,start);
        }
    }
    void swap(int [] nums,int i,int j){
       int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}