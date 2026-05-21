


//setTimeout запустить код разово
function test() {
    console.log("Hello world");
}

//1s = 100ms
setTimeout(test, 5 * 1000);//   =   через 5 сек вызвать метод test() и на этом всё


setTimeout(() =>{//   =   та-же запись только через lambda выражение
    console.log("Hello World");
}, 5 * 1000);


//setInterval запустить код через интервал постоянно
let count = 1;
setInterval(() => {
    console.log("Count: " + count++);
}, 2 * 1000);//  =  запускает код каждые 2 секунды


//setInterval запустить код через интервал постоянно даже после остановки setInterval будет работать в фоне
let counter = 1;
let isRun = true;
setInterval(() => {
    if (isRun) {
        console.log("Count: " + counter++);
    }

    if (count > 50) {
        isRun = false;
    }
}, 2 * 1000);//  =  запускает код каждые 2 секунды


//setInterval запустить код через интервал постоянно чтобы остановить запоминаем ID процесса и останавливаем командой clearInterval(id) или clearTimeout(id)
let increaser = 1;
let id = setInterval(() => {//   =   Запоминаем IDпроцесса
        console.log("Count: " + increaser++);

    if (count > 50) {
        clearInterval(id);
    }
}, 2 * 1000)//  =  запускает код каждые 2 секунды
