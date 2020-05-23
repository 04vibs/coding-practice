/*
    we can convert int to string and can perform reverse operations
    In this we can use Math.sign() to check for the sign +,-
    we can use parseInt(string), it takes string and return number as output
*/

function reverseInt(n) {

    const reversed = n.toString()
    .split('').reverse()
    .join(''); 

    // if(n<0) {
    // return parseInt(reversed) * -1;
    // }
    // return parseInt(reversed);
    // or

    return parseInt(reversed) * Math.sign(n);
}

console.log(reverseInt(-090));