function isPalindrome(str) {
    var  i, len = str.length;
    for(i=0;i<len/2;i++) {
        if(str[i] !== str[len-1-i]) {
            return false;
        }
    }
    return true;
}

function palindrome(str) {
    let a =str.split('').reverse().join('');
    if( a== str) { return true; }
    else return false;
}

console.log(palindrome('abccba'));