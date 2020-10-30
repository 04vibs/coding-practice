let name = {
    firstName: 'Prashant',
    lastName: 'Puri'
}

let printName = function(state) {
    console.log(this.firstName+" ," + this.lastName+ state);
}

let printMyName = printName.bind(name);
printMyName();

// creating custom pollyfill for bind method

Function.prototype.mybind = function(...args) {
    let obj=this;
    params = args.slice(1);
    return function(...args2) {
        obj.call(args[0],[...params,...args2]);
    }
}

let printMyName2 = printName.mybind(name);
printMyName2('india');
