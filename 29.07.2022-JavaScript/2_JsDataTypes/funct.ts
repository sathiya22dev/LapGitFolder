function add1(x?:number,y?:number,z?:number):number{
    return x+y+z;
}

let numAr:number[]=[4,5,6];

console.log(`add is${add1(...numAr)} `); 

//destructure
let userDetails={
    firstName:"sathiya",
    lastName:"Pazhani",
    userName:"sathiya22dev"
};

let {firstName,userName:un}=userDetails;
console.log(`by Destructuring `,userDetails,`firstName is ${firstName}`,`un is ${un}`);
let {lastName:ln}=userDetails;
console.log(`by Destructuring `,userDetails,`ln is ${ln}`);


let strAr1:string[]=["hi","dai","doi"];
let [el1,secEl,lastEl]=strAr1;
console.log(`secEl is ${secEl}`);

function addWithRestt(x?:number,...remainingArr)
{
    console.log("x is"+x);
    console.log(`remainingArr is ${remainingArr}`);
    let sum=x;
    for(let y of remainingArr)
    {
        sum=sum+y;
    }
    console.log(`sum of`,x,`and`,remainingArr,`is`,sum);
}
addWithRestt(...numAr);