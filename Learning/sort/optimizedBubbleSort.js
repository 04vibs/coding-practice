const numbers = [99,2,3,1,234,11,33,55,23,232];

function bubbleSort(array) {
    const length = array.length;
    let swapped;
    for(let i=0; i<length-1; i++) {
        swapped = false;
        for(let j=0;j<length-i-1;j++) {
            if(array[j] > array[j+1]) {
                //swap
                let temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                swapped = true;
            }
        }
        if(swapped = false) {
            break;
        }
    }
}

bubbleSort(numbers);
console.log(numbers);