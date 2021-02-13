function BubbleSort (arr) {

    for(let i=0; i<arr.length; i++){
        for(let j=0; j<(arr.length-i-1);j++){
            if(arr[j] > arr[j+1]){
                const lesser = arr[j+1];
                arr[j+1]= arr[j];
                arr[j] = lesser;
            }
        }
    }
    return arr;
}

console.log(BubbleSort([-1,2,3,4,55,-11,22]));