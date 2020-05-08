class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}
class LinkedList {
    constructor(value){
        this.head = {
            value: value,
            next: null
        }
        this.tail = this.head;
        this.length = 1;
    }
    append(value) {
        const newnode = new Node(value);
        this.tail = newnode;
        this.tail.next = newnode;
        this.length++;
        console.log(this,'append');
        return this;
    }
    prepend(value) {
        const newnode = new Node(value);
        newnode.next = this.head;
        this.head = newnode
        this.length++;
        console.log(this,'prepend');
        return this;
    }
    traverseIndex(index) {
        let counter = 0;
        let currentNode = this.head;
        while(counter !== index) {
            currentNode = currentNode.next;
            counter++;
        }
        console.log(currentNode,'traverse')
        return currentNode;
    }
    insert(value,index) {
        const newInsertionNode = new Node(value);
        if(index >= this.length) {
            this.append(value);
        }
        const leaderNode = this.traverseIndex(index-1);
        // newInsertionNode.next = leaderNode.next;
        // leaderNode.next = newInsertionNode;
        console.log(leaderNode,'48');
        const holdingPointer = leaderNode.next;
        console.log(holdingPointer,'50');
        leaderNode.next = newInsertionNode;
        console.log(leaderNode.next);
        newInsertionNode.next = holdingPointer;
        console.log(newInsertionNode.next,'54')
        this.length++;
        console.log(this,'insertion');
        return this;
    }
    remove(index) {
        const leader = this.traverseIndex(index-1);
        const unwantedNode = leader.next;
        leader.next = unwantedNode.next;
        this.length--;
        console.log(this,'remove fun')
        return this;
    }
    printList() {
        const array = [];
        let currentNode = this.head;
        while(currentNode !== null) {
            array.push(currentNode.value);
            currentNode = currentNode.next;
        }
        console.log(array);
        return array;
    }
}

const linkedList = new LinkedList(1);
 linkedList.append(20);
 linkedList.prepend(10);
 linkedList.insert(13,1);
 linkedList.insert(14,1);
 linkedList.append(30);
 linkedList.remove(2);
 linkedList.printList();