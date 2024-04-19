let c_num = Math.floor(Math.random()*(99)) + 1;

const Btn_go = document.querySelector('.btn-go');
const Btn_reset = document.querySelector('.btn-reset');

let count = 0;

Btn_go.addEventListener('click',() => {
    count += 1;

    let p_num = document.getElementById('nmb').value;
    p_num = Number(p_num);

    document.getElementById('nmb').value = '';

    if(p_num <= 0 || p_num >= 100) {
        document.getElementById('alarm').innerHTML = "잘 못 입력하셨습니다.";
    } else {
        document.getElementById('alarm').innerHTML = "입력 숫자 : ${p_num}";

        if(c_num > p_num) {
            document.getElementById('result').innerHTML = "Up";
        } else if (c_num < p_num) {
            document.getElementById('result').innerHTML = "Down";
        } else { 
            document.getElementById('result').innerHTML = "Good!";
            document.getElementById('alarm').innerHTML = "횟수 : ${count}";
        }
    }
})

Btn_reset.addEventListener('click', () => {
    count = 0;

    c_num = Math.floor(Math.random()*(99)) + 1;

    document.getElementById('result').innerHTML = '';
    document.getElementById('nmb').value = '';
    document.getElementById('alarm').innerHTML = '1에서 99 사이의 숫자를 입력해주세요!';
})