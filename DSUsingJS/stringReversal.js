// // approach 1
function reverse(str) {

    const arr = str.split('');
    arr.reverse();
    arr.join('');

    console.log(arr);
 return arr;
}

reverse('hello');


// approach 2

function reverse(str) {
    let reverseString = '';

    for(let characters of str) {
        reverseString = characters + reverseString;
    }
    console.log(reverseString);
    return reverseString;
}

reverse('apple');

// approach 3
// function reverse(str) {
//     return str.split('').reduce((rev, char)=>{
//         return char+ rev;
//     })
// }
// reverse('apple')