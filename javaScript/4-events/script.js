function test(msg) {
    console.log(msg + ": You need more practice");
}


let h2 = document.querySelector('h2');

// показать / скрыть блок
// let span = document.querySelector('span');
// span.style.display = 'block'/'none'

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
h2.addEventListener('wheel',() =>{
     console.log("Try to understand");
});



let input = document.querySelector('input');
//в скобках можно написать параметр и получить его состояние
////срабатывает при нажатии клавиши
// input.addEventListener('keydown', ()=>{
//     console.log(event); //выводит информацию о состоянии клавиатуры, какие клавиши были нажаты

//срабатывает при отпускании клавиши
// input.addEventListener('keyup', ()=>{  

// input.addEventListener('keyup', ()=>{  
//         console.log(event.key); //печатает нажатую клавишу
//         console.log(input.value); //весть текст в поле
        
// })

//если нажата клавиша f отменяет дефолтное поведение - не дает ввести клавишу
// input.addEventListener('keydown', ()=>{
//     if(event.key == f){
//         event.preventDefault();
//     }
// })


//проверяет число ли это
function isNumeric(num) {
    for(let i = 0; i < 10; i++){
        if(num == i) return true;
    }

    return false;
}

//если в поле попытаться ввести число то ничего не получится
input.addEventListener('keydown', ()=>{  //добавляет евент слушатель
    if (isNumeric(event.key)) { //проверяет - введенный символ число?
        event.preventDefault(); //если число - то отменяет дефолтное поведение 
    }
})
//40:00