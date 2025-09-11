/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    for(let i=0;i<s.length;i++){
        for(let j=i+1;j<s.length;j++){
                if((s[i]==s[j]) !== (t[i]==t[j])){
                    return false;
                }
        }

    }
    return true;
};