let box = {
    element:document.querySelector('.box'),
    top: 0,
    left: 0
};
console.log("innerHeight: " + innerHeight);
console.log("innerWidth: " + innerWidth);

console.log("outerHeight: " + outerHeight);
console.log("outerWidth: " + outerWidth);

let direction = 'down';
let counter = 0;

// 🎨 Функция для генерации случайного HEX-цвета
function getRandomColor() {
    const letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}

// Или вариант с RGB (можно раскомментировать, если нравится больше):
/*
function getRandomColor() {
    const r = Math.floor(Math.random() * 256);
    const g = Math.floor(Math.random() * 256);
    const b = Math.floor(Math.random() * 256);
    return `rgb(${r}, ${g}, ${b})`;
}
*/

box.element.innerText = counter;
box.element.style.backgroundColor = getRandomColor();

setInterval(() => {
    box.element.style.top = box.top + 'px';
    box.element.style.left = box.left + 'px';

    let prevDirection = direction;
    box.element.style.backgroundColor = getRandomColor();

     if (direction === 'down') {
        box.top += 10;
        if (box.top >= window.innerHeight - 210) direction = 'right';
    } else if (direction === 'right') {
        box.left += 10;
        if (box.left >= window.innerWidth - 140) direction = 'up';
    } else if (direction === 'up') {
        box.top -= 10;
        if (box.top <= 0) direction = 'left'; // Добавьте верхнюю границу при необходимости
    } else if (direction === 'left') {
        box.left -= 10;
        // 🎯 Ключевой момент: если были 'left' и стали 'down' — оборот завершён!
        if (box.left <= 0) {
            direction = 'down';
            // Проверяем, что вернулись в стартовую позицию
            if (prevDirection === 'left' && direction === 'down') {
                counter++; // Увеличиваем счётчик
                box.element.innerText = counter; // Обновляем текст в блоке
                console.log(`🔄 Полный оборот! Счёт: ${counter}`);
            }
        }
        // if (box.left <= 0) direction = 'down'; // Опционально: зацикливание
    }

    console.log(`Direction: ${direction}, Top: ${box.top}, Left: ${box.left}`);

}, 1 * 500);

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