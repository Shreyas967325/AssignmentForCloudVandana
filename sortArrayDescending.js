function sortArrayDescending(array) {
    for (let i = 0; i < array.length - 1; i++) {
      for (let j = i + 1; j < array.length; j++) {
        if (array[i] < array[j]) {
          const temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
  


const array = [5, 3, 2, 1, 4];
sortArrayDescending(array);

console.log(array); 
