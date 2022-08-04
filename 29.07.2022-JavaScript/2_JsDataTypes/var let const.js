var l1 = 10;
//i=20;
var obj = { "name": "sathiya" };
//obj={"rollno":42};
obj["rollno"] = 42;
console.log(obj);
var nullv1;
nullv = null;
//nullv=undefined;
//nullv="india";
//nullv=10;
//nullv=false;
//nullv={"hi":"all"};
var undefinedv1;
undefinedv = undefined;
//undefinedv=null;
//undefinedv=false;
//undefinedv=10;
//undefinedv="false";
//undefinedv={"hi":"all"};
var stringv1;
stringv = "sathiya";
//stringv=10;
//stringv=false;
//stringv=null;
//stringv=undefined;
var booleanv1;
booleanv = false;
//booleanv=null;
//booleanv=undefined;
//booleanv="true";
//booleanv=1;
var numberv1;
numberv = 10;
numberv = 18;
numberv = 0x33;
numberv = 3;
var user1 = {
    "firstName": "sathiya",
    "lastName": "pazhani",
    "userName": "sathiya22dev",
    "getUserName": function () {
        return this.userName;
    }
};
function add1(x, y, z) {
    return x + y + z;
}
var numArr1 = [4, 5, 6];
console.log("add is".concat(add1(numArr1), " "));
//added coment
