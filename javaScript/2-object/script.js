let box = {
    element:document.querySelector('.box'),
    top: 0,
    left: 0
};
console.log("innerHeight: " + innerHeight);
console.log("innerWidth: " + innerWidth);

console.log("outerHeight: " + outerHeight);
console.log("outerWidth: " + outerWidth);


setInterval(() => {
    let count = 0
    box.element.style.top = box.top + 'px';
    box.element.style.left = box.left + 'px';

    let direction = 'down';


    if (box.top < window.innerHeight - 210) {
        box.top += 10;
        console.log("box.top: " + box.top);
    }else if(box.left < window.innerWidth - 140){
        box.left += 10;
        console.log("box.left: " + box.left);
    }else if(box.top > window.innerHeight - 210){
        box.top -= 10;
        console.log("box.top: " + box.top);
    }

}, 1 * 50);

// let direction = 'down'; // Начинаем движение вниз

// function animate() {
//     // Обновляем позицию в зависимости от текущего направления
//     if (direction === 'down') {
//         box.top += 10;
//         console.log("box.top: " + box.top);
//         if (box.top >= window.innerHeight - 210) direction = 'right';
//     } else if (direction === 'right') {
//         box.left += 10;
//         console.log("box.left: " + box.left);
//         if (box.left >= window.innerWidth - 140) direction = 'up';
//     } else if (direction === 'up') {
//         box.top -= 10;
//         console.log("box.top: " + box.top);
//         if (box.top <= 0) direction = 'left'; // Добавьте верхнюю границу при необходимости
//     } else if (direction === 'left') {
//         box.left -= 10;
//         console.log("box.left: " + box.left);
//         if (box.left <= 0) direction = 'down'; // Опционально: зацикливание
//     }

//     // Применяем стили
//     box.element.style.top = box.top + 'px';
//     box.element.style.left = box.left + 'px';

//     // Планируем следующий кадр
//     requestAnimationFrame(animate);
// }

// requestAnimationFrame(animate);