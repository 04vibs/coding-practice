// stack implementation using linkedList
class Node {
    constructor(value) {
        this.value = value;
        this.next = null
    }
}

class stack {
    constructor() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    peek() {
        return this.top;
    }

    push(value) {
        const newNode = new Node(value);
        if(this.length === 0) {
            this.top = newNode;
            this.bottom = newNode;
        } else {
            // add to the top
            const holdingPointer = this.top;
            this.top = newNode;
            this.top.next = holdingPointer;
        }
        this.length++;
        console.log(this);
        return this;
    }
    pop() {
        if(!this.top) {
            return null;
        }
        if(this.top === this.bottom) {
            this.bottom = null;
        }
        const holdingPointer = this.top;
        this.top = this.top.next;
        this.length--;
        console.log(this);
        return this;
    }
}

    const myStack = new stack();   
    myStack.push(120);
    myStack.push('google');
    myStack.push('prashant');
    myStack.pop();
    myStack.pop();