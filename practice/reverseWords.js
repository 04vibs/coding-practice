function reverseWords(str) {
    var rev = [];
    wordLen =0;

    for(var i=str.length-1; i>=0; i--) {
        if(str[i]== ' ' || i==0) {
            rev.push(str.substr(i,wordLen+1));
            wordLen =0;
        } else {
            wordLen++;
        }
    }
    return rev.join(' ');
}

// built in method
function reverseWords1(str) {
    return str.split(' ').reverse();
} 


/**
 * reverse in place
Question: If you have a string like "I am the good boy". How can you generate "I ma eht doog yob"? Please note that the words are in place but reverse.

Answer: To do this, i have to do both string reverse and word reverse.
 */

 function reverseInPlace(str) {
     return str.split(' ').reverse().join(' ').split('').reverse().join('');
 }
 console.log(reverseInPlace('I am the good boy'));