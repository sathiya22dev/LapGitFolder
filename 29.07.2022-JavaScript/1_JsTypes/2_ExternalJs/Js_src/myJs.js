document.write("external Js file is loaded")
/* WAY1
function sayHello()
{
    window.alert("click pannitiya!! Ok Bye");
}

document.getElementById("myBtn").onclick=sayHello; //note: no "(" ")" after function call
*/



/* WAY2
var a=function sayHello() // a holds as an alias for sayHello
{
    window.alert("click pannitiya!! Ok Bye");
}

document.getElementById("myBtn").onclick=a;     // HERE 'a' refers to 'sayHello' function
*/

/* WAY3*/
var sayHello =function() // no EXPLICIT FUNCTION NAME instead only alias for the function
{
    window.alert("click pannitiya!! Ok Bye"+typeof(null));
}

document.getElementById("myBtn").onclick=sayHello;