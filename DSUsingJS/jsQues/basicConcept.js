// alert(parseInt(010));
// alert(+"010");
// alert(+010);

//console.log((110).toString(2));

var result = [];
for(var i=0; i<10;i++){
    result.push(function() {return i});
}
console.log(result[1]());

console.log(undefined+1);

var str = "hello World";
alert(str.substr(1,4)+","+str.substring(1,4));