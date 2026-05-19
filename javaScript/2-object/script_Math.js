console.log("Math");


let num = 3.14000;
console.log(num.toFixed(2));//   ==  показывать 2 знака после запятой


//round
console.log(Math.round(num)); //    ==  обычное математическое округление
console.log(Math.floor(num)); //    ==  округление в меньшую сторону
console.log(Math.ceil(num));  //    ==  округление в большую сторону


//random
console.log(Math.random()); //0-1


function random(min, max) {
    return (Math.random() * (min - max + 1) + min);
}

random(10, 20);


