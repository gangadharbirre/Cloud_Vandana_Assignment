function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(' ');

    // Reverse each word
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

let inputSentence = "This is a sunny day";
let reversedWordsSentence = reverseWords(inputSentence);
console.log("Reversed words in the sentence:", reversedWordsSentence);
