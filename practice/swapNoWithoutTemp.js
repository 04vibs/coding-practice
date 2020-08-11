function swapNumber(a,b) {
    console.log('before swap:','a',a,'b:',b);

    b=b-a;
    a=a+b;
    b=a-b;

    console.log('after swap:','a:',a,'b:',b);
}

console.log(swapNumber(4,5));

// bit manipulation alternative way

function swapNumber(a,b) {
    console.log("a:" + a + "b: " + b);

    a=a^b;
    b=a^b;
    a=a^b;

    console.log("a:" + a + "b:" + b);
}

swapNumber(2,3);