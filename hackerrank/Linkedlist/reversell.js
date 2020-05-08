function reverse(head) {
    const singlell = new SinglyLinkedList();
    if(!head.next) {
        return head;
    }
    let first  = head;
    let second = head.next;
    singlell.tail = head;
    
    while(second) {
        const third = second.next;
        second.next = first;
        first = second;
        second = third;
    }
    head.next = null;
    head = first;
    return head;
}
