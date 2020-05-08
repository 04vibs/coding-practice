function insertNodeAtHead(head, data) {
    const newNode = new SinglyLinkedListNode(data);
    let currentNode = head;
    newNode.next = currentNode;
    currentNode = newNode;
    return currentNode;
}