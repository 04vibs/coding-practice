function reverse(head) {
    if(head == null) {
        return head;
    }

    let currentNode = head;
    let newhead = head;
    let temp;
    while(currentNode !== null) {
         temp = currentNode.prev;
         currentNode.prev = currentNode.next;
         currentNode.next = temp;
         newhead = currentNode;
         currentNode = currentNode.prev;
    }
    return newhead;
}
