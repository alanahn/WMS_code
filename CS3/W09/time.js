// 현재 시간(오전, 오후 / 시 / 분 / 초) 객체 생성
let current_meridiem = document.querySelector('.c_meridiem');
let current_hours = document.querySelector('.c_hours');
let current_minutes = document.querySelector('.c_minutes');
let current_seconds = document.querySelector('.c_seconds');

let meridiem, hours, minutes, seconds = "";

let c_popup = document.getElementById('c_popup')
let closeBtn = document.getElementById('closeBtn');

//날짜&시간을 입력 받을 수 있는 함수 선언
function current_clock() {
    // 시계 보이게 하기
    c_popup.style.display = 'block';

    let date = new Date();
    hours = date.getHours();
    minutes = date.getMinutes();
    seconds = date.getSeconds();

    // alert(hours+":"+minutes+":"+seconds)

    
    /* 아이들이 해볼 수 있도록? */
    if(hours < 12) meridiem = '오전';
    else meridiem = '오후';

    current_meridiem.innerText = `${meridiem}`;
    /* ----------------------- */

    //c_hours, c_minutes, c_seconds 요소에 시,분,초 표시
    current_hours.innerText = `${hours}`;
    current_minutes.innerText = `${minutes}`;
    current_seconds.innerText = `${seconds}`;
}

closeBtn.onclick = function() {
    // 시계 안보이게 하기
    c_popup.style.display = 'none';
    t_popup.style.display = 'none';
}

//타이머
let t_popup = document.getElementById('t_popup')
let t_closeBtn = document.getElementById('t_closeBtn');

function timer_clock() {
    t_popup.style.display = 'block';
}


let time = document.querySelector('.time');
const start = document.querySelector('.start');
const stop = document.querySelector('.stop');

let timer_intertal;
let timer = 0;

start.addEventListener('click', () => {
    // setInterval(() => { 이벤트 영역}, 시간 간격(ms))
    timer_intertal = setInterval(() => {
        timer += 1;
        time.innerText = `${timer}`;
    }, 1000);
})

stop.addEventListener('click', () => {
    //clearInterval(멈출함수)
    clearInterval(timer_intertal);
})

t_closeBtn.onclick = function() {
    // 시계 안보이게 하기
    t_popup.style.display = 'none';
    c_popup.style.display = 'none';
}

//타이머 미션 => 가능하면 미션 추가하기
const reset = document.querySelector('.reset');

reset.addEventListener('click', () => {
    timer = 0;
    time.innerText = `${timer}`;
    clearInterval(timer_intertal);
})
