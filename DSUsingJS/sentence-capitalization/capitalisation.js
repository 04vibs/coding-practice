/** Directions
 * Write a function that accepts a string. The function should 
 * capitalize the first letter of each word in the string then 
 * return the capitalized string.
 * 
 * --Examples
 *  capitalize('a short sentence') --> 'A Short Sentence'
 *  capitalize('a lazy fox') --> 'A Lazy fox'
 
    // approach
    1. Make an empty array 'words'
    2. Split the input string by spaces to get an array
    3. For each word in the array
    4. upper case the first letter of the word
    5. join first letter with the rest of the string
    6. Push result into 'words' array
    7. Join 'words' into a string and return it
 */

function capitalize(str) {
    const words = [];

    for(let word of str.split(' ')) {
        words.push(word[0].toUpperCase() + word.slice(1));
    }
    return words.join(' ');
}

console.log(capitalize('hello world how are you'))