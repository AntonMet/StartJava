class Calculator {
    public static void main(String[] args) {
        int firstNumber = 3;
        int secondNumber = 12;
        char sign = '^';
        int result = 0;
        if (sign == '+') {
            result = firstNumber + secondNumber;
        } else if (sign == '-') {
            result = firstNumber - secondNumber;
        } else if (sign == '*') {
            result = firstNumber * secondNumber;
        } else if (sign == '/') {
            result = firstNumber / secondNumber;
        } else if (sign == '^') {
            result = firstNumber;
            for (int i = 0; i < secondNumber - 1; i++) {
                result *= firstNumber;
            }
        } else if (sign == '%') {
            result = firstNumber % secondNumber;
        }
        System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);
    }
}