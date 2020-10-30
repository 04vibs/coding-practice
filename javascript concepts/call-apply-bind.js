let name = {
    firstName: "Prashant",
    lastName: "Puri"
}

let name2 = {
    firstName: "Sachin",
    lastName: " Tendulkar"
}

function printName(hometown, state) {
    console.log(this.firstName + " " + this.lastName);
}
// function borrowing

printName.call(name);
printName.call(name2);

// if we want to pass number of arguments 

function printName1(hometown, state) {
    console.log(this.firstName+" " +this.lastName+" from " + hometown +","+state)
}

//call is used to pass number of arguments
printName1.call(name,"delhi","gurgoan");
printName1.call(name2,"mumbai","maharashtra");

// apply is used to pass arrayList
printName1.apply(name,["mumbai","maharashtra"]);
printName1.apply(name2,["delhi","gurgaon"]);

// bind method

let printUsingBindMethod = printName.bind(name);
console.log(printUsingBindMethod,'line 35');

let printusingBind = printName.bind(name2);
console.log(printusingBind, 'line 37');

let printdata1 = printName1.bind(name,"delhi","gurgoan");
let printdata2 = printName1.bind(name2,"mumbai","maharashtra");


printUsingBindMethod();

printusingBind();

printdata1();

printdata2();
