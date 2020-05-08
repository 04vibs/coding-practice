function mergeLists(head1, head2) {

    let newnode = new SinglyLinkedListNode();
    // or
    // let newnode = {val: -1, next: null}
    let currentNode = newnode;   
    let node1 = head1;
    let node2 = head2;
    
    while(node1 != null && node2 !==null) {

        if(node1.data < node2.data) {
            currentNode.next = node1;
            node1 = node1.next;
        }else {
            currentNode.next = node2;
            node2 = node2.next;
        }
        currentNode = currentNode.next;

    }  
    if(node1 !== null) {
        currentNode.next = node1;
    } else {
        currentNode.next = node2;
    }

    return newnode.next;
}
