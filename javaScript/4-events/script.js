function test(msg) {
    console.log(msg + ": You need more practice");
}


let h2 = document.querySelector('h2');

// h2.onclick = test;

//через анонимную функцию
// h2.onclick = function(){
//     console.log("More practice - more experience");
// }

//через лямбду
//  h2.onclick = () =>{
//     console.log("Best way to learn something is to do practice");
    
//  }

//самый правельный способ
h2.addEventListener('click', test);  // без приставки ONclick, вызов функции

//еще варианты 
//через анонимную функцию
h2.addEventListener('click', function(){
    console.log("Do not be lazy");
});

//еще варианты 
//через lamda 

    //одинарный клик
// h2.addEventListener('click',() =>{

    //двойной клик
// h2.addEventListener('dblclick',() => {

    //нажатие кнопки (без отпускания)
// h2.addEventListener('mousedown',() =>{

    //отпускание кнопки
//h2.addEventListener('mouseup',() =>{

    //
// h2.addEventListener('contextmenu',() =>{

    //срабатывает при перемещении мышки по зоне каждый пиксель
// h2.addEventListener('mousemove',() =>{

    //срабатывает 1 раз при вхождении в зону
// h2.addEventListener('mouseenter',() =>{

    //срабатывае при выходе ис зоны
// h2.addEventListener('mouseleave',() =>{

    // срабатывае при прокручивании колесика
h2.addEventListener(' wheel',() =>{
     console.log("Try to understand");
});

//40:00