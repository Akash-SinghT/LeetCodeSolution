/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    let pre=1,suf=1,max=-Infinity;
    for(let i=0;i<nums.length;i++){
        pre*=nums[i];
        suf*=nums[nums.length-1-i];
        max= Math.max(max,suf,pre);
            if(suf===0) suf=1;
            if(pre===0) pre=1;
        }
    
    return max;
};