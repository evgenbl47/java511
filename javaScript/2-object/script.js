function test() {
    console.log("Hello from test func");
    
}

test();

let person = {
    firstName: "Tom",
    lastName:  "Smith",
    fatherName: "Ithan",
    age: 30,
    child:{
        firstChildName: "Tomik",
        lastChildName:  "Simpson",
        fatherChildName: "Arktur",
        age: 30,
    },
    hi: function () {
        console.log(`Hello ${this.firstName} ${this.lastName}!`);
    },
    arr: ["", "", ""],      //массив
    dogs:[                  //массив собак
        {
            name: "Totoshka",
            age: 2
        },
        {
            name: "Nota",
            age: 4
        },
        {
            name: "Martin",
            age: 4
        }
    ],
    foo:test //вызов функции 
}

console.log(person.firstName);
console.log(person.lastName);
console.log(person.age);
console.log(person["age"]);
console.log(person.phone); //undefind
person.phone = "8-009-111-00-11";
console.log(person);
delete person.fatherName;
person.foo();


let user = new Object(); //тоже создание нового обьекта
user.name = "Tom";


class Preson{ ///ещё один способ создания нового обьекта
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
}

let p = new Preson("Tom", 38);
