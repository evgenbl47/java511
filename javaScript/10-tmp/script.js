let questions =[{
    question: "how much 2 + 2? ",
    options: ["10", "20", "30", "4"],
    correct: 3
}, {
    question: "how much 2 + 2? ",
    options: ["10", "20", "30", "4"],
    correct: 3
}, {
    question: "how much 2 + 2? ",
    options: ["10", "20", "30", "4"],
    correct: 3   
}, {
    question: "how much 2 + 2? ",
    options: ["10", "20", "30", "4"],
    correct: 3
}]

let startScreen = document.getElementById('start-screen');
let quizScreen = document.getElementById('quiz-screen');
let resultScreen = document.getElementById('result-screen');

let startBtn = document.getElementById('start-btn');
let nextBtn = document.getElementById('next-btn');
let restartBtn = document.getElementById('restart-btn');

let questionText = document.getElementById('queston-text');
let answersDiv = document.getElementById('answers');
let progress = document.getElementById('progress');

let resultText = document.getElementById('result-text');
let review = document.getElementById('review');
let totalCount = document.getElementById('total-count');