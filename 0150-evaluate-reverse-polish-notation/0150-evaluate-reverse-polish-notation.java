class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
         for (String token : tokens) { // Iterate over String tokens
            if (token.equals("*") || token.equals("/") || token.equals("-") || token.equals("+")) {
                int r = st.pop();
                int l = st.pop();
                
                if (token.equals("*")) {
                    st.push(l * r);
                } 
                else if (token.equals("+")) {
                    st.push(l + r);
                } 
                else if (token.equals("-")) {
                    st.push(l - r);
                } 
                else {
                    st.push(l / r); // Integer division
                }
            } 
            else {
                st.push(Integer.parseInt(token)); // Convert numeric string to integer
            }
        }
        return st.pop(); // Final result
    }
    
}