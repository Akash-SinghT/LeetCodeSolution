class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        solve(0,nums,ans,res);
        return res;
    }
    void solve(int i,int [] arr, List<Integer> ans, List<List<Integer>> res){
        if(i==arr.length){
            res.add(new ArrayList(ans));
            return;
        }
        solve(i+1,arr,ans,res);
        ans.add(arr[i]);
        solve(i+1,arr,ans,res);
        ans.remove(ans.size()-1);

    }
}