function insertNodeAtTail(head, data) {
    const newNode = new SinglyLinkedListNode(data);
    if(head === null) {
        head = newNode;
        return head;
    } else {
        let currentNode = head;
        while(currentNode.next !== null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode
        return head;
    }
    
}