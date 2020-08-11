function mergeSortedArray(a,b) {
    var merged =[];
    aElm = a[0];
    bElem = b[0];
    i = 1,
    j = 1;

    if(a.length == 0) { return b;}
    if(b.length == 0) { return a;}

    /*
    if aElm or bElm exists we will insert to merged Array
    (will go inside while loop)
    to insert: aElm exists and bElm doesn't exists 
    or both exists and wElm < bElm this is the the critical part of the example
    */

    while(aElm || bElem) {
        if((aElm && !bElem) || aElm< bElem) {
            merged.push(aElm);
            aElm = a[i++];
        } else {
            merged.push(bElem);
            bElem = b[j++];
        }
    }
    return merged;
}

console.log(mergeSortedArray([2,5,6,9],[1,2,3,29]));
