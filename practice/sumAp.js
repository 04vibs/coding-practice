
function sumAP(n, d) 
{ 
    // Number of terms 
    let n;
    n /= d; 
  
    return (n) * (1 + n) * d / 2; 
} 

function computeMultiplesSum(n) 
{   n--; 
  
    return sumAP(n, 3) + sumAP(n,5) + sumAP(n, 7) - sumAP(n, 21) - sumAP(n,15) - sumAP(n,35) - sumAP(n,105); 
} 