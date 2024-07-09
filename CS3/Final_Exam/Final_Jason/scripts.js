document.addEventListener('DOMContentLoaded', () => {
    const canvas = document.getElementById('drawingCanvas');
    const ctx = canvas.getContext('2d');
    const clearButton = document.getElementById('clearCanvas');
    let drawing = false;

    canvas.width = canvas.offsetWidth;
    canvas.height = canvas.offsetHeight;

    canvas.addEventListener('mousedown', () => {
        drawing = true;
    });

    canvas.addEventListener('mouseup', () => {
        drawing = false;
        ctx.beginPath();
    });

    canvas.addEventListener('mousemove', draw);

    clearButton.addEventListener('click', () => {
        ctx.clearRect(0, 0, canvas.width, canvas.height);
    });

    function draw(event) {
        if (!drawing) return;
        ctx.lineWidth = 5;
        ctx.lineCap = 'round';
        ctx.strokeStyle = '#000';

        ctx.lineTo(event.clientX - canvas.offsetLeft, event.clientY - canvas.offsetTop);
        ctx.stroke();
        ctx.beginPath();
        ctx.moveTo(event.clientX - canvas.offsetLeft, event.clientY - canvas.offsetTop);
    }

    const form = document.getElementById('survey-form');
    const submitButton = form.querySelector('button[type="submit"]');

    const satisfactionClassesInput = document.getElementById('satisfaction-classes');
    const satisfactionClassesValue = document.getElementById('satisfactionClassesValue');
    const satisfactionFacilitiesInput = document.getElementById('satisfaction-facilities');
    const satisfactionFacilitiesValue = document.getElementById('satisfactionFacilitiesValue');
    const satisfactionTeachersInput = document.getElementById('satisfaction-teachers');
    const satisfactionTeachersValue = document.getElementById('satisfactionTeachersValue');
    const satisfactionEnvironmentInput = document.getElementById('satisfaction-environment');
    const satisfactionEnvironmentValue = document.getElementById('satisfactionEnvironmentValue');

    satisfactionClassesInput.addEventListener('input', () => {
        satisfactionClassesValue.textContent = satisfactionClassesInput.value;
    });
    satisfactionFacilitiesInput.addEventListener('input', () => {
        satisfactionFacilitiesValue.textContent = satisfactionFacilitiesInput.value;
    });
    satisfactionTeachersInput.addEventListener('input', () => {
        satisfactionTeachersValue.textContent = satisfactionTeachersInput.value;
    });
    satisfactionEnvironmentInput.addEventListener('input', () => {
        satisfactionEnvironmentValue.textContent = satisfactionEnvironmentInput.value;
    });

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        if (!form.checkValidity()) {
            const firstInvalid = form.querySelector(':invalid');
            firstInvalid.scrollIntoView({ behavior: 'smooth' });
            firstInvalid.focus();
            return;
        }

        const name = document.getElementById('name').value;
        const email = document.getElementById('email').value;
        const satisfactionClasses = satisfactionClassesInput.value;
        const satisfactionFacilities = satisfactionFacilitiesInput.value;
        const satisfactionTeachers = satisfactionTeachersInput.value;
        const satisfactionEnvironment = satisfactionEnvironmentInput.value;
        const feedback = document.getElementById('feedback').value;

        const templateParams = {
            to_name: '(테스트)', // 수신자의 이름
            from_name: name,
            reply_to: email,
            satisfaction_classes: satisfactionClasses,
            satisfaction_facilities: satisfactionFacilities,
            satisfaction_teachers: satisfactionTeachers,
            satisfaction_environment: satisfactionEnvironment,
            message: feedback
        };

        emailjs.send('service_kydlpgr', 'template_ad0n6xc', templateParams, 'K3o_awzQTsLfRPfPR')
            .then(function(response) {
                console.log('SUCCESS!', response.status, response.text);
                alert('설문조사가 성공적으로 제출되었고 이메일이 전송되었습니다!');
            }, function(error) {
                console.log('FAILED...', error);
                alert('이메일 전송에 실패했습니다.');
            });
    });

    form.addEventListener('input', () => {
        submitButton.disabled = !form.checkValidity();
    });

    const welcomeMessages = [
        "안녕하세요! 설문조사를 시작합니다",
        "안녕하세요! 설문조사를 시작할께요!",
        "만나서 반가워요! 설문조사를 시작해볼까요?",
        "찾아주셔서 감사해요! 설문조사를 시작합니다!"
    ];

    const welcomeMessage = document.getElementById('welcome-message');
    const welcomeText = document.getElementById('welcome-text');
    const surveyContainer = document.getElementById('survey-container');

    // 랜덤으로 환영 메시지 설정
    welcomeText.textContent = welcomeMessages[Math.floor(Math.random() * welcomeMessages.length)];

    setTimeout(() => {
        welcomeMessage.classList.add('hidden');
        setTimeout(() => {
            welcomeMessage.style.display = 'none';
            surveyContainer.classList.remove('hidden');
        }, 1000);
    }, 2000);
});
