/*
Given a string, return the character that is most commony used in the string.
-- example
// maxChar("abccccccccd") === "c"
// maxChar("apple 12311232311111111") === "1"
*/

function maxChar(str) {

    const charMap = {};
    let max = 0;
    let maxChar = '';

    // iterate to get the count
    for(let char of str) {
        if(charMap[char]) {
            charMap[char]++;
        } else {
            charMap[char] = 1;
        }
    }
    
    for(let char in charMap) {
        if(charMap[char] > max) {
            max = charMap[char];
            maxChar = char;
        }
    }

    return maxChar;
}

console.log(maxChar("Prashant Puri"))