class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        solve(s.toCharArray(),0,result);
        return result;
    }
    public void solve(char str[] ,int i,List<String>result){
        if(i==str.length){
            result.add(new String(str));
            return;
        }
        if(Character.isLetter(str[i])){
            if(Character.isUpperCase(str[i])){
            str[i]=Character.toLowerCase(str[i]);
            solve(str,i+1,result);
            str[i]=Character.toUpperCase(str[i]);
            } else{
                str[i]=Character.toUpperCase(str[i]);
            solve(str,i+1,result);
            str[i]=Character.toLowerCase(str[i]);
            }
        }
        solve(str,i+1,result);
    }
}