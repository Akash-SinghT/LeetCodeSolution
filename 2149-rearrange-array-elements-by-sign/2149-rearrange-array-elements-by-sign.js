/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let positives = [];
    let negatives = [];
    
    for (let num of nums) {
        if (num > 0) positives.push(num);
        else negatives.push(num);
    }
    
    let res = [];
    let i = 0, j = 0;
    while (i < positives.length || j < negatives.length) {
        if (i < positives.length) res.push(positives[i++]);
        if (j < negatives.length) res.push(negatives[j++]);
    }
    return res;
};
