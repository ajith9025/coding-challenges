const numbers = [1, 2, 3, 4, 5];
const evenNumbers = numbers.filter(num => num % 2 === 0);
console.log(evenNumbers); // [2, 4]
const firstEvenNumber = numbers.find(num => num % 2 === 0);
console.log(firstEvenNumber); // 2