/*
alternate soln
slice function

pseudo code

1. create empty 'chunked' array
2. create 'index' start at 0
3. while index is less than array.length
4. Push a slice of length 'size' from 'array' into 'chunked'
5. Add 'size' to 'index'
*/
function chunk(array,size) {

    const chunked = [];
    let index =0;
    while(index < array.length) {
        chunked.push(array.slice(index,index+size));
        index += size;
    }
    return chunked;
}

console.log(chunk([1,2,3,4,5,6],2));