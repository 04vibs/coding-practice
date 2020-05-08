function findFactorialIter(number) {
    let ans = 1;
    if(number === 2) {
        return 2;
    } 
    for(let i=2; i <=number; i++) {
        ans = ans * i; 
    }
    return ans;
} 

console.log(findFactorialIter(5));