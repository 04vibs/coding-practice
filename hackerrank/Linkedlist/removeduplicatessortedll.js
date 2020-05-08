function removeDuplicates(head) {

    let currentNode = head;
    while(currentNode !== null && currentNode.next !== null) {
        if(currentNode.data == currentNode.next.data){
            currentNode.next = currentNode.next.next;
        }else{
            currentNode = currentNode.next;
        }
    }
    return head;
}