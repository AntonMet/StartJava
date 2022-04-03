class IfElseStatementTheme {
    public static void main(String [] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java");
        byte age = 25;
        boolean male = false;
        float growth = 1.9f;
        String name = "Jack";
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше либо равен 20");
        }
        if (!male) {
            System.out.println("Пол женский");
        }
        if (growth < 1.8) {
            System.out.println("Рост меньше 1,80");
        } else {
            System.out.println("Рост больше либо равен 1,8");
        }
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
                System.out.println("Первая буква имени не M и не I" + "\n");
        }

        //Поиск максимального и минимального числа
        System.out.println("Поиск максимального и минимального числа");
        int number1 = 25;
        int number2 = 30;
        if (number1 > number2) {
            System.out.println("Максимальное число: " + number1 + ", минимальное число: " + number2);
        } else {
            System.out.println("Максимальное число: " + number2 + ", минимальное число: " + number1 + "\n");
        }

        //Работа с числом
        System.out.println("Работа с числом");
        int number3 = -21;
        if (number3 == 0) {
            System.out.println("Введён ноль" + "\n");
        }
        if (number3 > 0 & number3 != 0) {
            System.out.println(number3 + " положительное");
        } else if (number3 != 0) {
            System.out.println(number3 + " отрицательное");
        }
        if (number3 % 2 == 0 & number3 != 0) {
            System.out.println(number3 + " четное число");
        } else if (number3 != 0) {
            System.out.println(number3 + " нечётное число" + "\n");
        }

        //Поиск общей цифры в числах
        System.out.println("Поиск общей цифры в числах");
        int number4 = 759;
        int number5 = 959;
        if (number4 / 100 == number5 / 100) {
            System.out.println("В первом разряде одинковая цифра " + (number4 / 100));
        }
        if ((number4 % 100) / 10 == (number5 % 100) / 10) {
            System.out.println("Во втором разряде одинковая цифра " + ((number5 % 100) / 10));
        }
        if (number4 % 10 == number5 % 10) {
            System.out.println("В третьем разряде одинковая цифра " + (number4 % 10) + "\n");
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("Определение буквы, числа или символа по их коду");
        char unknownChar = '\u005A';
        if (unknownChar <= '\u002F') {
            System.out.println(unknownChar + " символ");
        }
        if (unknownChar > '\u002F' & unknownChar < '\u003A') {
            System.out.println(unknownChar + " цифра");
        }
        if (unknownChar > '\u002F' & unknownChar < '\u003A') {
            System.out.println(unknownChar + " цифра");
        }
    }
}