let currentInput = '';

function appendCharacter(char) {
    currentInput += char;
    document.getElementById('result').value = currentInput;
}

function clearScreen(type) {
    if (type === 'C') {
        currentInput = currentInput.slice(0, -1);
    } else if (type === 'AC') {
        currentInput = '';
    }
    document.getElementById('result').value = currentInput;
}

function calculate() {
    try {
        let result = eval(currentInput);
        document.getElementById('result').value = result;
        currentInput = result.toString();
    } catch (error) {
        document.getElementById('result').value = 'Error';
    }
}
