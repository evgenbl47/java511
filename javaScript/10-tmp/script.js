llet questions =[{
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

let questionText = document.getElementById('question-text');
let answersDiv = document.getElementById('answers');
let progress = document.getElementById('progress');

let resultText = document.getElementById('result-text');
let review = document.getElementById('review');
let totalCount = document.getElementById('total-count');

let currentIndex = 0;

let userAnswers = [];

totalCount.innerText = questions.length;

startBtn.addEventListener('click', startQuiz);
restartBtn.addEventListener('click', startQuiz);
nextBtn.addEventListener('click', handleNext);

function handleNext(){
    let selected = document.querySelector('input[name="answer"]:checked');
    console.log(selected);

    if (!selected) {
        alert('Choose any answer');
        return;
    }

    userAnswers.push(parseInt(selected.value));
    console.log(selected.value);
    
    currentIndex++;
    
    if (currentIndex < questions.length) {
        renderQuestions();
    }else{
        showResult();
    }
    
}

function showResult() {
    let score = 0;

    let revieHtml = '<ul class "list-group">';

    questions.forEach((q, i) =>{
        let userIdx = userAnswers[i];
        let isCorrect = userIdx == q.correct;

        if (isCorrect) {
            score++;
        }


        revieHtml +=`
        <li class="list-group-item>
            <strong>${q.question}</strong>
            Your ansfer: 
            <span class="${(isCorrect ? 'text-success' : 'text-danger')}">${q.options[userIdx]} ${(isCorrect? 'good' : 'bad')}</span>
        </li>
        `;
    });

    revieHtml +=`</ul>`;
}

function startQuiz() {
    currentIndex = 0;
    userAnswers = [];
    // startScreen.classList.add('hidden');
    startScreen.style.display = 'none';
    quizScreen.style.display = 'block';

    renderQuestions();
}

function renderQuestions() {
    let q = questions[currentIndex]
    console.log(q);

    questionText.innerText = q.question;
    progress.innerText = `Question: ${currentIndex+1} of ${questions.length}`;
    answersDiv.innerHTML = '';

    // for(const answer of q.options){
    // }
    q.options.forEach((option, i) =>{
        console.log(option);
        console.log(i);
        
        let label = document.createElement('label');
        label.innerHTML = `
        <input type="radio" name="answer" value="${i}">
        ${option}
        `;
        answersDiv.appendChild(label);
    });
        
    if (currentIndex == questions.length - 1) {
        nextBtn.innerText = 'Finish';
    } else {
        nextBtn.innerText = 'Next';
    }
}