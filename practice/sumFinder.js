function sumFinder(arr,sum) {
    var len = arr.length;

    for(var i=0; i<len-1;i++) {
        for(var j=i+1;j<len;j++) {
            if(arr[i]+arr[j] == sum) {
                return true;
            }
        }
    }
    return false;
}

console.log(sumFinder([6,4,3,2,1,7],9));


/**
 * Interviewer: What is the time complexity of this function

You: O(n2)

Interviewer: Can you make this better

You: Let me see. I can have an object where i will store the difference of sum and element. And then when i get to a new element and if i find the difference is the object, then i have a pair that sums up to the desired sum.
 */

 function sumFinder2(arr,sum) {
     var differ = {},
     len = arr.length,
     substract;

     for(var i=0; i< len; i++) {
         substract = sum - arr[i];

         if(differ[substract]) return true;
         else differ[arr[i]] = true;
     }
     return false;
 }

 console.log(sumFinder2([6,4,3,2,1,7],9));