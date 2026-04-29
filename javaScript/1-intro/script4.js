// let arr = [];
// let arr = [1, 2, 3, 4, 5];

// console.log(arr);



// let arr;
// arr = [
//   "a",  "test", true, 4.5, [1, 2, 3, true, [0, "f", function name(params) {
//         console.log("array in array");
// }]]];

// console.log(arr);



// let arr = [1, 2, 3];
// arr.push(10);//добавить элемент в конец
// arr.push(20, 30, 40);

// arr.unshift(0);//добавить элемент в начало

// console.log(arr);



// let arr = [1, 2, 3];
// let arr2 = [4, 5, 6];
// arrNew = arr.concat(arr2);//добавить массив в массив

// console.log(arrNew);



// let arr = [1, 2, 3, 4];
// arr.pop();//удалить последний элемент
// arr.shift();//удалить первый элемент 
// arr.splice(2, 2, 100, 200);//начни со 2ого индекса, удали 2 числа, добавь 100 и 200(0, 1, 100, 200)
// arr.splice(2, 0, 100, 200);//начни со 2ого индекса, ничего не удаляй, добавь 100 и 200(1, 2, 100, 200, 3, 4)
// console.log(arr);



// let arr = [1, 2, 3, 4];
// arr.indexOf(1);// вернет элемент по индексу 1 (2)
// arr.lastindexOf(1);// вернет элемент с конца по индексу 1 (3)

// console.log(arr);



// let arr = [1, 2, 3, 40];
// console.log(arr.includes(40));//есть ли в массиве число 40 (false)
// console.log(arr.find(x => x < 3));//вернет число которое меньше 3первое вхождение (1)
// console.log(arr.find(x => x % 2 == 0));//вернет четное число первое вхождение (2)
// console.log(arr.findindex(x => x % 2 == 0));//вернет индекс первого совподающего четного числа первое вхождение (1)



// let arr = [1, 2, 3, 4, 100, 40, 10]
// arr.sort();//сортировка (1, 10, 100, 2, 3, 4, 40)
// arr.sort((a, v) => a - v);//сортировка по порядку(1, 2, 3, 4, 10, 40, 100)
// arr = arr.reverse(); //массив в обратном порядке(100, 40, 10, 4, 3, 2, 1)

// let str = arr.join('-'); //1-2-3-4-100-40-10
// split



// alert("Hello world");
// let val = confirm("Are you happy?");// OK = true, CANCEL = false
// let name = prompt("What is your name?");
// let name = prompt("What is your name?", 'DEFOULT');


// let age = +prompt("How old are you?");
// let age = parseInt(prompt("How old are you?"));// 10 = 10, 10test = 10, test10 = NaN



// console.log(1 + 2);//3
// console.log(1 + 2 + "3");//33
// console.log("1" + 2);//12
// console.log(+"1" + 2);//3
// console.log(-"1" + 2);//3
// console.log(true + 2);//3 (true = 1)
// console.log(false + 2);//2 (true = 0)
// console.log(true + "2");//true2
// console.log(1 + (-"2") + 5);// 1 + (-2) => -1 + 5 = 4