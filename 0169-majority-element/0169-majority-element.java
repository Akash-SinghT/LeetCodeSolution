class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> h= new HashMap<>() ;
       int x=0;
       for(int i=0;i<nums.length;i++){
        if(h.containsKey(nums[i])){
            h.put(nums[i],h.get(nums[i])+1);
        }
        else{
            h.put(nums[i],1);
        }
       }
       Set<Integer> keySet = h.keySet();
       for(Integer k : keySet){
        if(h.get(k)>nums.length/2){
            System.out.print(k);
            x=k;
        }
       }
       return x;
    }
}