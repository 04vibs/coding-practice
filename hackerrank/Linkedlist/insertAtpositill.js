function insertNodeAtPosition(head, data, position) {
    const newNode = new SinglyLinkedListNode(data);
    let currentNode = head;
    let previousNode = null;
    let counter = 0;
    while(true) {
        if(counter === position){
            let temp = currentNode;
            previousNode.next = newNode;
            newNode.next = temp;
            break;
        }
        previousNode = currentNode;
        currentNode = currentNode.next;
        counter++;
    }
    return head;
    
}