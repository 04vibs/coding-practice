function CompareLists(llist1, llist2) {
    let currentNode1 = llist1;
    let currentNode2 = llist2;
    let arr1 =[];
    let arr2 = [];
    while(currentNode1.next !== null) {
        arr1.push(currentNode1.data);
        currentNode1 = currentNode1.next;
    }
    while(currentNode2.next !== null) {
        arr2.push(currentNode2.data);
        currentNode2 = currentNode2.next;
    }

    if(arr1.length === arr2.length) {
        for(let i =0 ; i < arr1.length; i++){
            if(arr1[i] === arr2[i] ){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
