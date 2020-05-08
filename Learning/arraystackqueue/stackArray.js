// stack implementation using Array

class stack {
    constructor() {
        this.array = [];
    }
    peek(){
        this.array[this.array.length-1];
        console.log(this);
        return this;
    }
    push(value) {
        this.array.push(value);
        console.log(this);
        return this;
    }
    pop() {
        this.array.pop();
        console.log(this);
        return this;
    }
}

const mystack = new stack();
mystack.push(10);
mystack.push(100);
mystack.pop();
mystack.peek();