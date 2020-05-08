function reversePrint(head) {
    let currentNode = head;
    let array = [];
   let revarr = [];
    while(currentNode !== null) {
        array.push(currentNode.data);
        currentNode = currentNode.next;
    }
    revarr = array.reverse();
    for(let i=0; i < revarr.length ; i++) {
        console.log(revarr[i]);
    }
}