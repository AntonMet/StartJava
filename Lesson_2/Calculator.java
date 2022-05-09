class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char sign;
    private int result;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getResult() {
        return result;
    }

    public void setResult() {
        switch (sign) {
        case '+':
            result = result = firstNumber + secondNumber;
            break;
        case '-':
            result = firstNumber - secondNumber;
            break;
        case '*':
            result = firstNumber * secondNumber;
            break;
        case '/':
            result = firstNumber / secondNumber;
            break;
        case '^':
            for (int i = 0; i < secondNumber - 1; i++) {
                result *= firstNumber;
            }
            break;
        case '%':
            result = firstNumber % secondNumber;
            break;
        }
    }
}