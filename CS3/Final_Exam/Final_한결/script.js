// youtube api가 있다면 영상 검색 가능.

document.addEventListener("DOMContentLoaded", function() {
    const searchBoxes = document.querySelectorAll('.search-box');

    searchBoxes.forEach(searchBox => {
        searchBox.addEventListener('keypress', function(event) {
            if (event.key === 'Enter') {
                const query = searchBox.value;
                const iframeId = searchBox.getAttribute('data-iframe-id');
                searchYouTube(query, iframeId);
            }
        });
    });
});

function searchYouTube(query, iframeId) {
    const apiKey = 'YOUR_YOUTUBE_DATA_API_KEY';
    const apiUrl = `https://www.googleapis.com/youtube/v3/search?part=snippet&maxResults=1&q=${query}&key=${apiKey}`;

    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const videoId = data.items[0].id.videoId;
            const iframe = document.querySelector(`iframe[src*="${iframeId}"]`);
            iframe.src = `https://www.youtube.com/embed/${videoId}`;
        })
        .catch(error => console.error('Error fetching YouTube data:', error));
}

