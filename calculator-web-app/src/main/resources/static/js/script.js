// Add event listeners to the calculator buttons
document.querySelectorAll('.calculator-button').forEach(button => {
  button.addEventListener('click', () => {
    // Get the button value
    const value = button.textContent;
    
    // Perform the calculation based on the button value
    if (value === '=') {
      calculate();
    } else if (value === 'C') {
      clear();
    } else {
      appendToDisplay(value);
    }
  });
});

// Function to append the button value to the display
function appendToDisplay(value) {
  const display = document.querySelector('.calculator-display');
  display.value += value;
}

// Function to clear the display
function clear() {
  const display = document.querySelector('.calculator-display');
  display.value = '';
}

// Function to perform the calculation
function calculate() {
  const display = document.querySelector('.calculator-display');
  const expression = display.value;
  
  try {
    const result = eval(expression);
    display.value = result;
  } catch (error) {
    display.value = 'Error';
  }
}