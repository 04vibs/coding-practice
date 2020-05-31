/**
 * create an empty string called 'result
 * For each character in the string
 *  if the character to the left a space
 *      capitalize it and add it to result
 *  else
 *      Add it to result
 */

 function capitalize(str) {
     let result = str[0].toUpperCase();

     for(let i = 1; i< str.length; i++) {
         if(str[i-1] === ' ') {
            result += str[i].toUpperCase();
         } else {
             result += str[i];
         }
     }
     return result;
 }