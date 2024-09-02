function reverseArrayExtraArray(arr) {
    const reversedArr = arr.slice().reverse();
    process.stdout.write("Reversed Array: ");
    reversedArr.forEach(element => process.stdout.write(element + " "));
}
const originalArr = [1, 2, 3, 4, 5];
reverseArrayExtraArray(originalArr);