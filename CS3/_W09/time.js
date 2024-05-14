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

    c_meridiem.innerText = `${meridiem}`;

    c_hours.innerText = `${hours}`;
    c_minutes.innerText = `${minutes}`;
    c_seconds.innerText = `${seconds}`;
}

closeBtn.onclick = function () {
    c_popup.style.display = 'none';
}