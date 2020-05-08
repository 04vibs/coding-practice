function deleteNode(head, position) {
    let currentNode = head;
    let counter = 0;
    
    while(true) {
        if(position === 0) {
            return head.next;
        }
        if(counter === (position-1)) {
             let temp = currentNode.next;
             currentNode.next = temp.next;
             break;
        }
        currentNode = currentNode.next;
        counter++;
    }
    return head;
}