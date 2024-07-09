document.addEventListener("DOMContentLoaded", function() {
    var homeLink = document.getElementById("home");
    var gameLink = document.getElementById("game");
    var proGamerLink = document.getElementById("pro-gamer");
    var communityLink = document.getElementById("community");
    var eventButton = document.getElementById("eventnews");
    var popup = document.getElementById("popup");
    var closeButton = document.querySelector(".close");

    homeLink.addEventListener("click", function() {
        window.location.href = "http://127.0.0.1:5500/test.html";
    });

    gameLink.addEventListener("click", function() {
        window.location.href = "https://ko.wikipedia.org/wiki/게임";
    });

    proGamerLink.addEventListener("click", function() {
        window.location.href = "https://namu.wiki/w/성민규(프로게이머)";
    });

    communityLink.addEventListener("click", function() {
        window.location.href = "https://talk.op.gg";
    });

    eventButton.addEventListener("click", function() {
        popup.style.display = "block";
    });

    closeButton.addEventListener("click", function() {
        popup.style.display = "none";
    });
    
});

document.addEventListener('DOMContentLoaded', function() {

    var externalImageLink = document.getElementById('move');
    externalImageLink.addEventListener('click', function(event) {
        event.preventDefault();
        window.open('http://www.bosa.co.kr/news/articleView.html?idxno=2174709', '_blank');
    });
});

// 버튼 클릭 이벤트 함수
document.getElementById("eventButton").onclick = function() {
    document.getElementById("popup").style.display = "block"; // 팝업 보이기
  }
  
  // 팝업 닫기 함수
  function closePopup() {
    document.getElementById("popup").style.display = "none"; // 팝업 숨기기
  }
  let p;
let p1;
let colorInterval;
let colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];
let colorIndex = 0;

function init() {
    p = document.getElementById('p');
    p.onmouseover = over;
    p.onmouseout = out;

    p1 = document.getElementById('p1');
    p1.addEventListener("mouseover", over1);
    p1.addEventListener("mouseout", out1);
}

function over() {
    p.style.backgroundColor = 'red';
    console.log("마우스 올림");
}

function out() {
    p.style.backgroundColor = 'white';
}

function over1() {
    p1.style.backgroundColor = 'yellow';
    console.log("마우스 올림");
}

function out1() {
    p1.style.backgroundColor = 'white';
}

function startRainbowEffect(element) {
    colorIndex = 0;
    colorInterval = setInterval(() => {
        element.style.backgroundColor = colors[colorIndex];
        colorIndex = (colorIndex + 1) % colors.length;
    }, 500); 
}

function stopRainbowEffect(element) {
    clearInterval(colorInterval);
    element.style.backgroundColor = 'white';
}

window.onload = init;

function openPopup() {
    document.getElementById('popup').style.display = 'flex';
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
}

