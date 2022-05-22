var a = "42.3";
var b = 42.3; //number
var withCoercion = a == b;
var withoutCoercion = a === b;
var array = [true, false];
var array1 = [0,1,2,3];
var array2 = [true, false];
var compareArray = array == array1;
var compareArray1 = array === array2;

console.log(withCoercion);//true
console.log(withoutCoercion);//false
console.log(compareArray);//false
console.log(compareArray1);//false

/*Coercion is when the value of variable is equal and without coercion is when the type of variable is equal.
So, for example, the variable string "a" and the variable number b when compared,
 "a" will to change of type of number  for string.
*/
