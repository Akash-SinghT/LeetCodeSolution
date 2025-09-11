/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    const words = s.split(' ');
    for(let i=0;i<pattern.length;i++){
        for(let j=i+1;j<pattern.length;j++){
            if((pattern[i]==pattern[j])!==(words[i]==words[j])){
                return false;
            }
        }

    }
    return true;
};