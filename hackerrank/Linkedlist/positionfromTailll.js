function getNode(head, positionFromTail) {
    let currentNode = head;
    let result = head;
    let index =0;
    
    while(currentNode !== null) {
        currentNode = currentNode.next;
        if(index++ > positionFromTail ) {
            result = result.next;
        }
    }
    return result.data;
}
