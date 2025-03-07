class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        solve(1,n,k , ans,res);
        return res;
    }
    void solve(int start,int n,int k,List<Integer> ans ,List<List<Integer>> res){
        if(ans.size()==k){
            res.add(new ArrayList(ans));
            return;
        }
        for(int i=start;i<n+1;i++){
            ans.add(i);
            solve(i+1,n,k,ans,res);
            ans.remove(ans.size()-1);
        }
    }
}