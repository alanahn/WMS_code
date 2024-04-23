// 현재 시간(오전, 오후 / 시 / 분 / 초) 객체 생성
let current_meridiem = document.querySelector('.c_meridiem');
let current_hours = document.querySelector('.c_hours');
let current_minutes = document.querySelector('.c_minutes');
let current_seconds = document.querySelector('.c_seconds');

let meridiem, hours, minutes, seconds = "";

let section_popup = document.getElementById('popup')
let closeBtn = document.getElementById('closeBtn');

//날짜&시간을 입력 받을 수 있는 함수 선언
function current_clock() {
    let date = new Date();
    hours = date.getHours();
    minutes = date.getMinutes();
    seconds = date.getSeconds();

    // 시계 보이게 하기
    section_popup.style.display = 'block';

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
    section_popup.style.display = 'none';
  }