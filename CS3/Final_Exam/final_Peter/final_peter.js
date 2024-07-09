// 회원가입 폼 처리 함수
function signUp() {
    var newUsername = document.getElementById('newUsername').value;
    var newPassword = document.getElementById('newPassword').value;

    // 사용자 정보를 localStorage에 저장
    localStorage.setItem('username', newUsername);
    localStorage.setItem('password', newPassword);

    alert("회원가입 성공! 사용자 이름: " + newUsername);
    return false; // 폼 제출 방지
}

// 회원가입 페이지 삭제 함수
function deleteSignUpPage() {
    if (confirm("회원가입 페이지를 삭제하시겠습니까?")) {
        document.body.innerHTML = "";
        alert("회원가입 페이지가 삭제되었습니다.");
    }
}

// 로그인 함수
function login() {
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // localStorage에서 사용자 정보 가져오기
    var storedUsername = localStorage.getItem('username');
    var storedPassword = localStorage.getItem('password');

    if (username === storedUsername && password === storedPassword) {
        alert("로그인 성공! 반갑습니다, " + username + "님!!");
        return true; // 폼 제출
    } else {
        alert("로그인 실패! 사용자 이름 또는 비밀번호를 확인하세요.");
        return false; // 폼 제출 방지
    }
}

// 기타 입력 필드 토글 함수
function toggleOtherInput(inputId, enable) {
    document.getElementById(inputId).disabled = !enable;
}

// 기타 입력 필드 내용 확인 및 제출 함수
function checkAndSubmit(input) {
    if (input.value.trim() !== "") {
        alert("입력한 값: " + input.value);
    }
}

// 폼 리셋 함수
function resetForm() {
    var otherInputs = document.querySelectorAll('input[type="text"][id$="Other"]');
    otherInputs.forEach(function(input) {
        input.disabled = true;
    });
}

// DOMContentLoaded 이벤트 리스너 추가
document.addEventListener("DOMContentLoaded", function() {
    // 이미지에 마우스 오버와 아웃 이벤트 리스너 추가
    document.querySelectorAll('.image-section img').forEach(img => {
        img.addEventListener('mouseover', function() {
            img.style.opacity = 0.7;
        });
        img.addEventListener('mouseout', function() {
            img.style.opacity = 1;
        });
    });
});
