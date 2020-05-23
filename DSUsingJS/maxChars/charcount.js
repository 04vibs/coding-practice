/*
    "Hello There!" = {
        H: 1,
        e: 3,
        l: 2,
        o: 1,
        '': 1,
        T: 1,
        h: 1,
        e: 1,
        r: 1,
        !:1
    }
*/

const string = "Hello There!";
chars = {};

/* 
for(let char of string) {
    if(!chars[char]){
        chars[char] = 1;
    } else {
        chars[char]++;
    }
}

*/

for(let char of string) {
    chars[char] = chars[char] +1 || 1;
}
console.log(chars);