function add1(x, y, z) {
    return x + y + z;
}
var numAr = [4, 5, 6];
console.log("add is".concat(add1.apply(void 0, numAr), " "));
//destructure
var userDetails = {
    firstName: "sathiya",
    lastName: "Pazhani",
    userName: "sathiya22dev"
};
var firstName = userDetails.firstName, un = userDetails.userName;
console.log("by Destructuring ", userDetails, "firstName is ".concat(firstName), "un is ".concat(un));
var ln = userDetails.lastName;
console.log("by Destructuring ", userDetails, "ln is ".concat(ln));
var strAr1 = ["hi", "dai", "doi"];
var el1 = strAr1[0], secEl = strAr1[1], lastEl = strAr1[2];
console.log("secEl is ".concat(secEl));
function addWithRestt(x) {
    var remainingArr = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        remainingArr[_i - 1] = arguments[_i];
    }
    console.log("x is" + x);
    console.log("remainingArr is ".concat(remainingArr));
    var sum = x;
    for (var _a = 0, remainingArr_1 = remainingArr; _a < remainingArr_1.length; _a++) {
        var y = remainingArr_1[_a];
        sum = sum + y;
    }
    console.log("sum of", x, "and", remainingArr, "is", sum);
}
addWithRestt.apply(void 0, numAr);
