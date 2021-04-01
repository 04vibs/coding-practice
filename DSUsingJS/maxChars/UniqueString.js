function UniqueString(str){
    var uniqueChar = {};

    for(var i=0; i<= str.length;i++){
        if(uniqueChar[str[i]] != null){
            uniqueChar[str[i]] = 1;
            return false;
        } else {
            uniqueChar[str[i]] = 0;
        }
    }
    return true;
}

console.log(UniqueString('david'));