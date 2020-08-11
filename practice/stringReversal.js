// approach-1
function reverse1(str) {
    var rtnStr= '';
    for(var i=str.length-1; i>=0;i--) {
        rtnStr += str[i];
    }
    return rtnStr;
}

console.log(reverse('you are a nice dude'));

/*
Interviewer: You know concatenation performed well in modern browsers but becomes slow in older browsers like IE8. Is there any different way, you can reverse a string?

Answer: sure. i can use an array and also add some checking. if string is null or other than string this will fail. let me do some type check as well. Using this array is like using string buffer in some server side languages.
 */

function reverse2(str) {
    var rtnstr = [];
    if(!str || typeof str != 'string' || str.length <2) return str;

    for(var i=str.length-1; i>=0;i--) {
        rtnstr.push(str[i]);
    }
    return rtnstr.join('');
}

/**
 * Interviewer: What is the run time complexity?

You: O(n)

Interviewer: Can you make this better?

You: I can loop through half of the index and it will save little bit. (this is kind of useless, might not impress interviewer)
 */

function reverse3(str) {
    str = str.split('');
    var len = str.length,
        halfIndex = Math.floor(len / 2) - 1,
        revStr;
    for (var i = 0; i <= halfIndex; i++) {
      revStr = str[len - i - 1];
      str[len - i - 1] = str[i];
      str[i] = revStr;
    }
    return str.join('');
  }
     
/**
 * Interviewer: That works, but can u do it in a recursive way?

You: sure.
 */

 function reverse4(str) {
     if(str === "") {
         return "";
     } else {
         return reverse(str.substr(1)) + str.charAt(0);
     }
 }
/**
 *Interviewer: Can you use any build in method to make it little cleaner?

You: yes.
 
 */
function reverse5(str) {
    if(!str ||str.length <2) return str;
    return str.split('').reverse().join('');
} 

/**
 * Question: Can you make reverse function as string extension?

Answer: I need to add this function to the String.prototype and instead of using str as parameter, i need to use this
 */

 String.prototype.reverse6 = function() {
     if(!this || this.length<2) return this;
     return this.split('').reverse().join('');
 }

 console.log('abc'.reverse6());