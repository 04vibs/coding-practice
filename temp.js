
function computeClosestToZero(ts) {
    // Write your code here
    // To debug: console.error('Debug messages...');
    
    let closest = 0;
    for(let i=0; i < ts.length; i++) {
        if (closest == 0) {
            return closest = ts[i];
        } else if (ts[i] > 0 && ts[i] <= Math.abs(closest)) {
            return closest = ts[i];
        } else if (ts[i] < 0 && ts[i] < abs(closest)) {
           return closest = ts[i];
        }
    }

  return 0;
}