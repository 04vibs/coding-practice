function palindrome(str) {

    let stringval = str;

    let a = str.split('').reverse().join('');
    if(a == stringval) {
        return true
        // 'it is a palindrome'
    } else{
        return false;
        // 'not a palindrome';
    }
}

let b = palindrome('baaaab');
console.log(b);

// alternate soln

function palindrome1(str) {
    const reversed = str
    .split('')
    .reverse()
    .join('');

    return str === reversed;
}

console.log(palindrome1('abba'));


// alternate sol 1
// not an ideal solution as it will run more checks
// here we will use every function which is applicable only on arrays
// so we will first convert string into array.

function palindrome2(str) {
    return str.split('').every((char,i)=>{
        // first element is compared to last
        // second compared to second last and so on
        return char === str[str.length-i-1];
    })
}

console.log(palindrome2('missisaga'));