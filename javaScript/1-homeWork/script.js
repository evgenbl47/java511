// Запрашивать данные у пользователя необходимо с помощью prompt(), а выводить результат с помощью alert().

// Задания.
// 1. Запросите у пользователя его имя и выведите в ответ: «Привет, его имя!». 
// let answer = prompt("Введите имя");
// alert("Привет, его имя: " + answer + "!");

// 2. Запросите у пользователя год его рождения, посчитайте, сколько ему лет и выведите результат. Текущий год укажите в коде как константу. 
// const currentYear = 2026;
// let birthdayUser = +prompt("Введите ваш код рождения");
// alert("Вам " + (currentYear - birthdayUser) + " лет");

// 3. Запросите у пользователя длину стороны квадрата и выведите периметр такого квадрата. 
// function calcSquare(side){
//     return side * 4;
// }

// let sqarePerimeter = +prompt("Введите длину стороны квадрата");
// alert("Периметр квадрата со стороной " + sqarePerimeter + ": " + calcSquare(sqarePerimeter));

// 4. Запросите у пользователя радиус окружности и выведите площадь такой окружности. 
// function calcRound(radius){
//     return Math.PI * Math.pow(radius, 2);
// }

// let radius = +prompt("Введите радиус окружности");
// alert("Площадь окружности: " + calcRound(radius));

// 5. Запросите у пользователя расстояние в км между двумя городами и за сколько часов он хочет добраться. 
// Посчитайте скорость, с которой необходимо двигаться, чтобы успеть вовремя.
// let distance = +prompt("Введите расстояние между городами в километрах:");
// let hours = +prompt("За сколько часов хотите добраться?");

// function calcSpeed(distance, hours) {
//     let speed = distance / hours;
//     return speed;
// }

// console.log("Необходимая скорость: " + calcSpeed(distance, hours) + " км/ч");

// 6. Реализуйте конвертор валют. Пользователь вводит доллары, 
// программа переводит в евро. Курс валюты храните в константе. 
// const dollarToEuroRate = 0.91; // Пример курса доллара к евро
// let dollars = +prompt("Введите сумму в долларах:");

// alert("Эквивалент в евро: " + calcEuro(dollars));

// function calcEuro (dollars) {
//     let euros = dollars * dollarToEuroRate;
//     return euros;
// }

// 7. Пользователь указывает объем флешки в Гб. Программа должна посчитать сколько файлов размером в 820 Мб помещается на флешку. 
// let flashDriveGb = +prompt("Введите объем флешки в Гб");
// let fileSizeMb = 820;

// function calcAmountFiles (capacityGB) {
//    let flashDriveMb = capacityGB * 1024;
//    let filesCount = Math.floor(flashDriveMb / fileSizeMb);
//    return filesCount;
// }

// alert("Количество файлов, которое помещается на флешку: " + calcAmountFiles(flashDriveGb));

// 8. Пользователь вводит сумму денег в кошельке и цену одной шоколадки. 
// Программа выводит сколько шоколадок может купить пользователь и сколько сдачи у него останется. 
// const total = +prompt("Введите сумму денег в кошельке");
// const cost = +prompt("Введите цену одной шоколадки");

// function chocolateCalc(total, cost) {
//    let chocolateAmount = Math.floor(total / cost);
//    return chocolateAmount;
// }

// function changeCalc(total, cost) {
//    let changeAmount = total % cost;
//    return changeAmount;
// }

// alert("Можно купить шоколадок: " + chocolateCalc(total, cost) + ",сдачи у него останется:" + changeCalc(total, cost));

// 9. Запросите у пользователя трехзначное число и выведите его задом наперед. 
// Для решения задачи вам понадобится оператор % (остаток от деления). 
// let numberThird = +prompt("Введите трехзначное число");
// let reverses = [
//    Math.floor(numberThird / 100),
//    Math.floor(numberThird / 10) % 10,
//    numberThird % 10
// ].reverse();
// // let reverses = splits.reverse();

// alert(reverses);

// 10. Запросите у пользователя целое число и выведите в ответ, четное число или нет. 
// В задании используйте логические операторы. В задании не надо использовать if или switch.
// let number = +prompt("Введите целое число");
// let result = (number % 2) == 0;

// alert("Число четное: " + result)