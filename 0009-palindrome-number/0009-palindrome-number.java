class Solution {
    public boolean isPalindrome(int x) {
     int temp,rev=0;
     int n=x;
     while(x>0){
         temp=x%10;
         rev=rev*10+temp;
         x=x/10;
     }   
     if(rev==n){
         return true;
     }
     else {
         return false;
     }
     
    }
}