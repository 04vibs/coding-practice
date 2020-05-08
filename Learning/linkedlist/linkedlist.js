// Traverse function to be written again
class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}
class LinkedList {
    constructor(value) {
        this.head = {
            value: value,
            next: null
        }
        this.tail = this.head;
        this.length = 1;
    }

    append(value) {
        const newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
        console.log(this);
        return this;
    }

    prepend(value) {
        const newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
        return this;
    }

    insert(index, value) {
     if(index >= this.length) {
         return this.append(value);
     }  
     const newNode = new Node(value); 
     const leader = this.traverseToIndex(index-1);
     const holdingPointer = leader.next;
     leader.next = newNode;
     newNode.next = holdingPointer;
     this.length++;
     console.log(this,'insert');
     return this.PrintList();
    }

    PrintList() {
        const array = [];
        let currentNode = this.head;
        while(currentNode != null) {
            array.push(currentNode.value);
            currentNode = currentNode.next;
        }
        console.log(array,'printlist');
        return array;
    }

    traverseToIndex(index) {
        let counter = 0;
        let currentNode = this.head;
        console.log(currentNode,'line 62')
        while(counter !== index) {
            console.log(currentNode);
            currentNode = currentNode.next;
            counter++;
        }

        return currentNode;
    }

    remove(index) {
        //check params
        const leader = this.traverseToIndex(index-1);
        const unwanterNode = leader.next;
        leader.next = unwanterNode.next;
        this.length--;
        return this.PrintList();
    }
}
 
const linkedList = new LinkedList(5);

 linkedList.prepend(2);
 linkedList.append(3);
 linkedList.prepend(1);
 linkedList.insert(2,4);
 linkedList.PrintList();
