<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객체 생성 및 활용</title>
</head>
<body>
<h3>객체 생성 및 활용</h3>
<hr>
<script>
	// Date 객체 생성
	let today = new Date(); 

	// Date 객체의 toLocaleString() 메소드 호출
	document.write("현재 시간 : " + today.toLocaleString() + "<br>");
``
	// String 객체 생성
	let mystr= new String("자바스크립트 공부하기");
	document.write("mystr의 내용 : " + mystr + "<br>");
	document.write("mystr의 길이 : " + mystr.length + "<br>");
	// mystr.length=10; // 이 문장은 오류이다.
</script>
</body>
</html>
