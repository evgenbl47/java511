console.log("Hello");
//AJAX (Asynchronous JavaScript and XML) — это подход к разработке веб-страниц, который позволяет им обмениваться данными с сервером в фоновом режиме и обновлять контент без полной перезагрузки страницы.

//JSON (JavaScript Object Notation) — это простой текстовый формат обмена данными, который легко читается человеком и быстро обрабатывается компьютерами. Он используется для передачи информации между сервером и веб-приложением (например, в связке с AJAX).
//Данные всегда пишутся в фигурных скобках { }, списки (массивы) — в квадратных [ ], а текстовые ключи и значения всегда берутся в двойные кавычки "".
//Пример
//{
//   "name": "Иван",
//   "age": 28,
//   "isEmployee": true,
//   "skills": ["JavaScript", "HTML", "CSS"]
// }

//REST API — это архитектурный стиль взаимодействия между программами, который позволяет им обмениваться данными через интернет с помощью стандартных правил веб-протокола HTTP.
//REST API использует стандартные методы протокола HTTP. Каждый метод выполняет конкретное действие с данными (ресурсами):
// GET — Получить данные (например, загрузить список товаров или профиль пользователя).
// POST — Создать новые данные (например, зарегистрировать аккаунт или отправить пост).
// PUT / PATCH — Обновить существующие данные (изменить пароль или отредактировать комментарий).
// DELETE — Удалить данные (стереть фото или закрыть заказ).

//API (Application Programming Interface — интерфейс программирования приложений) — это набор готовых правил, функций и команд, с помощью которых одна программа может общаться и обмениваться данными с другой программой.

//Если REST API — это конкретный архитектурный стиль работы через интернет, то API в широком смысле — это вообще любой «переводчик» или «мост» между разными цифровыми системами.

//https://api.openweathermap.org/data/2.5/weather?q=Baku&appid=
let api_key = '2ef22e32e29bb09a457ee71bb6841d00b';

async function searchByTitle(title) {

    let result = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${title}&appid=${api_key}&units=metric`);

    let data = await result.json();   
    
    return data;
}

let myForm = document.forms.myForm;
let list = document.querySelector('.list');

myForm.addEventListener('submit', async function() {
    event.preventDefault();

    let cityName = myForm.cityName.value;
    
    if (cityName.trim()) {
        let result = await searchByTitle(cityName);
        console.log(result);

        list.innerHTML += `
            <div class="card">
                <img src="https://openweathermap.org/payload/api/media/file/${result.weather[0].icon}.png" class="card-img-top" alt="img">
                <div class="card-body">
                    <h5 class="card-title">${result.name} ${Math.round(result.main.temp)} &deg;C</h5>
                    <p class="card-text">${result.weather[0].description}</p>
                </div>
            </div>
        `;

    }
    
    myForm.reset();
})