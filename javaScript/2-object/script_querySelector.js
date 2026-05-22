let h3 = document.children[0].children[1].children[2];

h3.innerHTML = "TOM";//  =  Внутренний html, если написать <mark>TOM</mark> то добавит тег и текст
h3.innterText = "TOM";//  =  Нужен для добавление только текста, добавит все как текст
h3.textContent = "TOM";


document.querySelector
// Находит первый элемент, который соответствует указанному CSS-селектору.
// Что возвращает: Один элемент или null.
// Универсальность: Позволяет искать по ID (#id), классам (.class), тегам (div) и сложным комбинациям.
// Пример: document.querySelector('.container > ul li.item')

document.querySelectorAll
// Находит все элементы, соответствующие указанному CSS-селектору.
// Что возвращает: Статичную (NodeList) коллекцию элементов.
// Особенность: Коллекция «статична» и не меняется, если на страницу позже добавятся новые элементы. Удобна тем, что у неё есть встроенный метод .forEach() для перебора элементов.
// Пример: document.querySelectorAll('.gallery img')

document.getElementById
// Находит один уникальный элемент по его атрибуту id.
// Что возвращает: Один объект элемента или null, если элемент не найден.
// Скорость: Самый быстрый метод поиска.
// Пример: document.getElementById('main-nav')

document.getElementsByClassName
// Находит все элементы с указанным классом.
// Что возвращает: «Живую» (HTMLCollection) коллекцию элементов.
// Особенность: Если на странице появятся новые элементы с этим классом, коллекция обновится автоматически.
// Пример: document.getElementsByClassName('active-button')

document.getElementsByTagName
// Находит все элементы с указанным тегом (например, все ссылки или абзацы).
// Что возвращает: «Живую» коллекцию (HTMLCollection).
// Пример: document.getElementsByTagName('p') (найдет все теги <p>)

document.getElementsByName
// Находит все элементы с конкретным атрибутом name (чаще всего используется для полей форм и радиокнопок).
// Что возвращает: «Живую» коллекцию узлов (NodeList).
// Пример: document.getElementsByName('gender')

// Метод             Что принимает        Что возвращает    Тип коллекции              Популярность сегодня    
// getElementById    Только строку ID     1 элемент         —                          Очень популярный (быстрый)
// querySelector     Любой CSS-селектор   1 элемент         —                          Самый популярный (универсальный)
// querySelectorAll  Любой CSS-селектор   Все совпадения    Статичная (NodeList)       Самый популярный для списков
// getElementsBy...  Только класс/тег/имя Все совпадения    «Живая» (HTMLCollection)   Используется редко (устаревает)   

//выбрать только 1 элемент по id
let h1 = document.getElementById('test');
h1.innerText = 'MOT';

//выбрать элементы по тегу
let arrh2 = document.getElementsByTagName('h2');  //возвращает массив элементов
arrh2[2].innerText = 'OMT';  //изменяет элемент из масства под тегом №2
//пройти по всем тегам h2 и изменить их
for (let h2 of arrh2) {
   h2.innerText = "Учись сука!!!";    
}

//выбрать элементы по className
let boxes = document.getElementsByClassName('box'); //возвращает массив элементов
boxes[0].innerText = 'Learn bitch!!!';  //изменяет нулевой элемент из масства


let elem = document.querySelector('h2'); // elem by tag первое вхождение
                              // .elem by class
                              // #elem by id
elem.innerText = 'Learn@@@';

document.querySelector('h3').innerText = 'You need to learn!!!';// в одну строчку

let h30 = document.querySelector('h3');
h30.innerText = 'You must to know';

h30.style = "color:red; font-size:100px;";//добавление стилей
h30.style = "margin: 20px;"//затирает верхнюю строку

// не затирает предыдущее значение, особый стиль написания свойств(camelCase)
h30.style.color = "red";
h30.style.fontSize = "15px"; 
h30.style.backgroundColor = "green";
 
//('key', "value"); можно добавить important
h30.style.setProperty('color', "red");
h30.style.setProperty('font-size', "20px", 'important');
h30.style.setProperty('background-color', "green");