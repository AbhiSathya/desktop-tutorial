const  Name = prompt("Enter your name: ");

const age = prompt("Enter your age: ");
console.log(`name: ${Name} \n age: ${age}`);

const obj = {
    p1 : Name ,
    p2: age ,
}
const result = document.createElement("div");
const ul = document.createElement('ul');
for(const key in obj) {
    const li = document.createElement('li');
    li.textContent = `${key} : ${obj[key]}`;
    ul.appendChild(li);
    // console.log(`${keysd} : ${obj[key]}`);
}
result.appendChild(ul);
document.body.appendChild(result);
result.addEventListener("mouseover",function() {
    alert("pakshi raja khagender ki Jai!!!!!")
});

//Destructuring

const {p1:temp1, p2:temp2}  = obj;

console.log(temp1, temp2);

const arr = [23,45,67234,76,67];

const [a,b,c, ...restOF]=arr;
console.log(a,b,c,restOF);
let demo = (...args)=> {
    console.log(args);
}
demo(arr);