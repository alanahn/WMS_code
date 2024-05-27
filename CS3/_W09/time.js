let c_meridiem = document.querySelector('.c_meridiem');
let c_hours = document.querySelector('.c_hours');
let c_minutes = document.querySelector('.c_minutes');
let c_seconds = document.querySelector('.c_seconds');

let meridiem, hours, minutes, seconds = "";

let c_popup = document.getElementById('c_popup');
let closeBtn = document.getElementById('closeBtn');

function c_clock() {
    c_popup.style.display = 'flex';

    let date = new Date();
    hours = date.getHours();
    minutes = date.getMinutes();
    seconds = date.getSeconds();

    //만약 시간 12 작아 > meridiem = '오전'
    //그렇지않다면 > meridiem = '오후'
    if (hours < 12) meridiem = '오전';
    else meridiem = '오후';

    c_meridiem.innerText = `${meridiem}`;

    c_hours.innerText = `${hours}`;
    c_minutes.innerText = `${minutes}`;
    c_seconds.innerText = `${seconds}`;
}

closeBtn.onclick = function () {
    t_popup.style.display = 'none';
    c_popup.style.display = 'none';
}

let t_popup = document.getElementById('t_popup');
let t_closeBtn = document.getElementById('t_closeBtn');
let time = document.querySelector('.time');
let start = document.querySelector('.start');
let stop = document.querySelector('.stop');

let time_interval;
let timer = 0;

start.addEventListener('click', () => {
    start.disabled = true;
    time_interval = setInterval(() => {
        timer += 1;
        time.innerText = `${timer}`;
    }, 1000);
})

stop.addEventListener('click', () => {
    clearInterval(time_interval);
    start.disabled = false;
})

function timer_clock() {
    t_popup.style.display = 'flex';
}

t_closeBtn.onclick = function () {
    t_popup.style.display = 'none';
    c_popup.style.display = 'none';
    timer = 0;
    clearInterval(time_interval);
    time.innerText = `${timer}`;
}

