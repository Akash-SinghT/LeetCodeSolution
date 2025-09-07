class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<s.length();j++){
            if(s.charAt(i)==s.charAt(j)){
                c++;
                }
                if(c==2){
                    break;
                }

            }
            if(c==1){
        
                return i;
            }
        }
            return -1;

        

    }
}