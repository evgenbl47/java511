


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