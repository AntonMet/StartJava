import java.util.Scanner;

class CalculatorTest {
    public static void main(String[] args) {
        boolean flag = true;
        String continuation = "yes";
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            Calculator calculatorTest = new Calculator();
            System.out.print("Введите первое число: ");
            calculatorTest.setFirstNumber(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculatorTest.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculatorTest.setSecondNumber(scanner.nextInt());
            calculatorTest.setResult();
            System.out.println("Результат: " + calculatorTest.getResult());
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            continuation = scanner.next();
            if (continuation.equals("no")) {
            flag = false;
            }
        }
    scanner.close();
    }
}