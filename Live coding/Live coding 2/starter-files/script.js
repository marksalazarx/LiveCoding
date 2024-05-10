function fetchAnswer() {
    fetch('https://yesno.wtf/api')
        .then(response => response.json())
        .then(data => {
            const answerDiv = document.getElementById('answer');
            answerDiv.textContent = data.answer;
            
            setTimeout(() => {
                answerDiv.textContent = ''; 
            }, 5000);
        })
        .catch(error => console.error('Error al obtener la respuesta:', error));
}

document.getElementById('fetchButton').addEventListener('click', fetchAnswer);