const l1=10;
//i=20;
const obj={"name":"sathiya"};
//obj={"rollno":42};
obj["rollno"]=42;
console.log(obj);

let nullv1:null;
nullv=null;
//nullv=undefined;
//nullv="india";
//nullv=10;
//nullv=false;
//nullv={"hi":"all"};

let undefinedv1:undefined;
undefinedv=undefined;
//undefinedv=null;
//undefinedv=false;
//undefinedv=10;
//undefinedv="false";
//undefinedv={"hi":"all"};

let stringv1:string;
stringv="sathiya";
//stringv=10;
//stringv=false;
//stringv=null;
//stringv=undefined;

let booleanv1:boolean;
booleanv=false;
//booleanv=null;
//booleanv=undefined;
//booleanv="true";
//booleanv=1;

let numberv1:number;
numberv=10;
numberv=0o22;
numberv=0x33;
numberv=0b011;

let user1={
    "firstName": "sathiya",
    "lastName" : "pazhani",
    "userName" : "sathiya22dev",
    "getUserName" : function(){
        return this.userName;
    }
};

function add1(x?,y?,z?){
    return x+y+z;
}

let numArr1=[4,5,6];

console.log(`add is${add1(numArr1)} `); 

//added coment
