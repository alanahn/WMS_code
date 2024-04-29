const login_id = document.querySelector('#login_input_id');
const login_pw = document.querySelector('#login_input_pw');
const login_btn = document.querySelector('.login_send');

login_btn.addEventListener('click', () => {
    let getID = localStorage.getItem('my_id');
    let getPW = localStorage.getItem('my_pw');

    if (getID != login_id.value && getPW != login_pw.value) {
        alert('ID와 PW 둘 다 일치하지 않습니다.');
        login_id.value = '';
        login_pw.value = '';
    }
    else if (getID != login_id.value) {
        alert('ID가 일치하지 않습니다.');
        login_id.value = '';
        login_pw.value = '';
    }
    else if (getPW != login_pw.value) {
        alert('PW가 일치하지 않습니다.');
        login_id.value = '';
        login_pw.value = '';
    }
    else {
        alert('ID와 PW가 일치합니다.');
        window.location.href="../MyPage_time.html";
    }
})