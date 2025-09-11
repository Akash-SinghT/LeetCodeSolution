class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,ans=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()<j-i+1){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0){
                    map.remove(s.charAt(i));
                }
                i++;
            }
            if(map.size()==j-i+1){
                ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
        
    }
}