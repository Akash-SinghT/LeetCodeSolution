class Solution {
    public String reverseWords(String s) {
        Stack<Character> st= new Stack<Character>();
        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)==' ' && st.isEmpty()){
            }
            else{
            st.push(s.charAt(i));
            }
        }
        String res="";
        String ans="";
        while(!st.isEmpty()){
        if(!st.isEmpty()&&st.peek()!=' '){
            res=st.peek()+res;
            st.pop();
            if(!st.isEmpty()&&st.peek()==' ' || st.isEmpty()){
                 ans=ans+res;
                if(!st.isEmpty()){
                    ans=ans +' ';
                }
                res="";
                }
                
                }
        else{
            st.pop();
        }
        }
    return ans;
    }
}