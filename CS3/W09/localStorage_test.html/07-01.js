// btn_name class[이름 저장 버튼]를 찾아 객체 생성
const btn_name = document.querySelector('.btn_name');
// btn_storage class[이름 불러오기]를 찾아 객체 생성
const btn_storage = document.querySelector('.btn_storage');
// input_name id[이름 입력 input]를 찾아 객체 생성
let input_name = document.querySelector('#input_name');
// my_name class[이름이 출력되는 div]를 찾아 객체 생성
let my_name = document.querySelector('.my_name');

btn_name.addEventListener('click', () => {
    let my_name = input_name.value;
    // key 'name'으로 value 'my_name'변수 값 저장
    localStorage.setItem('name', my_name);
    input_name.value = '';
})

btn_storage.addEventListener('click', () => {
    // key 'name'으로 value 값을 불러옴.
    my_name.innerText = localStorage.getItem('name');
})
