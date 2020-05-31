// ---Directions
// check to see if two provided strings are anagrams of eachother.
// one string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation. consider capital letters to be the same as lower case
// --Examples
// anagrams('rail safety','fairy tales') --> true
// anagrams('Hi there','Bye there') --> false

function anagrams(stringA, stringB) {
    const aCharMap = buildCharMap(stringA);
    const bCharMap = buildCharMap(stringB);

    if(Object.keys(aCharMap).length !== Object.keys(bCharMap).length) {
      //  console.log(false);
        return false;
    }

    for(let char in aCharMap) {
        if(aCharMap[char] !== bCharMap[char]) {
            console.log(false);
            return false;
        }
    }
    //console.log(true);
    return true;
}

// helper function to map each character

function buildCharMap(str) {
    const charMap = {};

    for(let char of str.replace(/[^\w]/g,'').toLowerCase()){
        charMap[char] = charMap[char] + 1 || 1;
    }
    return charMap;
}

console.log(anagrams('Rail safety','fairy tales'));