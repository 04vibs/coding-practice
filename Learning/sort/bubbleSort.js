const numbers = [99,2,3,1,234,11,33,55,23,232];

function bubbleSort(array) {
    const length = array.length;

    for(let i=0; i<length-1; i++) {
        for(let j=0;j<length-1;j++) {
            if(array[j] > array[j+1]) {
                //swap
                let temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
}

bubbleSort(numbers);
console.log(numbers);