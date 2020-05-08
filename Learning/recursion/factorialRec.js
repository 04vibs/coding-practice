function findFactorialrec(number) {
    if(number ===2) {
        return 2;
    }
    if(number === 1 || number === 0) {
        return 1;
    }
    return number * findFactorial(number-1)
} 

console.log(findFactorialrec(1));