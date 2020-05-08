
function recfibonacci(n) {
    if(n<2) {
        return n;
    }
    return recfibonacci(n-1) + recfibonacci(n-2);
}

console.log(recfibonacci(1));